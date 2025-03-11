import java.util.Scanner;
class LcmHcf{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the 1st number ::");
		int a = scan.nextInt();
		System.out.print("enter the 2nd number ::");
		int b = scan.nextInt();
		int min, i;
		min = (a<b)? a : b;
		int c, d;	
		int e=0;

		for(i=min; i>0; i--){
			if(a%i==0 &&  b%i==0){
				c= a/i;
				d = b/i;
				e = c*d*i;
				break;
			}
		}

		System.out.println(" Hcf ::  "+i);
		System.out.println(" Lcm ::  "+e);	
	}
}