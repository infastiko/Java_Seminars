import java.util.Arrays;
public class Homework_1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println("\n" + isLeapYear(1600));

        System.out.println(Arrays.toString(createArray(2, 3)));

        int[] arrRev = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(reverseElementsValues(arrRev)));

        int[] arr = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyTwoElementsLessSix(arr)));

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
        printMassMass(fillDiagonals(array));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int total = a + b;
        if (10 <= total && total <= 20) return true;
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) return true;
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            newString.append(source);
        }
        System.out.print(newString);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }
}