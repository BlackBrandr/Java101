package Number_Operations;

import java.util.Scanner;

/**
 * Bu sınıf, kullanıcıdan alınan taban ve üs değerlerine göre üs alma işlemi yapar
 */
public class Exponent_Calculator {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int number, exponent, result = 1;

        // Kullanıcıdan taban ve üs değerlerini alma
        Scanner input = new Scanner(System.in);
        System.out.println("Taban giriniz: ");
        number = input.nextInt();

        System.out.println("Üs giriniz: ");
        exponent = input.nextInt();

        // Üs alma işlemini gerçekleştirme
        for (int i = 1; i <= exponent; i++) {
            result *= number;
        }

        // Sonucu ekrana yazdırma
        System.out.println(number + "^" + exponent + " = " + result);
    }
}