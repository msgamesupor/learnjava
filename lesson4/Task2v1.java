package lesson4;
//Задача 2:
//Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.

import java.util.Scanner;

public class Task2v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int numeric = scanner.nextInt();
        scanner.close();
//В нашей задаче мы не знаем, сколько чисел содержится в числе. Поэтому придётся использовать оператор while

        int sum = 0;
            while (numeric != 0) { // будет выполнятся пока не будет равно 0
                sum += numeric % 10;

                numeric = numeric / 10;
            }
            if (sum < 0) // проверяем, если меньше 0, то умножаем на -1, для подсчёта адекватного
                sum *= -1;
            System.out.println(sum);

    }
}
