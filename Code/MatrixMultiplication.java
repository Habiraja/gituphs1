import java.util.Scanner;
public class MatrixMultiplications{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row of the  1st matrix size");
		int row1 = scan.nextInt();
		System.out.println("enter the column of the 1st matrix size");
		int column1 = scan.nextInt();
		System.out.println("enter the row of the  2nd matrix size");
		int row2 = scan.nextInt();
		System.out.println("enter the column of the 2nd matrix size");
		int column2 = scan.nextInt();
		int i, j;
		if(row1 != column2 || row2 != column1){
			System.out.print("matix size not valid");
			return;
		}
		System.out.println("enter the 1st matrix numbers :: ");
		int arr1[][] = new int[row1][column1];
		for(i=0; i<row1; i++){
			for(j=0; j<column1; j++){
				arr1[i][j] = scan.nextInt();
			}
			System.out.println();
		}
	
		System.out.println("enter the 2nd matrix numbers :: ");
		int arr2[][] = new int[row2][column2];
		for(i=0; i<row2; i++){
			for(j=0; j<column2; j++){
				arr2[i][j] = scan.nextInt();
			}
			System.out.println();
		}
			
		int row3 = row1;
		System.out.println(row3);
		int column3 = column2;
		System.out.println(column3);
		int arr3[][] = new int[row3][column3];
		for(i=0; i<row3; i++){
			for(j=0; j<column3; j++){
				arr3[i][j] =arr3[i][j]+ arr1[i][j] * arr2[j][i];
			} 
			System.out.println();
		}
		System.out.println("result is :: ");
		for(i=0; i<row3; i++){
			for(j=0; j<column3; j++){
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}	
	}
}