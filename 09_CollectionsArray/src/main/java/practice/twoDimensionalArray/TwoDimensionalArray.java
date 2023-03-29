package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] cross = new char[size][size];
        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross[i].length; j++) {
                if (j == i || j == cross.length - 1 - i) {
                    cross[i][j] = 'X';
                } else {
                    cross[i][j] = ' ';
                }
                System.out.println(cross[i][j]);
            }
            System.out.println();
        }

        return cross;
    }
}
