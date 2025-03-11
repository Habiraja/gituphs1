class Sol{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 8;
		int left = 0;
		int right = arr.length-1;
		while(left < right){
			int mid = (left + right)/2;
			if(arr[mid] == target){
				System.out.println(mid);
				break;
			}	 	
			else if(arr[mid] < target){
				left = mid+1;
			}
			else{
				right = mid -1;
			}
		}
	}
}