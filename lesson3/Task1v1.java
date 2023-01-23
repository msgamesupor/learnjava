package lesson3;

import java.util.Scanner;

//урок 3 задание 1
/*Ввести с клавиатуры два целых числа. Если Число1 четное,
 вывести произведение двух чисел(пр.1) если нет - частное(пр.2). Также если числа равны - вывести надпись "Числа равны!"

        пр1.: "Число1 * Число2 = Произведение", где число1 - значение 1го числа, число2 - значение 2го числа,
         Произведение - результат умножения.

        пр2.: "Число1 / Число2 = Частное", где число1 - значение 1го числа, число2 - значение 2го числа,
         Частное - результат деления. Помните, что результат деления двух целых чисел – тоже целое число.
*/
public class Task1v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        System.out.print("Первое число: ");
        int numberone = scanner.nextInt();
        System.out.print("Второе число: ");
        int numbertwo = scanner.nextInt();
        scanner.close();
        if (numberone == 0 || numbertwo == 0)
            System.out.println("Умножение и деление на ноль не допустимо!");
        else if (numberone == numbertwo)
            System.out.println("Числа равны!");
        else if (numberone % 2 == 0)
            System.out.println("Ответ: " + numberone * numbertwo);
        else
            System.out.println("Ответ: " + (double)numberone / numbertwo);
    }
}
