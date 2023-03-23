public class Basket {

    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private int limit;
    private double weight = 0;
    private double totalWeight = 0;
    private static int totalPriceAllBaskets = 0;
    private static int totalAmountAllBaskets = 0;
    private static int averagePriceItemsBasket = 0;
    private static int averagePriceBaskets = 0;

    public static int getTotalAmountAllBaskets() {
        return totalAmountAllBaskets;
    }

    public static int getTotalPriceAllBaskets() {
        return totalPriceAllBaskets;
    }

    public static int getAveragePriceItemsBasket() {
        return averagePriceItemsBasket;
    }

    public static double getAveragePriceBaskets() {
        return averagePriceBaskets;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. - " + "цена: " + price + " - " + "вес: " + weight;
        totalWeight = totalWeight + weight;
        totalAmountAllBaskets = totalAmountAllBaskets + 1;
        totalPriceAllBaskets = totalPriceAllBaskets + price;
        averagePriceItemsBasket = totalPriceAllBaskets / totalAmountAllBaskets;
        averagePriceBaskets = totalPriceAllBaskets / Basket.count;

    }

    public double getTotalWeight() {
        System.out.println("Общий вес корзины: " + totalWeight);
        return totalWeight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
