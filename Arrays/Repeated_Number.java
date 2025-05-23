package Arrays;

public class Repeated_Number {

    static boolean isFind(int [] arr, int value){
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list = {3,4,3,3,2,9,10,2,1,4,9,1};
        int [] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex] = list[i];
                        startIndex++;
                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0 && value % 2 != 1){
                System.out.println(value);
            }
        }
    }
}
