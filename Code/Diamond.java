import java.util.Scanner;
class Diamond{
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);	
		System.out.print("enter the number :: ");
		int n = scan.nextInt();
		int i, j, l, m, count=0;
		for(i=-(n-1) ;i<n; i++){
			l=(i<0)?-i:i;
			for(j=-(n-1); j<n; j++){
				m=(j<0)?-j:j;
				if(l+m <=n-1){
					count++;
					System.out.print(count+" ");
					if(count<10){
						System.out.print(" ");	
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}