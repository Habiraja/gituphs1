import java.util.Scanner;

public class ZigZagMatrix {
    public static void printZigZag(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Left to Right for even rows
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Right to Left for odd rows
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println(); // New line for next row
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

        System.out.println("\nZig-Zag Traversal:");
        printZigZag(matrix, n, m);

        scanner.close();
    }
}
