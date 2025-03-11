import java.util.Scanner;
class BigNum{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the array size :: ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		System.out.print("enter the numbers :: ");
		for(int i=0; i<n; i++){
			arr[i]= scan.nextInt();
		}
		int big;
		big = arr[0];
		for(int i=1; i<n; i++){
			big = (big<arr[i])?arr[i]:big;
		}
		System.out.print("answer is : "+big);
		InstaUser obj = new InstaUser();
		obj.setValues(habi, habipass, 9578605803, habiraja.sundararajan@gmail.com, anbarasi5);
	}
}