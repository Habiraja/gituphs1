import java.util.Scanner;
class sum4reharcl{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=1;
		
		for(int i=0; i<n; i++){
			boolean check = false;
			for(int j=0; j<n*2-1; j++){
				if((n-2 < i+j ) && (i+j < n*2-1)){
					if(i%2 ==0){ 	
						System.out.print(count++ +" ");
					}else{
						System.out.print(count-- +" ");
						check = true;
					}
				}
				else{
					System.out.print("  ");
				}	
			}
			System.out.println();
			count = count+n-1;
			if(check == true){
				count = count +2;
			}
		}
	}
}