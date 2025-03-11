import java.util.Scanner;
class TwoSum{
	public static void main(String [] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("enter the array size :: ");
		int n = scan.nextInt();
		System.out.print("enter the numbers :: ");
		int [] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		System.out.print("enter the target :: ");
		int target = scan.nextInt();
		boolean pairFound = true;
		int [] num = new int[2];
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i]+arr[j] == target){
					pairFound = false;
					num [i] = i;
					num[j]	= j;
				}
			}
		}

		for(int i : num){
			System.out.print(i);
		}
		if(pairFound){
			System.out.print("no pair");
		}
	}
}