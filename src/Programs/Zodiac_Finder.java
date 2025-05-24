package Programs;

import java.util.Scanner;

public class Zodiac_Finder {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz
        int month, day;
        String zodiac = "";

        // Kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan doğum ayı ve gününü alıyoruz
        System.out.println("Doğum ayınızı giriniz (1-12): ");
        month = input.nextInt();

        System.out.println("Doğum gününüzü giriniz : ");
        day = input.nextInt();

        // Switch-case yapısı ile ayları kontrol ediyoruz
        switch (month) {
            case 1: // Ocak ayı
                if (day <= 21) {    // 1-21 Ocak tarihleri Oğlak burcu
                    zodiac = "Oğlak";
                } else {            // 22-31 Ocak tarihleri Kova burcu
                    zodiac = "Kova";
                }
                break;
            case 2: // Şubat ayı
                if (day <= 19) {    // 1-19 Şubat tarihleri Kova burcu
                    zodiac = "Kova";
                } else {            // 20-29 Şubat tarihleri Balık burcu
                    zodiac = "Balık";
                }
                break;
            case 3: // Mart ayı
                if (day <= 20) {    // 1-20 Mart tarihleri Balık burcu
                    zodiac = "Balık";
                } else {            // 21-31 Mart tarihleri Koç burcu
                    zodiac = "Koç";
                }
                break;
            case 4: // Nisan ayı
                if (day <= 20) {    // 1-20 Nisan tarihleri Koç burcu
                    zodiac = "Koç";
                } else {            // 21-30 Nisan tarihleri Boğa burcu
                    zodiac = "Boğa";
                }
                break;
            case 5: // Mayıs ayı
                if (day <= 21) {    // 1-21 Mayıs tarihleri Boğa burcu
                    zodiac = "Boğa";
                } else {            // 22-31 Mayıs tarihleri İkizler burcu
                    zodiac = "İkizler";
                }
                break;
            case 6: // Haziran ayı
                if (day <= 22) {    // 1-22 Haziran tarihleri İkizler burcu
                    zodiac = "İkizler";
                } else {            // 23-30 Haziran tarihleri Yengeç burcu
                    zodiac = "Yengeç";
                }
                break;
            case 7: // Temmuz ayı
                if (day <= 22) {    // 1-22 Temmuz tarihleri Yengeç burcu
                    zodiac = "Yengeç";
                } else {            // 23-31 Temmuz tarihleri Aslan burcu
                    zodiac = "Aslan";
                }
                break;
            case 8: // Ağustos ayı
                if (day <= 22) {    // 1-22 Ağustos tarihleri Aslan burcu
                    zodiac = "Aslan";
                } else {            // 23-31 Ağustos tarihleri Başak burcu
                    zodiac = "Başak";
                }
                break;
            case 9: // Eylül ayı
                if (day <= 22) {    // 1-22 Eylül tarihleri Başak burcu
                    zodiac = "Başak";
                } else {            // 23-30 Eylül tarihleri Terazi burcu
                    zodiac = "Terazi";
                }
                break;
            case 10: // Ekim ayı
                if (day <= 22) {    // 1-22 Ekim tarihleri Terazi burcu
                    zodiac = "Terazi";
                } else {            // 23-31 Ekim tarihleri Akrep burcu
                    zodiac = "Akrep";
                }
                break;
            case 11: // Kasım ayı
                if (day <= 21) {    // 1-21 Kasım tarihleri Akrep burcu
                    zodiac = "Akrep";
                } else {            // 22-30 Kasım tarihleri Yay burcu
                    zodiac = "Yay";
                }
                break;
            case 12: // Aralık ayı
                if (day <= 21) {    // 1-21 Aralık tarihleri Yay burcu
                    zodiac = "Yay";
                } else {            // 22-31 Aralık tarihleri Oğlak burcu
                    zodiac = "Oğlak";
                }
                break;
            default: // Geçersiz ay girişi
                System.out.println("Hatalı giriş yaptınız! Lütfen 1-12 arasında bir ay numarası giriniz.");
                return; // Programı sonlandır
        }

        // Burcu ekrana yazdırıyoruz
        System.out.println("Burcunuz: " + zodiac);
    }
}