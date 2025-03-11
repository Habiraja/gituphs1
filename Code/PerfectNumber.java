import java.util.Scanner;
class PerfectNumber{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter the number :: ");
		int n = scan.nextInt();
		int add =0;
		for(int i=n/2; i>0; i--){
			if(n%i == 0){
				add = add + i;
			}
		}
		if(add == n){
			System.out.println("perfect");
		}
		else{
			System.out.println("not perfect");
		}
	}
}