package by.bruzgin.vitaly.homework;

import java.util.Scanner;

public class TaskOne {
/*1. Задано целое число. Определить,какой день недели соответствует заданному числу
    и вывести в консоль. Если ни одному - вывести соответствующее сообщение.*/

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 9");
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt();
        switch (chislo) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Попробуй еще раз");
        }
    }
}
