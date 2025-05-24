package Programs;

import java.util.Scanner;

public class Diamond_Star{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini giriniz (tek sayı): ");
        int n = input.nextInt();

        // Üst kısım
        for (int i = 0; i <= n/2; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < (n/2)-i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısım
        for (int i = n/2-1; i >= 0; i--) {
            // Boşlukları yazdır
            for (int j = 0; j < (n/2)-i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}