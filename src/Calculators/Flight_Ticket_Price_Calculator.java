package Calculators;

import java.util.Scanner;

public class Flight_Ticket_Price_Calculator {
    public static void main(String[] args) {

        int flight_type, distance , age;
        double km_price = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM Cinsinden Giriniz : ");
        distance = input.nextInt();

        System.out.println("Yaşınızı Giriniz : ");
        age = input.nextInt();

        System.out.println("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        flight_type = input.nextInt();

        double total_price = distance * km_price;

        if (distance < 0 || age < 0 || (flight_type != 1 && flight_type != 2)){
            System.out.println("Hatalı Veri Girdiniz");

        }else {

            switch (flight_type){

                case 1 :
                    if (age < 12){
                        total_price *= 0.5;
                        System.out.println("Toplam Tutar : " + total_price + " TL");

                    }else if (age >= 12 && age <= 24){
                        total_price *= 0.9;
                        System.out.println("Toplam Tutar : " + total_price + " TL");

                    }else if (age >= 25 && age <= 64){
                        System.out.println("Toplam Tutar : " + total_price + " TL");

                    } else if (age >= 65) {
                        total_price *= 0.7;
                        System.out.println("Toplam Tutar : " + total_price + " TL");
                    }
                    break;

                case 2 :
                    if (age < 12){
                        total_price *= 0.5;
                        total_price *= 0.8;
                        total_price *= 2;
                        System.out.println("Toplam Tutar : " + total_price + " TL");

                    }else if (age >= 12 && age <= 24){
                        total_price *= 0.9;
                        total_price *= 0.8;
                        total_price *= 2;
                        System.out.println("Toplam Tutar : " + total_price + " TL");

                    }else if (age >= 25 && age <= 64){
                        total_price *= 0.8;
                        System.out.println("Toplam Tutar : " + total_price + " TL");

                    } else if (age >= 65) {
                        total_price *= 0.7;
                        total_price *= 0.8;
                        total_price *= 2;
                        System.out.println("Toplam Tutar : " + total_price + " TL");
                    }
                    break;
            }
        }
    }
}
