package lesson4;
//Задача 1:
//Ввести с клавиатуры целое число. Вывести в консоль его факториал.

//Факториал N - это произведение всех положительных целых чисел от 1 до N включительно.
//Например, факториал 5 равен 5×4×3×2×1=120. Единственным исключением является 0 !, который определяется как 1.
//Факториалы отрицательных чисел не определены.
import java.util.Scanner;

public class Task1v1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int numeric = scanner.nextInt();
        scanner.close();

        if (numeric < 0) {
            System.out.println("Число не определенно и не может быть меньше 0!"); //Факториалы отрицательных чисел не определены.
        }  else {
            int result = 1;
            for (int i = 1; i <= numeric; i++) {
                result = result * i;
            }
            System.out.println(result);
        }
    }
    }
