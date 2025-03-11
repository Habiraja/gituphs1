import java.util.Scanner;
class ChummaSquare{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l, m, k=n;
		for(int i =-(n-1); i<n; i++){
			l = (i<0)?-i:i;
			for(int j =-(n-1); j<n; j++){
				m = (j<0)?-j:j;
				if(l>=j){
					if(-l<=j){
						System.out.print(k +" ");
					}
					else{
						System.out.print(k-- +" ");
					}
				}
				else{
					System.out.print(++k +" ");
				}
			}
			k=n;
			System.out.println();
		}
	}
}