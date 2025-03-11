import java.util.Scanner;
class Splits{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the sentense :: ");
		String sentence = scan.nextLine();
		String [] arr = sentence.split(" ");
		int len = sentence.length();
		int count = 0;
		for(int i=0; i<len; i++){
			if(sentence.charAt(i)== ' '){
				count++;
			}
		}
		System.out.println(len);
		for(int i=0; i<=count; i++){
			if(arr[i].length()%2 == 0){
				System.out.println(arr[i]);
			}
			
		}
	}
}