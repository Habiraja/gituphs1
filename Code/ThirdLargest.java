class ThirdLargest{
	public static void main(String [] args){
		int [] arr = {4, 5, 5};
		int fMax = arr[0], sMax = 0, tMax=0;
		for(int i=1; i<arr.length; i++){
			if(fMax < arr[i]){
				tMax = sMax;
				sMax = fMax;
				fMax = arr[i];
			}
			else if(fMax != arr[i] && sMax < arr[i]){
				tMax = sMax;
				sMax = arr[i];
				
			}
			else if(tMax < arr[i] && sMax != arr[i] && sMax != tMax){
				tMax = arr[i];
			}
		}
		System.out.println("fMax = "+fMax);
		System.out.println("sMax = "+sMax);
		System.out.println("tMax = "+tMax);
	}
}