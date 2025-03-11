import java.util.Scanner;
class Filo{
	public static void main(String [] args){
		System.out.print("enter the number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int count =0, flag =0, j=1;
		for(int i=j; i<=num; i++){
			count = count+i;
			if(count>num){
				j=j+1;
				i=j-1;
				count=0;
			}
			else if(count == num){
				flag=flag+1;
				j=j+1;
				i=j-1;
				count=0;
			}
		}

		System.out.print("ans is : "+flag);
	}
}