package Loops;

import java.util.Scanner;

public class Finding_Powers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = input.nextInt();

        System.out.println("\n4'ün kuvvetleri:");
        for (int i = 1; Math.pow(4,i) <= number; i++) {
            System.out.println("4^" + i + " = " + (int)Math.pow(4, i));
        }

        System.out.println("\n5'in kuvvetleri:");
        for (int i = 1; Math.pow(5,i) <= number; i++) {
            System.out.println("5^" + i + " = " + (int)Math.pow(5, i));
        }
    }
}
