import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        int [][] arr = new int [col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int colsum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                colsum += arr[j][i];

            }

            System.out.println(" Сумма столбца столбца: " + colsum);
        }


    }
}
