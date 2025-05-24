package Number_Operations;

import java.util.Scanner;

public class Perfect_Number_Finder {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("The number is perfect!");
        } else {
            System.out.println("The number is not perfect!");
        }
    }
}
