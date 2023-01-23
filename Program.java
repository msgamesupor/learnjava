import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner vote = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение 4.Деление" +
                "А затем, введите данные для операции");
        System.out.print("Введите номер операции: ");
        int a = vote.nextInt();
        System.out.print("Введите первое число:");
        double b = vote.nextDouble();
        System.out.print("ВВедите второе число: ");
        double c = vote.nextDouble();

        //System.out.print("Введите значение b: ");
        //double b = vote.nextDouble();

        vote.close();

        float g=0;
       switch (a)
       {
           case 1:
               g = (float) (b+c);

               System.out.println("Сложение");
               break;
           case 2:
               g = (float) (b-c);
               System.out.println("Вычитание");
               break;
           case 3:
               g = (float) (b*c);
               System.out.println("Умножение");
               break;
           case 4:
               g = (float) (b/c);
               System.out.println("Деление");
               break;

       }
        System.out.printf("Ваш ответ: %.2f", g);



    }
}