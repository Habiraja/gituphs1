import java.util.Scanner;
class Sum4{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=0;
		for(int i =0; i<n; i++){
			for(int j=0; j<n*2+2; j++){
				if(i+j > n && i+j <=n*2){
					if(j>=n-1){
						System.out.print(++count +" ");
					}
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}