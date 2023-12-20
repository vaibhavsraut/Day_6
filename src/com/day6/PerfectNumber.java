package com.day6;

import java.util.Scanner;




public class PerfectNumber {

    public static void perfectNumber(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
        }

        if(sum == n){
            System.out.println(n + " is a Perfect Number!");
        } else {
            System.out.println(n + " is not a Perfect Number!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to check:");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        perfectNumber(n);
    }
}
