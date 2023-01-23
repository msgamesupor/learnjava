package lesson4;
/*
Задача 5 :
Выводить на экран "Не угадал!" до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры:
Вариант 1: перед выводом на экран "Не угадал!" */
import java.util.Scanner;

public class Task5v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Угадай число! ");
    while (scanner.nextInt() != 1) {
        System.out.println("Не угадал");
    }
        scanner.close();
    }
}
