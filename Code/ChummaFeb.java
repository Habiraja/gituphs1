import java.util.Scanner;
class ChummaFeb{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = scan.nextInt();
		int a=0, b=1, c=0;
		System.out.print(a+ " ");
		System.out.print(b +" ");
		for(int i=0; i<n-2; i++){
			c = a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		
		}
	}
}