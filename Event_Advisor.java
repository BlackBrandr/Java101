package Giris2;

import java.util.Scanner;

public class Event_Advisor {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat >= 25){
            System.out.println("Yüzmeye git.");
        } else if (heat <= 25 && heat >= 15 ) {
            System.out.println("Piknik yap.");
        }else if (heat <= 15 && heat >= 5) {
            System.out.println("Sinemaya git.");
        }else if (heat < 5) {
            System.out.println("Kayak yap");
        }
    }
}
