package lesson3;

import java.util.Scanner;

public class Task2v2case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше сообщение: ");
        String word = scanner.nextLine();
        scanner.close();
        switch (word){
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How dare you":
                System.out.println("I am batman!!!");
                break;
            default:
                System.out.println("Unknown message");
        }
    }

}
