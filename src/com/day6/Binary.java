package com.day6;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int n,binary;
        System.out.println("Enter the number in decimal:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        binary = toBinary(n);

        System.out.println("The decimal value after swapping nibble is: " + swapNibble(binary));
        if (isPowerOf2(swapNibble(binary))) {
            System.out.println("The number is power of 2");
        } else {
            System.out.println("The number is not a power of 2");
        }
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

    public static int swapNibble(int binary){
        int firstHalf = binary % 10000;
        int secondHalf = binary / 10000;
        int result = (firstHalf * 10000) + secondHalf;
        return toDecimal(result);
    }

    public static int toDecimal(int n){
        int remainder;
        int decimal = 0;
        int power = 1;
        while (n!=0){
            remainder = n % 10;
            decimal += (remainder * power);
            power *=2;
            n/=10;
        }
        return decimal;
    }

    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0 && n != 0;
    }


}
