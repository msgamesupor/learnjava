package lesson4;

import java.util.Scanner;
/*
Задача 4:
Ввести с клавиатуры целое число (Число 2). Для каждого из чисел от 1 до 10 выполнить:
Если число1 четное, вывести сумму двух чисел (пр.1), если нет - разность(пр.2). Также если числа равны - вывести надпись "числа равны!".
пр1.: "Число1 + Число2 = Сумма", где число1 - значение 1го числа (от 1 до 10), число2 - значение введенного с клавиатуры числа, Сумма - результат сложения.
пр2.: "Число1 - Число2 = Разность", где число1 - значение 1го числа (от 1 до 10), число2 - значение введенного с клавиатуры числа, Разность - результат вычитания. */
public class Task4v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= 10; i++) {
            if(i == num) { //проверка на равность
                System.out.println("числа равны!");
            }
           else if (i % 2 == 0) { //проверка на чётность
                int sum = i + num;
                System.out.println(num + " + " + i + " = " + sum);
            } else {
               int subtract = i - num;
                System.out.println(num + " - " + i + " = " + subtract);

            }
        }
    }
}
