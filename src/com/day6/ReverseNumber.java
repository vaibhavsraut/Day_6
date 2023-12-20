package com.day6;

import java.util.Scanner;


public class ReverseNumber {

    public static int reverseNumber(int n){
        int result = 0;
        while (n>0){
            int last = n%10;
            result = (result*10) + last;
            n/=10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The reversed number is: " + reverseNumber(n));

    }
}
