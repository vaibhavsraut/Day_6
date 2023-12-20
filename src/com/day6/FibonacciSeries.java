package com.day6;

import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibonacci(int n){
        int n0 = 0;
        int n1 = 1;
        int next= n0 + n1;

        if(n==1){
            System.out.println(n0);
        }else {
            for(int i=0;i<n;i++){
                System.out.print(n0 + " ");
                n0 = n1;
                n1 = next;
                next = n0 + n1;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the value of N:");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Your Fibonacci Series is:");
        Fibonacci(n);

    }
}
