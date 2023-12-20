package com.day6;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the change amount in Rs: ");
        int change = scanner.nextInt();

        System.out.println("Minimum number of notes needed: " + calculateMinNotes(change));
        System.out.println("List of Rs notes in the change: " + getNotesList(change));
    }

    private static int calculateMinNotes(int amount) {
        int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

        if (amount == 0) {
            return 0;
        }

        int i = 0;
        while (i < notes.length && notes[i] > amount) {
            i++;
        }

        return 1 + calculateMinNotes(amount - notes[i]);
    }

        private static String getNotesList(int amount) {
        int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

        if (amount == 0) {
            return "";
        }

        int i = 0;
        while (i < notes.length && notes[i] > amount) {
            i++;
        }

        return notes[i] + " " + getNotesList(amount - notes[i]);
    }
}
