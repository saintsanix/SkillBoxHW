package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;
    private LocalDate takeTime;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now().plusMonths(1);
    }

    @Override
    public void take(double amountToTake) {
        takeTime = LocalDate.now();
        if (takeTime.isAfter(lastIncome)) {
            super.take(amountToTake);
        }
    }
}
