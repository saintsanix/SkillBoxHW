public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            if (i == 1025) {
                System.out.println(i + " - " + c);
            } else if (i >= 1040 && i <= 1103) {
                System.out.println(i + " - " + c);
            } else if (i == 1105) {
                System.out.println(i + " - " + c);
            }

        }
    }
}
