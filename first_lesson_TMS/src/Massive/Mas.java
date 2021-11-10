package Massive;

import java.util.Arrays;

public class Mas {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,6,8,9};
        int minVar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minVar > arr[i])
            {
                minVar = arr[i];
            }


        }
        System.out.println(minVar);



        //int[][] arr = {{5,2}, {6,8}};
       //System.out.println(arr.length);



//        int[] a = {1,2,6,5,4};
//        int[] b = {0,0,0,0,0};
//        System.arraycopy(a, 2, b, 2, 3);
//        for (int i = 0; i < b.length; i++)
//            System.out.println(b[i]);
    }
}
