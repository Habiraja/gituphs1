import java.util.Scanner;
class sum5{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int length = scan.nextInt();
		System.out.println("enter the sentence");
		String sen = scan.nextLine();
		int space = length - sen.length();
		int count =0;
		for(int i=0; i<sen.length(); i++){
			if(sen.charAt(i) == ' '){
				count ++;	
			}
		}
		int divide = space/count;
		for(int i=0; i<sen.length(); i++){
			if(sen.charAt(i) == ' '){
				
			}
		}
	}
}