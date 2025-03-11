import java.util.Scanner;
class MatrixIdentity{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("enter the row of the matrix size");
		int row = scan.nextInt();
		System.out.print("enter the column of the matrix size");
		int column = scan.nextInt();
		if(row == column){
			int arr[][] = new int [row][column];
			int i, j;
			System.out.println("enter your matrix");
			for(i=0; i<row; i++){
				for(j=0; j<column; j++){
					arr[i][j] = scan.nextInt();
				}
				System.out.println();
			}

			int arr2[][] = new int [row][column];
			int k, l;
			for(k=0; k<row; k++){
				for(l=0; l<column; l++){
					if(k == l){
						arr2[k][l] = 1;
					}else{
						arr2[k][l] = 0;					
					}
				}
				System.out.println();
			}

			int arr3[][] = new int [row][column];
			int p, q;
			for(p=0, i=0, k=0; p<row; p++, i++, k++){
				for(q=0, j=0, l=0; q<column; q++, j++, l++){
					arr3[p][q] = arr[i][j] * arr2[l][k];
				}
				System.out.println();
			}

			for(p=0; p<row; p++){
				for(q=0; q<column; q++){
					System.out.print(arr3[p][q]+" ");	
				}
				System.out.println();
				System.out.println();
			}
		}else{
			System.out.print("Matrix size not valid");		
		}
	}
}