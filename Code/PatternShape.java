import java.util.Scanner;
class PatternShape{
	public static void main(String[] args){
		System.out.print("enter the number :: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==1 || j==1 || i+j==n+1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}