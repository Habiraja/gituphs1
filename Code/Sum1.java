import java.util.Scanner;
class Sum1{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String given = scan.nextLine();
		String [] ch = given.toCharArray();
		int count=0;
		for(int i=0; i<given.length(); i++){
			if(given.charAt(i)<10 && given.charAt(i)>0){
				count ++;
			}
		}
		int [] numberArr = new int[count]; 
		String [] characterArr = new String [given.length()-count];
		for(int i=0; i<count; i++){
			//numberArr[i]  = given.charAt(i);
		}
		for(int i=count; i<given.length()-count; i++){
			//characterArr[i]  = given.charAt(i);
		}
	}
}