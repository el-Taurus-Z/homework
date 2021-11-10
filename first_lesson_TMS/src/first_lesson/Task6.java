package first_lesson;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите два разных числа: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double b = s.nextDouble();
        System.out.println("Большее число из введённых: " + Math.max(a, b) );
        System.out.println("Меньшее число из введённых: " + Math.min(a, b) );

    }
}
