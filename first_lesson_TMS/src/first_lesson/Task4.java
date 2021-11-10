package first_lesson;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        boolean tr = true;
        Scanner scanner = new Scanner(System.in);
        int endSum = 180;
        System.out.println("Введите 3 угла треугольника: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int sum = first + second + third;
        tr = sum == endSum;

        System.out.println(tr);
    }
}
