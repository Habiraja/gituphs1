public class MatrixMultiplicationChat{
    public static void main(String[] args) {
        // Define a 2x3 matrix
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Define a 3x2 matrix
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Resultant matrix will be 2x2 (rows of matrixA x columns of matrixB)
        int[][] result = new int[2][2];

        // Perform multiplication
        for (int i = 0; i < result.length; i++) { // Rows of matrixA
            for (int j = 0; j < result[0].length; j++) { // Columns of matrixB
                    result[i][j] += matrixA[i][j] * matrixB[j][i];
                }
            }
        }

       for(int i=0; i<result.length; i++){
		for(int j=0; j<result[0].length; j++){
			System.out.println(result[i][j]);
		}
	} 
    
}
