class Zoho3{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int i=0;
		int n = 3;
		while(i<n){
			int sum =0, j=i;
			while(j<arr.length){
				sum = sum+arr[j];
				j=j+3;
			}
			i++;
			System.out.println(sum);
		}
	}
}