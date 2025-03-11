import java.util.Scanner;		
class SumTest{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		int [] arr = new int [n];
		for(int i=0; i<arr.length; i++){
			arr[i] = scan.nextInt();
		}
		int flag =0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){	
				if(arr[i]<arr[j]){
					System.out.print(arr[j]+" ");
					flag  = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.print(-1+" ");
			}
			flag =0;
		}
	}
}