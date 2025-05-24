package Number_Operations;

import java.util.Scanner;

public class Odd_Number_Adder {
    public static void main(String[] args) {
        int number, sum = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        while (number % 2 == 0){
            System.out.println("Enter the number again: ");
            number = input.nextInt();
        }

        for (int i = 0; i <= number; i++) {
            if (i % 4 == 0){
                sum += i;
                counter++;
            }
        }

        System.out.println("The sum of the even numbers is: " + sum);
    }
}