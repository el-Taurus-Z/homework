import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Ваш массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
            {
                sum += arr[i];
            }

        }
        System.out.println();
        System.out.println(sum);

    }
}
