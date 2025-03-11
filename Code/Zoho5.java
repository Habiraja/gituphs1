import java.util.Arrays;
class Zoho5{
	public static void main(String [] args){
		int [] arr = {2,3,5,10,7,9,1};
		if(arr.length %2 ==0){
			System.out.print("not valid");
			return;
		}
		Arrays.sort(arr);
		for(int i=1; i<arr.length-1; i=i+2){
			if(arr[i] < arr[i+1]){
				arr[i] = arr[i]+arr[i+1];
				arr[i+1] = arr[i] - arr[i+1];
				arr[i] = arr[i] - arr[i+1];	
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}