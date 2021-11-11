import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int var = random.nextInt(4);
       // System.out.println(var);
        System.out.println("Введите число!");
        int youVar;

        do {
            youVar = scanner.nextInt();
            if (youVar==var)
            {
                System.out.println("Вы угадали число!");
            }
            else
            {
                System.out.println("Вы не угадали число, попробуйте ещё раз!");

            }
        } while (youVar != var);



    }
}
