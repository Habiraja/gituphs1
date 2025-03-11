class Zoho1{
	public static void main(String [] args){
		int [] arr = {9,4,3,1,5,6,8,7,9,10};
		int big =0, sum =0;
		for(int i=1; i<arr.length-1; i++){
			if(arr[i]== arr[i+1]-1 || arr[i]== arr[i+1]+1){
				sum = arr[i]+arr[i+1];
			}
			big = (big>sum)?big:sum;
		}
		System.out.print("ans is :: "+big);
	}
}