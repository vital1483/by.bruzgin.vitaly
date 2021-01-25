package homework2;


import java.util.Scanner;

public class TaskTwo {


    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;

        System.out.println("Сколько будет 2 + 2 ?");
        System.out.println("У вас есть 3 попытки что бы угадать! ");
        do {
            System.out.println("Ваш ответ :");

            int answer = in.nextInt();

            if (answer == 4) {
                System.out.println("МОЛОДЕЦ УГАДАЛ");
                break;
            } else if (answer != 4)
                count++;

            System.out.println("Попробуй еще раз");
        } while (count != 3);

        System.out.println("Сдаешься?Нажми. 1. да 2. нет ");

        int chislo = in.nextInt();
        switch (chislo) {
            case 1:
                System.out.println("Правильный ответ - 4 ");
                break;
            case 2:
                System.out.println("Ну тогда учи таблицу умножения!");
                break;

        }
    }

}




