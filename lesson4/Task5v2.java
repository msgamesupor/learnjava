package lesson4;
/*
Задача 5 :
Выводить на экран "Не угадал!" до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры:
Вариант 2: после вывода на экран "Не угадал!"*/
import java.util.Scanner;

public class Task5v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Не угадал!");
        } while (scanner.nextInt() != 1); {
            System.out.println("Угадал!");
        }
        scanner.close();
    }
}
