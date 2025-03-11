import java.util.Scanner;
class ChummaFebRec{
	public static void recur(int n, int a, int b, int c){
		c = a+b;
		System.out.print(c +" ");
		a = b;
		b = c;
		n--;
		if(n>2){
			recur(n, a, b, c);
		}
	}
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a =0, b=1, c=0;
		System.out.println("enter the number ");
		int n = scan.nextInt();
		System.out.print(a + " ");
		System.out.print(b + " ");
		recur(n, a, b, c);
	}
}