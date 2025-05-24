package Programs;

import java.util.Scanner;

public class Pattern_Recursive {

    static void pattern(int number, int initial_Number, boolean increasing){

        System.out.print(number + " ");

        if (number == initial_Number && increasing) {
            return;
        }


        if (number <= 0){;
            pattern(number + 5,initial_Number, true);
        }
        else if(increasing) {
            pattern(number + 5,initial_Number, true);
        }else {
            pattern(number - 5, initial_Number, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        pattern(number, number, false);
    }
}
