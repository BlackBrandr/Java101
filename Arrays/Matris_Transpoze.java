package Methods.Arrays;

import java.util.Arrays;

public class Matris_Transpoze {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6}};

        int [][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris: ");
        for (int [] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("===========================================");
        System.out.println("Transpoze: ");
        for (int [] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}
