import java.util.Scanner;
class SentenceWordsCount{
	public static void main(String args[]){
		Scanner scan=new Scanner (System.in);
		String sentence = scan.nextLine();
		char [] arr = sentence.toCharArray();
		int count=0, i, j;
		for(i=0; i<sentence.length(); i++){
			for(j=i+1; j<sentence.length(); j++){
				if(arr[i] == '*'){
					break;
				}
				else if(arr[i] == arr[j]){
					count++;
					arr[j] = '*';
				}
			}
				if(arr[i] != '*' && arr[i] != ' '){
				System.out.println(arr[i] + " letter is " +(count+1)+ " times");
			}
			count=0;
		}
	}
}

