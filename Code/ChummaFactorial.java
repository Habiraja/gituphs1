import java.util.Scanner;
class ChummaFactorial{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = scan.nextInt();
		int mul=1;
		for(int i=n; i>=2; i--){
			mul = mul*i;
		}
		System.out.print(mul +" ");
	}
}