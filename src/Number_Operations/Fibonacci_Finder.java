package Number_Operations;

import java.util.Scanner;

public class Fibonacci_Finder {

    public static void main(String[] args) {
        int n; // kaç terim yazdırmak istiyorsanız
        int firstNumber = 0;
        int secondNumber = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = input.nextInt();

        System.out.print("Fibonacci Serisi: ");

        // İlk sayıyı (0) yazdır
        System.out.print(firstNumber + " ");

        // İkinci sayıyı (1) yazdır
        System.out.print(secondNumber + " ");

        for (int i = 2; i < n; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
