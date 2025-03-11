import java.util.Scanner;
class Leetcode{
	public static void main(String [] args){
		System.out.print("enter the array size : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int [n];
		System.out.println("enter the numbers : ");
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
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
		System.out.print("enter the k : ");
		int k = scan.nextInt();
		int count =0, flag =0;
		for(int i=n-1; i>0; i--){
			count = count + arr[i];
			flag++;
			if(flag == k){
				break;
			}
		}
		System.out.println("ans is : " +count);

		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}		
}