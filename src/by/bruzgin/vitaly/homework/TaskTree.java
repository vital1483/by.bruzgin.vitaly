package by.bruzgin.vitaly.homework;

// 3.      Заданы три числа. Найти среди них минимальное,
//         максимальное и среднее арифметическое и вывести.
//         Без использования дополнительных библиотек,
//         только операторы сравнения и логические.

import java.util.Random;


public class TaskTree {


    private static Random random = new Random();

    public static void main(String[] args) {

        int one = random.nextInt();
        int two = random.nextInt();
        int tree = random.nextInt();
        int min, max, avrg;

        System.out.println(one + " " + two + " " + tree);
        if (one <= two && one <= tree) {
            min = one;
        } else if (two <= one && two <= tree) {
            min = two;
        } else {
            min = tree;
        }
        System.out.println("Минимальное число = " + min);

        if (one >= two && one >= tree) {
            max = one;
        } else if (two >= one && two >= tree) {
            max = two;
        } else {
            max = tree;
        }
        System.out.println("Максимальное число = " + max);

        System.out.println("Среднее арифметическое чисел=" + ((one + two + tree) / 3));
    }
}
//if you need to find the arithmetic mean modulo, tell me I will correct it


