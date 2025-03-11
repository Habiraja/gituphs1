import java.util.Scanner;
class Lcm{
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
		
		int j =2, q1, q2, hcf=0, lcm=0;	
		while(true){	
			int min = (arr[0]< arr[1])?arr[0]:arr[1];
			for(int i=min; i>0; i--){
				if(arr[0] % i == 0 && arr[1] %i ==0){
					hcf = i;
					q1 = arr[0]/i;
					q2 = arr[1]/i;
					lcm = q1*q2*hcf;
					break;
				}
				
			}
			arr[0] = lcm;
			if(j == n){
				break;
			}
			arr[1] = arr[j];
			j++;
		}
		System.out.println("lcm is :: "+lcm);	 	
	}
}