package first_lesson;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int time = s.nextInt();
        int hour = time/3600;
        int min = time/60;
        System.out.print("Часы: " + hour + " " + "Минуты: " + min + " " + "Секунды: " + time);


    }
}
