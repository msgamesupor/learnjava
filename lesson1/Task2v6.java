package lesson1;/*
Задача 2
    Вывести ваше имя посимвольно, где каждая буква — на новой строке, не используя System.out.println().
    С использованием одного String: вывести свое имя в консоль.
 */


public class Task2v6 {
    public static void main(String[] args) {

        String st0 = "М\nа\nк\nс\nи\nм"; //обьявляем переменную и добавляем перенос строки
        System.out.print(st0); //выводим переменную
        System.out.print('\n'); //перенос строки



    String st1 = """
            Текстовые блоки, которые появились в JDK15, позволяют упростить написание многострочного текста:
            М
            а
            к
            с
            и
            м
            """;
System.out.print(st1);
    }
}