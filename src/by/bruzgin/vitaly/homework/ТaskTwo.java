package by.bruzgin.vitaly.homework;

//2.   Даны два целых числа, задающие три диапазона чисел.
//    Определить, какому диапазону принадлежит введенное пользователем число.

import java.util.Random;
import java.util.Scanner;

public class ТaskTwo {

    private static final Random random = new Random();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        int one = random.nextInt(21) + 0;
        int two = random.nextInt(21) + 0;
        System.out.println(one + " " + two);
        System.out.println("Введите число :");
        int tree = in.nextInt();
        if (tree < one && tree < two) {
            System.out.println(tree + " меньше " + one + " и " + two);
        } else if (tree > one && tree > two) {
            System.out.println(tree + " больше " + one + " и " + two);
        } else {
            System.out.println("Число из промежутка чисел");
        }
    }
}