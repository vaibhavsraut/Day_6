package com.day6;

import java.util.Random;
import java.util.Scanner;

public class CouponCollector {

    private static int getRandomCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }

    private static int collectDistinctCoupons(int n) {
        boolean[] collectedCoupons = new boolean[n];
        int distinctCouponsCount = 0;
        int randomNumbersGenerated = 0;

        while (distinctCouponsCount < n) {
            int randomCoupon = getRandomCoupon(n);
            randomNumbersGenerated++;

            if (!collectedCoupons[randomCoupon - 1]) {
                collectedCoupons[randomCoupon - 1] = true;
                distinctCouponsCount++;
            }
        }

        return randomNumbersGenerated;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of coupons:");
        int numberOfCoupons;
        Scanner sc = new Scanner(System.in);
        numberOfCoupons = sc.nextInt();

        int totalRandomNumbers = collectDistinctCoupons(numberOfCoupons);

        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }
}
