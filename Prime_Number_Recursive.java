package Methods;

import java.util.Scanner;

public class Prime_Number_Recursive {

    static boolean isPrime(int number, int divisor){
        boolean prime = true;

        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }

        if (divisor * divisor > number) {
            return true;
        }

        return isPrime(number, divisor + 1);
    }

    static boolean isPrime(int number) {
        return isPrime(number, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        if(isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
}
