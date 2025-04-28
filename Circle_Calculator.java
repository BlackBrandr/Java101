import java.util.Scanner;

public class Circle_Calculator {
    public static void main(String[] args) {

        double pi = 3.14, r, area, perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçap giriniz: ");
        r = input.nextDouble();
        area = pi * r * r;
        perimeter = 2 * pi * r;

        System.out.println("Alan : " + area);
        System.out.println("Çevre : " + perimeter);

    }
}
