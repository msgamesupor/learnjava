package lesson1;/*
Задача 2
Используя
  b) несколько переменных типа char
  без переноса
  вывести свое имя в консоль.
 */


public class Task2v2 {
    public static void main(String[] args) {

        char st0 = 'М'; //обьявляем переменную
        System.out.print(st0);
        char st1 = 'а'; //обьявляем переменную
        System.out.print(st1);
        char st2 = 'к'; //обьявляем переменную
        System.out.print(st2);
        char st3 = 'с'; //обьявляем переменную
        System.out.print(st3);
        char st4 = 'и'; //обьявляем переменную
        System.out.print(st4);
        char st5 = 'м'; //обьявляем переменную
        System.out.print(st5);
/*
Начиная с версии 15 Java поддерживает тестовые блоки (text blocks) - многострочный текст,
по этому можно упростить написание и вывод сделать, одной строкой   */
// System.out.print('\n' + "" + st0 +""+ st1 +""+ st2 +""+ st3 +""+ st4 +""+ st5);
    }
}