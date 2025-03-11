class ZohoS1{
	public static void main(String [] args){
		int x = 50;
		int y = 100;
		int [] arr = {21,63,54,67,13,88,43,57,604,1,100};
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] > x &&  arr [i] < y){
				System.out.println(arr[i]);
			}
		}
	}
}