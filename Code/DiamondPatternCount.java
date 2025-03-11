import java.util.Scanner;
class DiamondPatternCount{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l, m, count = 1, k=1;
		for(int i=-(n-1); i<n; i++){
			l=(i<0)?-i:i;
			for(int j=-(n-1); j<n; j++){
				m=(j<0)?-j:j;
				if(l+m<n){
					if(l%2 ==0){
						System.out.print(count++ +" ");
					}else{
						System.out.print(count-- +" ");
					}
				}
				else{
					System.out.print("  ");
				}	
			}
			System.out.println();
			if(i<0){
				count = count+(2*k);
				k++;
			}else{
				System.out.print("* "); 
			}
			
		}
	}
}