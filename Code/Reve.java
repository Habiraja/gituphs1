import java.util.Scanner;
class Reve{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the word :: ");
		String n = scan.nextLine();
		int len = n.length();
		char [] arr = n.toCharArray();
		String rev ="", rev1 = "";
		for(int i=0; i<len/2+1; i++){
			rev = arr[i] + rev;
		}
		System.out.print(rev);

		for(int i=len/2+1; i<len; i++){
			rev1 = arr[i] + rev1;
		}
		System.out.print(rev1);	
	}
}