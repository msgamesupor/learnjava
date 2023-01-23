package lesson4;

import java.util.Scanner;
/*
Задача 3:
Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
Углы прямоугольника обозначить символом “ “.
Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
*/
public class Task3v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Длинна: ");
        int length = scanner.nextInt();
        System.out.print("Высота: ");
        int width =  scanner.nextInt();
        scanner.close();
/*       Хотел изначально сдать так, но под тз не подходит))
        for(int i=0; i<width; i++){
            for(int j=0; j<length; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */
        String horizLine = " "; //формирую левый отступ угол
    for(int i=0; i < length; i++) { //используем введеную длинну для границы фигуры
        horizLine += "--"; } //добавляем символ в переменную строки когда срабатывает цикл
    horizLine += " \n"; //формирую правый отступ угла и перенос строки

    String vertLine = "|"; //формирую левый край области
    for(int i=0; i < length*2; i++) { //используем введеную длинну для ширины фигуры "заполняя" её
        vertLine += " "; } //добавляем символ в переменную строки когда срабатывает цикл
        vertLine += "|\n"; //формирую правый край области и перенос строки

        String verticalLine = ""; // обьявляем переменную для повторения нашего кода выше
        for (int i = 0; i < width; i++) {
            verticalLine += vertLine; } //каждая новая строка принимает значение предидущего цикла
        System.out.print(horizLine);
        System.out.print(verticalLine);
        System.out.print(horizLine);
        //выводим последовательно записанное в переменные после цикла, да можно записать одной записью указав "+"
    } }
