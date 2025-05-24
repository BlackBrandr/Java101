package Number_Operations;

import java.util.Scanner;

public class Number_Sorting {
    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz :");
        number1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        number2 = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz :");
        number3 = input.nextInt();

        if (number1 < number2 && number1 < number3){
            if (number2 < number3){
                System.out.println("Küçükten büyüğe sıralanış bu şekildedir:");
                System.out.println(number1 + "<" + number2 + "<" + number3);
            }else {
                System.out.println("Küçükten büyüğe sıralanış bu şekildedir:");
                System.out.println(number1 + "<" + number3 + "<" + number2);
            }

        }else if (number2 < number1 && number2 < number3){
            if (number1 < number3){
                System.out.println("Küçükten büyüğe sıralanış bu şekildedir:");
                System.out.println(number2 + "<" + number1 + "<" + number3);
            }else {
                System.out.println("Küçükten büyüğe sıralanış bu şekildedir:");
                System.out.println(number2 + "<" + number3 + "<" + number1);
            }

        } else if (number3 < number2 && number3 < number1) {
            if (number2 < number1){
                System.out.println("Küçükten büyüğe sıralanış bu şekildedir:");
                System.out.println(number3 + "<" + number2 + "<" + number1);
            }else {
                System.out.println("Küçükten büyüğe sıralanış bu şekildedir:");
                System.out.println(number3 + "<" + number1 + "<" + number2);
            }
        }
    }
}
