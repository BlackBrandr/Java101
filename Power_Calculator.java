package Methods;

import java.util.Scanner;

public class Power_Calculator {

    static int power(int base, int exponent){

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = input.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent = input.nextInt();

        if (exponent < 0) {
            System.out.println("Lütfen 0 veya pozitif bir üs değeri giriniz.");
            return;
        }

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
