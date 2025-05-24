package Calculators;

import java.util.Scanner;

public class Advanced_Calculator {

    static void plus(){
        Scanner input = new Scanner(System.in);
        int number, i = 1;
        double result = 0;
        String line = "";

        while (true){
            System.out.print(i++ + ". sayı :");
            line = input.nextLine();

            if (line.equals(""))
                break;

            number = Integer.parseInt(line);
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        int number = 0, i = 1;
        double result = 0;
        String line = "";

        System.out.print(i++ + ". sayı :");
        number = Integer.parseInt(input.nextLine());
        result = number;

        while (true){
            System.out.print(i++ + ". sayı :");
            line = input.nextLine();

            if (line.equals(""))
                break;

            number = Integer.parseInt(line);
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void multiply(){
        Scanner input = new Scanner(System.in);
        int number = 0, i = 1;
        double result = 0;
        String line = "";

        System.out.print(i++ + ". sayı :");
        number = Integer.parseInt(input.nextLine());
        result = number;

        while (true){
            System.out.print(i++ + ". sayı :");
            line = input.nextLine();

            if (line.equals(""))
                break;

            number = Integer.parseInt(line);
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divide(){
        Scanner input = new Scanner(System.in);
        int number = 0, i = 1;
        double result = 0;
        String line = "";

        System.out.print(i++ + ". sayı :");
        number = Integer.parseInt(input.nextLine());
        result = number;

        while (true){
            System.out.print(i++ + ". sayı :");
            line = input.nextLine();

            if (line.equals(""))
                break;

            number = Integer.parseInt(line);
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        int base, exponent;
        double result = 1;

        System.out.println("Enter the base number : ");
        base = input.nextInt();
        System.out.println("Enter the exponent : ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result + "");

    }

    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);

    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();

        System.out.println("Enter the mod : ");
        int mod = input.nextInt();

        int result = number % mod;
        System.out.println("Sonuç : " + (result));
    }

    static void rectangleAreaAndPerimeter(){
        Scanner input = new Scanner(System.in);
        double width, height, area, perimeter;

        System.out.println("Enter the width : ");
        width = input.nextDouble();

        System.out.println("Enter the height : ");
        height = input.nextDouble();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu ="\n=============================\n"
                +"1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n"
                + "=============================\n" ;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleAreaAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }

    }
