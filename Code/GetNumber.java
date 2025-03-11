import java.util.Scanner;
class GetNumber{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in );
		String word = scan.next();
		int len = word.length();
		int count =0;
		for(int i=0; i<len; i++){
			int c = Character.getNumericValue(word.charAt(i)); 
			if(c >= 1 && c <= 9){
				for(int j=i ; j<len; j++){
					count = count*10 + c;		
				}	
			}
		}
		System.out.print(count);
	}
}