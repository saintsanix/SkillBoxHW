public class Main {

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Milk", 40,3);
        basket1.add("��������", 80);
        basket1.print("������");

        Basket basket2 = new Basket();
        basket2.add("�������", 30, 1, 100);
        basket2.add("����", 30, 1, 60);
        basket2.print("\n������");
        basket2.getTotalWeight();

        System.out.println("\n����� ���������� ������� �� ���� ��������: " + Basket.getTotalAmountAllBaskets());
        System.out.println("����� ��������� ������� �� ���� ��������: " + Basket.getTotalPriceAllBaskets());
        System.out.println("C������ ���� ������ �� ���� ��������: " + Basket.getAveragePriceItemsBasket());
        System.out.println("C������ ��������� �������: " + Basket.getAveragePriceBaskets());
    }
}
