class Discount{
	public static void main(String [] args){
		int arr [] = {2,3,6,5,8,7,5,4,2,4,3};
		int index =0;
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i]<arr[j]){
					System.out.println(arr[j]);
					break;
				}
				if(i == arr.length-1){
					System.out.println(-1);
				}
			}
		}
	}
}