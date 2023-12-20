package com.day6;

import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,d,y;
        System.out.println("Enter the value of m(month):");
        m = sc.nextInt();
        System.out.println("Enter the value of d(day):");
        d = sc.nextInt();
        System.out.println("Enter the value of y(year):");
        y = sc.nextInt();

        int dayOfWeek = dayOfWeek(m, d, y);
        System.out.println("Day of the week: " + dayOfWeek);
    }

    public static int dayOfWeek(int month, int day, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        return (day + x + 31 * m0 / 12) % 7;
    }
}
