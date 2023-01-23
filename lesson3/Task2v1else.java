package lesson3;

import java.util.Scanner;

public class Task2v1else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше сообщение: ");
        String word = scanner.nextLine();
        scanner.close();
        if (word.equals("Hi"))
            System.out.println("Hello");
        else if (word.equals("Bye"))
            System.out.println("Good bye");
        else if (word.equals("How dare you"))
            System.out.println("I am batman!!!");
        else
            System.out.println("Unknown message");
    }
}
