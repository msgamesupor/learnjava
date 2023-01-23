package lesson2;
//Урок 2 задача 1
/*
Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения

                            c = b*a*(a + b)/(a2),         где a2 - a в квадрате

Совпадает ли результат выражения, если a и b — переменные
 типа int (для проверки не забудьте также использовать подходящий метод Scanner)?
 */
import java.util.Scanner; // импортируем класс сканер
public class Task1v1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // подключаем класс сканера

        System.out.println("Произвидём расчёт по нашей волшебной формуле :)");
        System.out.print("Введите значение а: ");
        int a = in.nextInt();   // ловим первую переменную целого числа введённую в консоль
        System.out.print("Введите значение b: ");
        int b = in.nextInt(); // ловим вторую переменную целого числа введённую в консоль

        in.close(); // закрыл сканер

        int c = b * a * (a + b) / (a * a); //сама формула
/*
       // в данном разборе и примере пошаговом, вводим в консоль a = 2, b = 3
        int step1 = b * a; // 6
        int step2 = (a + b); // 5
        int step3 = (a * a); // 4
        int step4 = step1 * step2; // 30
        int step5 = step4 / step3; // 7.5 ( округляется до 7)
        System.out.println("Ваш ответ будет: " + step5);

 */

        System.out.println("Ваш ответ будет: " + c);



    }

}