package com.day6;

import java.util.Scanner;

public class MonthlyPayment {

    public static void main(String[] args) {
        double P,Y,R;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P(Principal):");
        P = sc.nextDouble();
        System.out.println("Enter the value of Y(Years):");
        Y = sc.nextDouble();
        System.out.println("Enter the value of R(Rate):");
        R = sc.nextDouble();

        System.out.println("The monthly payment on Principal of "+ P + " for " + Y + " years at the rate of " + R + " is: " + monthlyPayment(P,Y,R));




    }
    public static double monthlyPayment(double P, double Y, double R){
        double n = 12 * Y;
        double r = R / (12 * 100);
        return ((P * r) / (1 - Math.pow((1 + r), (-n))));
    }


}
