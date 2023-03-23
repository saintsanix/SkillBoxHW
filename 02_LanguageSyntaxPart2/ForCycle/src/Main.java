import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите число");
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                int j = value / i;
                System.out.println(i + " * " + j);
            }
        }
    }
}

