package Loops;

import java.util.Scanner;

public class EBOB_EKOK_Finder {
    public static void main(String[] args) {
        int number1, number2, ebob = 0, ekok = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();

        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
        }

        ekok = (number1 * number2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
