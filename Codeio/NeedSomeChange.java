//sum6
class NeedSomeChange{
	public static void main(String [] args){
		int [] arr ={1, 2, 3, 4, 5};
		for(int i=0; i<arr.length-2; i++){
			int temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}	
}