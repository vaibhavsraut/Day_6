package com.day6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        System.out.println("What type of conversion you want?");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius:");
                double celsius;
                celsius = sc.nextDouble();
                System.out.println("Converted temperature in Fahrenheit: " + CelsiusToFahrenheit(celsius));
                break;

            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit;
                fahrenheit = sc.nextDouble();
                System.out.println("Converted temperature in Celsius: " + FahrenheitToCelsius(fahrenheit));
                break;
        }

    }

    public static double CelsiusToFahrenheit(double celsius){
        return (celsius * ((double) 9/5)) + 32;
    }

    public static double FahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit-32) * 5/9);
    }

}
