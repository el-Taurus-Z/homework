package first_lesson;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double end = (((b + (Math.sqrt(Math.pow(b,2) + 4*a*c)/2*a) - a*3*c + Math.pow(b, -3))));
        System.out.println(end);

    }
}
