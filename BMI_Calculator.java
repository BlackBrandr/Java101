import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {

        double weight, height, bmi;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        weight = input.nextDouble();
        System.out.println("Please enter your height: ");
        height = input.nextDouble();

        bmi = weight / (height*height);

        System.out.println("Your BMI: " + bmi);
    }
}
