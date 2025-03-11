import java.util.Scanner;
class Hcf{
	public static void main(String [] args){
		System.out.print("how many numbers are there ::");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int [n];
		System.out.println("enter the numbers below :: ");
		for(int i=0; i<n; i++){
			System.out.print(i+1 +".");
			arr[i] = scan.nextInt();
		}

		int min = arr[0];
		for(int i=0; i<n; i++){
			min = (min<arr[i])?min:arr[i];
		}
		
 
		int count =0, hcf =0, flag =0;
		for(int i=min; i>0; i--){
			for(int j=0; j<n; j++){
				if(arr[j]%i ==0){
					count ++;
					if(count == n){
						hcf = i;
						flag =1;
						break;
					}
				}
			}
			count =0;
			if(flag ==1){
				break;
			}
		}
		System.out.print("hcf = "+hcf);
	}
}