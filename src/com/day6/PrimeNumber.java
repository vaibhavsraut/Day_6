package com.day6;

import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n){
        boolean flag = false;
        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
        if(i==n){
            flag = true;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is a Prime Number!");
        }else {
            System.out.println(n + " is not a Prime Number!");
        }


    }
}
