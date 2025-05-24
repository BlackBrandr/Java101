package Programs;

import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {

        int year,remainder;
        String zodiac;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz : ");
        year = input.nextInt();

        remainder = year % 12;

        switch (remainder){

            case 0 :
                zodiac = "Maymun";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 1 :
                zodiac = "Horoz";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 2:
                zodiac = "Köpek";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 3 :
                zodiac = "Domuz";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 4 :
                zodiac = "Fare";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 5 :
                zodiac = "Öküz";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 6 :
                zodiac = "Kaplan";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 7 :
                zodiac = "Tavşan";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 8 :
                zodiac = "Ejderha";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 9 :
                zodiac = "Yılan";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 10 :
                zodiac = "At";
                System.out.println("Burcunuz : " + zodiac);
                break;
            case 11 :
                zodiac = "Koyun";
                System.out.println("Burcunuz : " + zodiac);
                break;
        }

    }
}