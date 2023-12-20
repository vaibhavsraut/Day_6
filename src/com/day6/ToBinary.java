package com.day6;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number in decimal:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The binary value is: " + toBinary(n));

    }

    public static int toBinary(int n){
        int binary = 0;
        int remainder;
        int power = 1;

        while (n!=0){
            remainder = n % 2;
            binary += (remainder * power);
            power *= 10;
            n /= 2;
        }
        return binary;
    }


}
