package Loops;

import java.util.Scanner;

public class Prime_Number_Finder {
    public static void main(String[] args) {

        System.out.println("1-100 arasındaki asal sayılar:");

        // 2'den 100'e kadar olan sayıları kontrol et
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Sayının asal olup olmadığını kontrol et
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Eğer sayı asalsa yazdır
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
