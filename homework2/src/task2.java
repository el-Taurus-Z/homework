
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 0 до 9:");
       int K = scanner.nextInt();

       switch (K)
       {
           case 1:
               System.out.println( K + " день");
               break;

           case 2:
           case 3:
           case 4:
               System.out.println(K + " дня");
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
               System.out.println(K + " дней");
               break;
           default:
               if (K <0)
               {
                   System.out.println("Ошибка");
               }
               else
               {
                   System.out.println("Данная функцинальность пока не доступна!");
               }

       }
    }
}
