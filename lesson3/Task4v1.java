package lesson3;

import java.util.Scanner;

public class Task4v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        System.out.print("Первое число: ");
        int numberone = scanner.nextInt();
        System.out.print("Второе число: ");
        int numbertwo = scanner.nextInt();
        scanner.close();
        if (numberone % 2 == 0 || numbertwo % 3 == 0) {
            System.out.println(numberone == numbertwo);
        }
        if (numberone % 2 == 0 && numberone % 3 == 0) {
            double result = Math.pow(numberone, numbertwo);
            if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            }
            else {
            System.out.println("Ваше число: " + result);
            }
        }
    }
}
