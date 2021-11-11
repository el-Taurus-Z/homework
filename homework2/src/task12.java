import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String math = "";
        while (!math.equals("exit"))
        {
            math = scanner.nextLine();
            switch (math)
            {
                case "increase":
                    num++;
                    System.out.println(num);
                    break;
                case "decrease":
                    num--;
                    System.out.println(num);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Ошибка, неверный ввод!");
            }

        }
        System.out.println(num);
    }
}
