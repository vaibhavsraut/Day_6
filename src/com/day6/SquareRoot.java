package com.day6;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        float c;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();

        System.out.println("Square Root of " + c + " is: " + squareRoot(c));
    }

    public static float squareRoot(float c){
        final double EPSILON = 1e-15;
        float t = c;
        while ((Math.abs(t - (c/t) )) > (EPSILON * t)) {
            t = ((c/t) + t) / 2;
        }

        return t;
    }

}
