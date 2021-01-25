package homework2;

import java.util.Random;
import java.util.Scanner;

public class TaskTree {

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int count = 0;
        int unknown;
        System.out.println("Введите число от 1 до 100");
        int chiclo = in.nextInt();
        System.out.println("Теперь программа угадывает ваше число");
        do {
            count++;
            unknown = 1 + (int) (Math.random() * ((100 - 1) + 1));

        } while (chiclo != unknown);
        System.out.println("Загаданое число = " + unknown);
        System.out.println("Количество попыток = " + count);
    }
}

