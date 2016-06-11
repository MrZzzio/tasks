/**
 * Created by dmitry on 11.06.16.
 */

import java.util.*;

/**
 * В помощь учителю напишите программу, которая будет выводить на экран
 * 15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что
 * задания по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров
 * не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
 */
public class task3 {

    public static void main(String[] args) {
        String[] list = getFiveteen();

        for (int i = 0; i < 15; i++) {
            System.out.println(list[i]);
        }

    }

    private static String[] getFiveteen(){

        String[][] mas = new String[10][10];

        for (int i = 2; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                mas[i][j] = "" + i + " * " + j + " =";
            }
        }

        String[] list = new String[36];
        int k = 0;

        for (int i = 2; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                list[k] = (mas[i][j]);
                k++;
            }
        }

        Random rnd = new Random();
        for (int i = 1; i < list.length; i++) {
            int j = rnd.nextInt(i);
            String temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        return list;
    }

}


