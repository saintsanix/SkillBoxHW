import java.util.HashMap;
import java.util.Random;

public class Bank {

    private HashMap<String, Account> accounts = new HashMap<>();
    private final Random random = new Random();

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами.
     * Если сумма транзакции > 50000, то после совершения транзакции,
     * она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка
     * счетов (как – на ваше усмотрение)
     */
    public void transfer(String fromAccountNum, String toAccountNum, long amount) {

        if (fromAccountNum.equals(toAccountNum)) {
            return;
        }

        Account fromAccount = getAccount(fromAccountNum);
        Account toAccount = getAccount(toAccountNum);

        if (fromAccountNum.compareTo(toAccountNum) > 0) {
            synchronized (fromAccount) {
                synchronized (toAccount) {
                    doTransfer(fromAccount, toAccount, amount);
                }
            }
        } else {
            synchronized (toAccount) {
                synchronized (fromAccount) {
                    doTransfer(fromAccount, toAccount, amount);
                }
            }
        }
    }

    private void doTransfer(Account fromAccount, Account toAccount, long amount) {

        if (!fromAccount.isBlock() && !toAccount.isBlock() && (fromAccount.getBalance() >= amount && amount > 0)) {

            fromAccount.getMoney(amount);
            toAccount.setMoney(amount);
            System.out.println("Операция прошла успещно!");
            boolean isBlock = false;

            if (amount > 50_000) {
                try {
                    isBlock = isFraud(fromAccount.getAccNumber(), toAccount.getAccNumber(), amount);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            fromAccount.setBlock(isBlock);
            toAccount.setBlock(isBlock);

        } else {
            System.err.println("Один или оба аккаунта заблокированы!" +
                    "\n Либо проверьте наличие переводимой суммы.");
        }
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {

        return getAccount(accountNum).getBalance();
    }

    private synchronized Account getAccount(String accountNum) {
        return accounts.getOrDefault(accountNum, null);
    }

    public void setAccount(Account account) {
        accounts.put(account.getAccNumber(), account);
    }
}