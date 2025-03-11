import java.util.Scanner;
class LongestCommonPrefix{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("enter the array size :: ");
		int n = scan.nextInt();
		String [] arr = new String[n];

		System.out.println("enter the words :: ");
		for(int i=0; i<n; i++){
			arr[i] = scan.next();
		}
		
		
		int [] len = new int[n];
		int small = arr[0].length();
		for(int i=0; i<n; i++){
			small = small<arr[i].length()?small:arr[i].length();
		} 

		int flag=0;
		String count = "";
		for(int i=0; i<small; i++){
			for(int j=1; j<n; j++){
				if(arr[0].charAt(i) == arr[j].charAt(i)){
					flag++;
				}
			}
			if(flag == n-1){
				count = count + arr[0].charAt(i);
			}else{
				System.out.print(count);
			}
			flag=0;
		}
		System.out.println("\""+count+"\"");
	}	
}