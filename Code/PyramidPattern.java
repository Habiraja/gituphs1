public class PyramidPattern {
    public static void main(String[] args) {
        int n = 7; // Number of rows
        int number = 1; // Start number

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("   "); // 3 spaces for alignment
            }

            int start = number;
            int end = number + (2 * i - 1) - 1;

            // Print numbers for the row
            if (i % 2 != 0) { // Odd rows: Increasing order
                for (int j = start; j <= end; j++) {
                    System.out.printf("%2d ", j);
                    number++;
                }
            } else { // Even rows: Decreasing order
                number += (2 * i - 1); // Move to the next block
                for (int j = end; j >= start; j--) {
                    System.out.printf("%2d ", j);
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
