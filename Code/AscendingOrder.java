import java.util.Scanner;
class AscendingOrder{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the array size :: ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		System.out.print("enter the numbers :: ");
		for(int i=0; i<n; i++){
			arr[i]= scan.nextInt();
		}
		int temp;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 				
				}
			}
		}

		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}