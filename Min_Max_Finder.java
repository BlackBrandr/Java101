package Loops;

import java.util.Scanner;

public class Min_Max_Finder {
    public static void main(String[] args) {
        int counter = 0, min = 0, max = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        counter = input.nextInt();


        for (int i = 1; i <= counter; i++) {

            System.out.println("Enter the " + i + ". number: ");
            int number = input.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            } else {
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            }
        }
        System.out.println("\nMinimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
