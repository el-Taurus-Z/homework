package first_lesson;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int Var = scanner.nextInt();
        check = (Var % 2 == 0);
        System.out.println(check);

    }
}
