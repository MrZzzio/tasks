/**
 * Created by dmitry on 10.06.16.
 */

/**
 * Создать статический метод, который будет иметь два целочисленных параметра a и b,
 * и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
 */


public class task2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 25;

        for (int i = 0; i < 12; i++) {
            System.out.println(getAverage(a, b));
        }
    }

    private static int getAverage(int a, int b) {
        return (int) (Math.random() * (b - a) + a + 1);
    }
}
