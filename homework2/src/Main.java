package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int var = 1;
        int var2 = 1;
        int sum;
        System.out.print(var + " " + var2+ " ");
        for (int i = 3; i <= N; i++)
        {

            sum = var + var2;
            var = var2;
            var2 = sum;
            System.out.print(sum +" ");


        }


    }
}
