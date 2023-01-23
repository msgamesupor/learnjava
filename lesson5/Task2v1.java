package lesson5;

import java.util.Scanner;

/*
    Задача 2:
    Создать массив int’ов из 5 элементов.
    Заполнить его значениями, введенными с клавиатуры.
    Вывести на экран сумму каждого значения с предыдущим.
    Предыдущим значением для 0го элемента считать последнее значение массива.
*/
public class Task2v1 {
    public static void main(String[] args) {
        int[] array = new int[5]; // Создан массив int’ов из 5 элементов.

        Scanner scanner = new Scanner(System.in); // Подключаем сканнер

        for (int i = 0; i < array.length; i++) { // array.length проверяем количество элементов в масиве
            if (i < array.length) {
                System.out.print("Введите число: "); // добавляю информацию, что делать ну так на всякий
                array[i] = scanner.nextInt();
            }
        }

        scanner.close();  //отключаем сканер, не понадобиться

        for (int i = 0; i < array.length; i++) {
            int result;

            if (i == 0) {
                result = array[i] + array[array.length - 1];
            } else {
                result = array[i] + array[i - 1];
            }

            System.out.println(result);
        }


    }
}
