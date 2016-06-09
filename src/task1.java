/**
 * Created by dmitry on 09.06.16.
 */

/**
 * Средние значения из исходного массива шириной w записываются в другой массив
 */

public class task1 {

    public static void main(String[] args) {
        int[] values = {2, 5, 6, 3, 7, 8, 8, 4, 3};
        int w = 4;

        for (int m :
                values) {
            System.out.print(m + " ");
        }

        System.out.println();

        for (int m :
                getMiddle(values, w)) {
            System.out.print(m + " ");
        }
    }

    private static int[] getMiddle(int[] values, int w){

        int[] mas = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            int s = 0; //среднее значение
            int k = w; //количество итераций цикла
            int j = i; //номер элемента от которого начинать считать среднее
            int d = 0; //делимое

            while (k > 0) {
                if (j < values.length) {
                    s += values[j];
                    d++;
                }
                j++;
                k--;
            }

            mas[i] = s / d;
        }

        return mas;
    }
}
