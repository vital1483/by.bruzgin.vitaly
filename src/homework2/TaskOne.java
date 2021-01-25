package homework2;

import java.util.Scanner;

public class TaskOne {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month, day;
        do {
            System.out.println("Введите месяц ");
            month = in.nextInt();
        } while (month < 1 || month > 12);
        System.out.println("Введите число");
        day = in.nextInt();
        if (day <= year[month - 1] && day > 0)
            System.out.println("Есть такое число в этом месяце");
        else
            System.out.println("Такого числа нет в этом месяце");
    }
}

