package Number_Operations;

import java.util.Scanner;

public class Factorial_Calculator {
    public static void main(String[] args) {
        int number, factorial_1 = 1;
        int combination, factorial_2 = 1;
        int factorial_3 = 1;
        int result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = input.nextInt();

        System.out.println("Enter the combination: ");
        combination = input.nextInt();

        for (int i = number; i > 0; i--) {
            factorial_1 *= i;
        }

        for (int j = combination; j > 0; j--) {
            factorial_2 *= j;
        }

        for (int k = number - combination; k > 0; k--) {
            factorial_3 *= k;
        }

        result = factorial_1 / (factorial_2 * factorial_3);
        System.out.println("The result is: " + result);













    }
}
