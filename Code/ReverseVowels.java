import java.util.Scanner;
class ReverseVowels{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the word :: ");
		String n = scan.next();
		char [] arr = n.toCharArray();
		int len = n.length();
		String rev ="";
		for(int i=0; i<len; i++){
			if((arr[i] == 'a') || (arr[i] == 'e') || (arr[i] == 'i') || (arr[i] == 'o') || (arr[i] == 'u')){
				rev = arr[i]+rev;
			}
		}
		int j=0;
		for(int i=0; i<len; i++){
			if((arr[i] == 'a') || (arr[i] == 'e') || (arr[i] == 'i') || (arr[i] == 'o') || (arr[i] == 'u')){
				arr[i] = rev.charAt(j);
				System.out.print(arr[i]);
				j++;	
			}else{
				System.out.print(arr[i]);
			}
		}
	}
}