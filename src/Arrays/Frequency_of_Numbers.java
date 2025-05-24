package Arrays;

import java.util.Arrays;

public class Frequency_of_Numbers {
    public static void main(String[] args) {

        int [] list = {10,20,20,10,10,20,5,20};

        Arrays.sort(list);

        int [] counted = new int[list.length];
        int countedIndex = 0;

        for (int i = 0; i < list.length; i++) {

            if (isAlreadyCounted(counted, list[i])){
                continue;
            }

            int frequency = 0;
            for(int value : list) {
                if (value == list[i]) {
                    frequency++;
                }
            }

            counted[countedIndex++] = list[i];

            System.out.println(list[i] + "sayısı " + frequency + " kere tekrar edildi");
            frequency = 0;
        }
    }

    static boolean isAlreadyCounted(int [] arr, int value){
        for (int i : arr) {
            if (i == value && i != 0)
                return true;
        }
        return false;
    }
}
