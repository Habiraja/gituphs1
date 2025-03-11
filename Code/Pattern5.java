import java.util.Scanner;
class Pattern5{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		int l, count =0;
		for(int i=n-1; i>=0; i--){
			for(int j=-(n-1); j<n; j++){
				l=(j<0)?-j:j;
				if(i+l<n){
					if(j<=0){
						count++;
						System.out.print(count);
					}else{
						count--;
						System.out.print(count);
					}	
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			count =0;
		}
	}
}