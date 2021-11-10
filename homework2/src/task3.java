import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон чисел: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.print("Числа между " + num1 + " и " + num2 + ": ");
        for (int i = num1 + 1 ; i < num2; i++)
        {
            System.out.print(i + " ");
        }
    }
}
