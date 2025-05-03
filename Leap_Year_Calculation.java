package Giris2;

import java.util.Scanner;

public class Leap_Year_Calculation {
    public static void main(String[] args) {
        int year;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();
        
        switch (year % 100) {
            case 0:
                // Yıl 100'ün katı ise 400'e bölünebilirlik kontrolü yapılır
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
                break;
                
            default:
                // Yıl 100'ün katı değilse 4'e bölünebilirlik kontrolü yapılır
                if (year % 4 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
                break;
        }
    }
}