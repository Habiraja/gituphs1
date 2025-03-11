class ZohoS3{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,8,6,3,1,2};
		int b =0;
		for(int i=0; i<arr.length-1; i++){
			int add = arr[i] + arr[i+1];
			if(add > b){
				b = add;
			}
		}
		System.out.println(b);
	}
}