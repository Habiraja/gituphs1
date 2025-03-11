import java.util.Scanner;
class SentenceReverse{
	public static void main(String args[]){
		Scanner scan=new Scanner (System.in);
		String sentence = scan.nextLine();
		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i) == ' ' || i==sentence.length()-1){
				int j= (i == sentence.length()- 1 ? sentence.length()- 1 : i - 1);
				while(j>=0 && sentence.charAt(j) != ' '){																System.out.print(sentence.charAt(j));
					j--;
				}
				System.out.print(" ");
			}
		}
	}
}

