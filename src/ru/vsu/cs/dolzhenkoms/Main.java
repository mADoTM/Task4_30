package ru.vsu.cs.dolzhenkoms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = readNumber();
        int palindrome = getCertainPalindrome(number);

        printPalindrome(palindrome, number);
    }

    private static int readNumber() {
        Scanner scn = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("Which palindrome do you want to see? ");
            number = scn.nextInt();
        }
        catch (Exception e) {
            System.out.print("You've entered wrong data for value. Please retry...");
            System.exit(1);
        }
        if (number < 1) {
            System.out.println("The number of palindrome can't be less than 1. Number sets in 1");
            number = 1;
        }

        return number;
    }

    private static int getCertainPalindrome(int number) {
        if(number < 0) {
            System.out.println("Entered wrong data. Please retry...");
            System.exit(1);
        }

        int palindrome = -1, index = 0;

        while(index < number) {
            palindrome++;

            if(isNumberPalindrome(palindrome)) {
                index++;
            }
        }

        return palindrome;
    }

    private static boolean isNumberPalindrome(int number) {
        if(number < 0) {
            System.out.println("Entered wrong data. Please retry...");
            System.exit(1);
        }

        int temp = 0; int oldNumber = number;

        while(number > 0) {
            temp *= 10;
            temp += number % 10;

            number /= 10;
        }
        return temp == oldNumber;
    }

    private static void printPalindrome(int palindrome, int number) {
        if(palindrome < 0) {
            System.out.println("Entered wrong data. Please retry...");
        } else {
            System.out.printf("The №%d palindrome = %d", number, palindrome);
        }

    }
}
