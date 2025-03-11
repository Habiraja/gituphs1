import java.util.Scanner;

public class DiagonalZigZagMatrix {
    public static void printDiagonalZigZag(int[][] matrix, int n, int m) {
        int row = 0, col = 0;
        boolean upward = true; // Direction flag

        for (int i = 0; i < n * m; i++) {
            System.out.print(matrix[row][col] + " ");

            // Moving Up-Right
            if (upward) {
                if (col == m - 1) { // Last column, move down
                    row++;
                    upward = false;
                } else if (row == 0) { // First row, move right
                    col++;
                    upward = false;
                } else { // Move diagonally up-right
                    row--;
                    col++;
                }
            } 
            // Moving Down-Left
            else {
                if (row == n - 1) { // Last row, move right
                    col++;
                    upward = true;
                } else if (col == 0) { // First column, move down
                    row++;
                    upward = true;
                } else { // Move diagonally down-left
                    row++;
                    col--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter number of columns (m): ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDiagonal Zig-Zag Traversal:");
        printDiagonalZigZag(matrix, n, m);

        scanner.close();
    }
}
