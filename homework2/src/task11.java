import java.util.Arrays;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        int [] arr = {1,5,4,8,6};
        int [] ind = null;
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int del = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == del){
                ind = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    ind[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    ind[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(ind));
        System.out.println(del);

    }
    }
