package Number_Operations;

public class Palindrom_Numbers {

    static boolean isPalindrom(int number){
        int reverse = 0, temp = number, remainder;
        while (temp != 0){
            remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp /= 10;
        }


        if (number == reverse)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(232));

    }


}
