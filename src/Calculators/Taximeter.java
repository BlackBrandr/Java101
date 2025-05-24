import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        double ride_fee = 2.20, kilometer, opening_fee = 10, minimum_fee = 20, total_fee;

        Scanner input = new Scanner(System.in);

        System.out.println("Kilometre Giriniz : ");
        kilometer = input.nextDouble();

        total_fee = (kilometer * ride_fee);

        total_fee += opening_fee;


        total_fee = (total_fee < 20) ? 20 : total_fee;
        System.out.println("Tutar : " + total_fee);

    }

}
