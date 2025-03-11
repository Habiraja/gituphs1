import java.util.Scanner;
import java.lang.Math;
class TreeSum{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the how many rows :: ");
		int row = scan.nextInt();
		int arrSize = (int)Math.pow(2,row);
		int [][] arr = new int[row][arrSize-1];
		System.out.println("enter the numbers ::");
		for(int i=0; i<row; i++){
			for(int j=0; j<Math.pow(2, i); j++){
				arr[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		int count =0;
		for(int i=0; i<row; i++){
			for(int j=0; j<(int)Math.pow(2,i); j++){
				if(arr[i][j] %2 !=0){
					count ++;
				}	
			}
			if(count == Math.pow(2, i)){
				System.out.println("yes");
			}
			count =0;
		}	
	}
}