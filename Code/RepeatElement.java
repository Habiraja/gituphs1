import java.util.Scanner;
class RepeatElement{
	public static void main(String [] args){
		System.out.println("enter the word");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		char [] word = name.toCharArray();
		boolean flag = true;
		int i;
		for(i=0; i<word.length; i++){
			for(int j=i+1; j<word.length; j++){
				if(word[i] == word[j]){
					flag = false; 
					word[j]='*';		
				}
				else if(word[i] == '*'){
					flag = false;
					continue;
				}  		
			}
			if(flag == true){
				break; 
			}
			flag = true;
		}
		if(i == word.length-1){
			System.out.print("-1");
		}else{
			System.out.print("ans : "+word[i]); 
		}
	}
}