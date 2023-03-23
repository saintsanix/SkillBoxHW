package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    private static final int CONTAINERS_IN_TRACK = 12;
    private static final int BOXES_IN_CONTAINER = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int containers = 0;
        int trucks = 0;

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

        if (boxes > 0) {
            System.out.println("Грузовик: 1");
            System.out.println("\tКонтейнер: 1");
            containers++;
            trucks++;
            for (int boxNumber = 1; boxNumber <= boxes; boxNumber++) {
                boolean isTruckFilled = containers % CONTAINERS_IN_TRACK == 0;
                boolean isContainerFilled = boxNumber % BOXES_IN_CONTAINER == 0;
                System.out.println("\t\tЯщик: " + boxNumber);
                if (isTruckFilled && isContainerFilled && boxNumber < boxes) {
                    trucks++;
                    System.out.println("Грузовик: " + trucks);
                }
                if (isContainerFilled && boxNumber < boxes) {
                    containers++;
                    System.out.println("\tКонтейнер: " + containers);
                }
            }
        }

        System.out.println("Необходимо:" + System.lineSeparator() +
                "грузовиков - " + trucks + " шт." + System.lineSeparator() +
                "контейнеров - " + containers + " шт.");
    }

}
