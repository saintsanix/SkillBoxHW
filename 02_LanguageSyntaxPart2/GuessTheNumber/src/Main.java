import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        int attemp = -1;

        while (value != attemp) {
            if (attemp == -1) {
                System.out.println("������� �����:");
            } else if (attemp > value) {
                System.out.println("�������� ����� ������");
            } else {
                System.out.println("�������� ����� ������");
            }
            attemp = new Scanner(System.in).nextInt();
        }
        System.out.println("�� �������!");
    }
}
