import java.util.Scanner;
public class WordReverse{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name =scan.nextLine();
		int sub =0;
		
		for(int i=0;i<name.length();i++){ 
		    if(name.charAt(i)==' '){
		           for(int j=i-1;j>=sub;j--){
		            System.out.print(name.charAt(j));
		           }
		     System.out.print(" ");
		     sub =i+1;   
		    }
		}
		for (int i = name.length() - 1; i >= sub; i--){
            System.out.print(name.charAt(i));
        }
	}
}