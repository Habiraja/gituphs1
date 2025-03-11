import java.util.Scanner;
import java.util.ArrayList;
class Chumma{
	public static void primeNumber(){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++ ){
			arr[i] = scan.nextInt();
		}
		ArrayList <Integer> al = new ArrayList<>();
		int flag =0;
		for(int i=0; i<arr.length; i++){
			for(int j=2; j<=arr[i]/2; j++){
				if(arr[i] % j == 0 || arr[i] == 2 || arr[i] == 3){
					flag =1;
					break;
				}
			}
			if(flag == 0){
				
				al.add(arr[i]);
			}
			flag = 0;
		}
		System.out.println(al);
	}
	public static void main(String [] args){
		primeNumber();
	}
}	