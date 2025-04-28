import java.util.Scanner;

public class Grocery_Store_Program {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double piece, total_price = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo? : ");
        piece = input.nextDouble();
        total_price += (piece * armut);

        System.out.println("Elma Kaç Kilo? : ");
        piece = input.nextDouble();
        total_price += (piece * elma);

        System.out.println("Domates Kaç Kilo? : ");
        piece = input.nextDouble();
        total_price += (piece * domates);

        System.out.println("Muz Kaç Kilo? : ");
        piece = input.nextDouble();
        total_price += (piece * muz);

        System.out.println("Patlıcan Kaç Kilo? : ");
        piece = input.nextDouble();
        total_price += (piece * patlican);


        System.out.println("Tolam Tutar: " + total_price);
    }
}
