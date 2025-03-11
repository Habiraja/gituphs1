import java.util.Scanner;
class HappyNumber{
	public static void repeat(int n){
		int remainder =0, add =0;
		while(n>0){
			remainder = n%10;
			n=n/10;
			add = add + remainder* remainder;
		}
		if(add == 1){
			System.out.println("it is happy ");
			return;
		}
		else if(add ==4){									System.out.println("it is not happy ");		
			return;
		}
		repeat(add);	
	}
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		repeat(n);
	}
}