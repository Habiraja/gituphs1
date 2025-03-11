import java.util.Scanner;
class MatrixTrans{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row of matrix size");
		int row = scan.nextInt();		
		System.out.println("enter the column of matrix size");
		int column = scan.nextInt();

		System.out.println("enter the numbers");
		int i, j;
		int arr[][] = new int[row][column];		
		for(i=0; i<row; i++){
			for(j=0; j<column; j++){
				arr[i][j] = scan.nextInt();
			}
			System.out.println();
		}

		int k, l;
	
		int arr2[][] = new int[column][row];
		for(k=0, i=0; k<column; k++, i++){
			for(l=0, j=0; l<row; l++, j++){
				arr2[k][l] = arr[j][i];
			}
			System.out.println();
		}

		for(k=0; k<column; k++){
			for(l=0; l<row; l++){
				System.out.print(arr2[k][l]+" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}