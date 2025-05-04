package Loops;

import java.util.Scanner;

/**
 * Bu sınıf, girilen sayıya kadar olan aralıkta 3 ve 4'e tam bölünebilen sayıları bulan
 * ve bu sayıların ortalamasını hesaplayan bir program içerir.
 */

public class Even_Number_Picker {
    public static void main(String[] args) {

        int number, sum = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                counter++;
            }
        }

        if (counter - 1 == 0) {
            System.out.println("HATA: 0 ile " + number + " arasında 3 ve 4'e bölünebilen hiç sayı bulunamadı!");
        } else {
            System.out.println("3 ve 4'e bölünebilen " + (counter -1) + " adet sayı bulundu");
            System.out.println("Bu sayıların toplamı: " + sum);
            double ortalama = (double) sum / (counter-1);
            System.out.println("Sayıların ortalaması: " + ortalama);
        }
    }
}