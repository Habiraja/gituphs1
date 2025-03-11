import java.util.Scanner;
class Assenger1{
	public static void main(String [] args){
		System.out.print("enter the arr size : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i]=scan.nextInt();
		}
	
		System.out.print("enter the arr size 2 : ");
		int m = scan.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++){
			b[i]=scan.nextInt();
		}
		System.out.print("enter the value : ");
		int value = scan.nextInt();
		int count =0, flag =0;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(b[i]==a[j]){
					flag=1;
					a[j]=-1;
					break;
				}else{
					flag =0;
				}	
			}
			if(flag == 1){
				count += b[i]*value;
			} else {
				count += -(b[i]*value);
			}
		}
		
			System.out.print("ans is :"+count);
		
	}
}