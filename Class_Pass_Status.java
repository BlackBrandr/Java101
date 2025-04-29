package Giris2;

import java.util.Scanner;

public class Class_Pass_Status {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, muzik;
        double total = 0, average;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al

        System.out.println("Matematik Notunuz :");
        mat = inp.nextInt();

        if (mat <= 100 && mat >= 0) {
            total += mat;
        }else if (mat > 100){
            total += 100;
        }

        System.out.println("Fizik Notunuz :");
        fizik = inp.nextInt();

        if (fizik <= 100 && fizik >= 0) {
            total += fizik;
        }else if (fizik > 100){
            total += 100;
        }

        System.out.println("Kimya Notunuz :");
        kimya = inp.nextInt();

        if (kimya <= 100 && kimya >= 0) {
            total += kimya;
        }else if (kimya > 100){
            total += 100;
        }

        System.out.println("Türkçe Notunuz :");
        turkce = inp.nextInt();

        if (turkce <= 100 && turkce >= 0) {
            total += turkce;
        }else if (turkce > 100){
            total += 100;
        }

        System.out.println("Müzik Notunuz :");
        muzik = inp.nextInt();

        if (muzik <= 100 && muzik >= 0) {
            total += muzik;
        }else if (muzik > 100){
            total += 100;
        }

        average = total / 5;

        System.out.println("Ortalamanız:" + average);

        if (average >= 55){
            System.out.println("Sınıfı Başarıyla Geçtiniz");
        }else {
            System.out.println("Sınıfta Kaldınız !!");
        }
    }
}
