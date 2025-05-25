import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mine_Sweeper {
    private int row;
    private int column;
    private int mine_count;
    private String[][] mine_field;
    private String[][] user_field;
    private Scanner input = new Scanner(System.in);

    public Mine_Sweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.mine_count = (row * column) / 4;
        this.mine_field = new String[row][column];
        this.user_field = new String[row][column];
    }

    public void run() {
        prepareGame();

        boolean gameOver = false;
        int remainingCells = (row * column) - mine_count;
        
        while (!gameOver) {
            printField();
            
            // Kullanıcıdan koordinat al
            int[] coordinates = getCoordinates();
            int selectedRow = coordinates[0];
            int selectedCol = coordinates[1];
            
            // Mayın kontrolü
            if (mine_field[selectedRow][selectedCol].equals("*")) {
                // Mayına bastı, oyun bitti
                user_field[selectedRow][selectedCol] = "*";
                System.out.println("\nOYUN BİTTİ! Mayına bastınız!");
                printFinalField();
                gameOver = true;
            } else {
                // Mayın yok, etraftaki mayın sayısını hesapla
                int mineCount = countAdjacentMines(selectedRow, selectedCol);
                user_field[selectedRow][selectedCol] = String.valueOf(mineCount);
                remainingCells--;
                
                // Tüm güvenli hücreler açıldıysa oyun kazanıldı
                if (remainingCells == 0) {
                    System.out.println("\nTEBRİKLER! Oyunu Kazandınız!");
                    printFinalField();
                    gameOver = true;
                }
            }
        }
    }

    private void prepareGame() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mine_field[i][j] = "-";
                user_field[i][j] = "-";
            }
        }

        Random random = new Random();
        int placedMines = 0;
        
        while (placedMines < mine_count) {
            int randomRow = random.nextInt(row);
            int randomCol = random.nextInt(column);
            
            if (mine_field[randomRow][randomCol].equals("-")) {
                mine_field[randomRow][randomCol] = "*";
                placedMines++;
            }
        }

        System.out.println("Mayın Haritası");
        for (String[] row : mine_field) {
            System.out.println(Arrays.toString(row));
        }

    }
    
    private void printField() {
        System.out.println("\nMayın Tarlası Oyunu:");
        for (String[] row : user_field) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    private void printFinalField() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mine_field[i][j].equals("*")) {
                    System.out.print("* ");
                } else {
                    System.out.print(user_field[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    private int[] getCoordinates() {
        int selectedRow, selectedCol;
        
        while (true) {
            System.out.println("\nLütfen bir nokta seçin:");

            System.out.print("Satır: ");
            selectedRow = input.nextInt();
            if (selectedRow < 0 || selectedRow >= row) {
                System.out.println("Geçersiz satır! 0-" + (row-1) + " arasında bir değer girin.");
                continue;
            }

            System.out.print("Sütun: ");
            selectedCol = input.nextInt();
            if (selectedCol < 0 || selectedCol >= column) {
                System.out.println("Geçersiz sütun! 0-" + (column-1) + " arasında bir değer girin.");
                continue;
            }

            if (!user_field[selectedRow][selectedCol].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin!");
                continue;
            }
            break;
        }
        return new int[]{selectedRow, selectedCol};
    }
    
    private int countAdjacentMines(int row, int col) {
        int count = 0;

        for (int i = Math.max(0, row-1); i <= Math.min(row+1, this.row-1); i++) {
            for (int j = Math.max(0, col-1); j <= Math.min(col+1, this.column-1); j++) {

                if (i == row && j == col) {
                    continue;
                }
                if (mine_field[i][j].equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        System.out.print("Satır sayısını girin: ");
        int row = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int column = scanner.nextInt();
        
        Mine_Sweeper game = new Mine_Sweeper(row, column);
        game.run();
        
        scanner.close();
    }
}