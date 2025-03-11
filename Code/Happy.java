import java.util.Scanner;
class Happy{
	public static void main(String[] args){
		System.out.print("enter the number");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		int remainder, add=0;
		while(true){
			while(temp>0){
				remainder = temp % 10;
				temp = temp/10;
				add = add+(remainder*remainder);
			}
			if(add==1){
				System.out.print("it is a happy number");
				break;
			}
			else if(add==4){
				System.out.print("it is not a happy number");
				break;
			}
			temp=add;
			add=0;
		} 
	}
}