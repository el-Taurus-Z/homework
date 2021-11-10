package first_lesson;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int end = ((a - 3) * b/2) + c;
        System.out.println(end);
    }
}
