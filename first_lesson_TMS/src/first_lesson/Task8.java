package first_lesson;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println("Итог: " + N/100 + " рубля " + N % 100 + " копеек ");



    }
}
