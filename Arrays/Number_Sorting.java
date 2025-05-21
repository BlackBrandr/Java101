package Methods.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number_Sorting {
    public static void main(String[] args) {

        System.out.print("Lenght of the array:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers: ");
        System.out.println(Arrays.toString(numbers));

    }
}
