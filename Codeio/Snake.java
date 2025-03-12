//sum9
class Snake{
	public static void main(String [] args){
		int count =1;
		int n=7;
		int [][] arr = {{1,2,3,5},{4,5,6,8},{10,7,8,9},{1,2,3,4}};
		for(int i=0; i<arr.length; i++){	
			boolean check = false;
			for(int j=0; j<arr.length; j++){
				if(i%2==0){
					System.out.print(arr[i][j] +" ");
				}else{
					System.out.print(arr[i][arr.length-j-1] +" ");							check = true;
				}
			}
			System.out.println();
		}
	}	
}