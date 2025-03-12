import java.util.Arrays;
class Sum14{
	public static void main(String [] args){
		int [] arr = {1,0,-1,2,3,4};
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++){
			int l = i+1;
			int m = arr.length -1;
			int a =0;
			while(l<m){
				
				if(arr[i] + arr[l] + arr[m] < 0){
					l++;
				}else if(arr[i] + arr[l] + arr[m] > 0){
					m--;
				}
				else{
					System.out.println(true);
					a = 1;
					break;
				}
			}
			if(a == 1){
				break;
			}
		}
	}
}