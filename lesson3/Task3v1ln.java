package lesson3;

import java.util.Scanner;

public class Task3v1ln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Вашу фамилию: ");
        String surname = scanner.nextLine();
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите Ваше Отчество: ");
        String middlename = scanner.nextLine();
        scanner.close();

        System.out.print("Добро пожаловать: " + surname + " " + name + " " + middlename);

    }
}