import java.util.Scanner;

public class Hypotenuse_Calculator {
    public static void main(String[] args) {

        double taban, dik_kenar, hipotenus ;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban Uzunluğu Giriniz: ");
        taban = input.nextDouble();
        System.out.println("Dik Kenar Uzunluğu Giriniz: ");
        dik_kenar = input.nextDouble();

        hipotenus = Math.sqrt((taban*taban) + (dik_kenar*dik_kenar));
        System.out.println("Hipotenüs Uzunluğu: " + hipotenus);



    }
}
