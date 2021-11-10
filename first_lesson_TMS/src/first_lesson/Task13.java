package first_lesson;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите ваше ФИО");
        Scanner s = new Scanner(System.in);
        String fName = s.nextLine();
        String name = s.nextLine();
        String fatherName = s.nextLine();
        System.out.println(fName + " "+ name + " " + fatherName );
    }
}
