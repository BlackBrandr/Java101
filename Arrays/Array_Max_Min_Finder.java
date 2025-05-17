package Arrays;

import java.util.Arrays;

public class Array_Max_Min_Finder {

        public static int findFloor(int[] list, int number) {

            Arrays.sort(list);

            int index = Arrays.binarySearch(list, number);

            if (index >= 0) {
                return list[index];
            }

            int insertionPoint = -index - 1;

            if (insertionPoint == 0) {
                return Integer.MIN_VALUE;
            }

            return list[insertionPoint - 1];

        }

        public static int findCeiling(int[] list, int number) {

            Arrays.sort(list);

            int index = Arrays.binarySearch(list, number);

            if (index >= 0) {
                return list[index];
            }

            int insertionPoint = -index - 1;

            if (insertionPoint == list.length) {
                return Integer.MAX_VALUE;
            }

            return list[insertionPoint];

        }

    public static void main(String[] args) {

        int[] arr = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(arr);

        int target = 5;
        System.out.println(target + " sayısından küçük en büyük sayı: " + findFloor(arr, target));
        System.out.println(target + " sayısından büyük en küçük sayı: " + findCeiling(arr, target));


    }
}
