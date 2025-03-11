import java.util.Scanner;
class ChummaPattern{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = scan.nextInt();
		int count =1;
		char ch = 'A';
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i>=j){			
					if(count % 2 == 0){	
						System.out.print((char)(ch+32)+" ");
						count ++;
						ch++;	
					}
					else{
						System.out.print(ch+" ");
						count ++;
						ch++;
					}
				}
			}
			System.out.println();
		}
	}
}