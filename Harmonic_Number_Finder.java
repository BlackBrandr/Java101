package Loops;

import java.util.Scanner;

public class Harmonic_Number_Finder {
    public static void main(String[] args) {
        double number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

        System.out.println("The sum of the harmonic numbers is: " + sum);
    }
}
