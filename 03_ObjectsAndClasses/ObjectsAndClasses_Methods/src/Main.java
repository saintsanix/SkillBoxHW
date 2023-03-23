public class Main {

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Milk", 40,3);
        basket1.add("Кукуруза", 80);
        basket1.print("Первая");

        Basket basket2 = new Basket();
        basket2.add("Шоколад", 30, 1, 100);
        basket2.add("Мыло", 30, 1, 60);
        basket2.print("\nВторая");
        basket2.getTotalWeight();

        System.out.println("\nОбщее количество товаров во всех корзинах: " + Basket.getTotalAmountAllBaskets());
        System.out.println("Общая стоимость товаров во всех корзинах: " + Basket.getTotalPriceAllBaskets());
        System.out.println("Cредняя цена товара во всех корзинах: " + Basket.getAveragePriceItemsBasket());
        System.out.println("Cредняя стоимость корзины: " + Basket.getAveragePriceBaskets());
    }
}
