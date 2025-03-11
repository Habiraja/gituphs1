import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the word :: ");
		String word = scan.next();
		int len = word.length();
		String rev ="";
		for(int i=0; i<len; i++){
			rev = word.charAt(i) + rev;
		}	
		System.out.print("reversed string is :: "+rev);
		if(rev.equals(word)){
			System.out.print("it is palindrome");
		}else{
			System.out.print("it is not palindrome");
		}
	}	
}