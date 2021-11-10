import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        for(int i = 0; i < k; i++)
        {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Ваш массив: ");
        for(int i = 0; i < k; i++)
        {
            System.out.print(  arr[i] + " ");


        }
        System.out.println();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 ==0)
            {
                System.out.print(arr[i] + " ");
                sum += arr[i];


            }
        }
        System.out.println("");
        System.out.println(sum);



    }
}
