import java.util.Arrays;
class Zoho6{
	public static void main(String [] args){
		int [] arr = {3,8,6,9,4,10,2,5};
		for(int i=0; i<arr.length; i++){
			int big = Integer.MAX_VALUE;
			for(int j=0; j<arr.length; j++){
				if(arr[i]<arr[j] && (arr[j]<big)){							big = arr[j];
				}
			}
			if(big != Integer.MAX_VALUE){
				System.out.print(arr[i] +"->"+big+" ");
			}else{
				System.out.print(arr[i]+"-> ");
			}	
		}
	}
}