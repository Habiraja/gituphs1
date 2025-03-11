import java.util.Scanner;
class ArraySum{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("give the array size :: ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the numbers :: ");
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(arr[i] > arr[j]){
					arr[i] = arr[i] - arr[j];
					break;
				}
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
	}
}