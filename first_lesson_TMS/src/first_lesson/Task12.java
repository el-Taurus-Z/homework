package first_lesson;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа типа int! ");
        int fVar = scanner.nextInt();
        int sVar = scanner.nextInt();
        int sum = fVar + sVar;

        System.out.println("Сумма " + fVar + " и " + sVar + " = "+ sum);
    }
}
