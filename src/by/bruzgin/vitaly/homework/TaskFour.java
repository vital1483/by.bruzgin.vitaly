package by.bruzgin.vitaly.homework;

// 4. Задано число. Определить, близко ли к
//    нему другое введенное число (в пределах 10%).


import java.util.Random;
import java.util.Scanner;

public class TaskFour {

    private static final Random random = new Random();
    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        int one = random.nextInt(101) + 0;
        System.out.println(one);
        System.out.println("Введите число :");
        int chislo = in.nextInt();
        int min = one - 10;
        int max = one + 10;
        if (chislo >= min && chislo <= max) {
            System.out.println("Введеное число в дипазоне +/- 10");
        }
        else {
            System.out.println("Мимо");
        }
    }

}
