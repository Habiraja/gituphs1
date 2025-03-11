class SecondMax{
	public static void main(String [] args){
		int [] arr = {7,6,7,7};
		int max = arr[0];
		int secondMax = 0;
		for(int i=1; i<arr.length; i++){
			if(max < arr[i]){
				secondMax = max;
				max = arr[i];
			}
			else if(secondMax < arr[i] && max != arr[i]){
				secondMax = arr[i];
			}
		}
		if(secondMax == 0){
			System.out.println("all elements are same");
		}
		else{
			System.out.println("Max "+max);
			System.out.print("Second Max "+secondMax);
		}
		
	}
}