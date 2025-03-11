class Brackets{
	public static void main(String [] args){
		char a = '{', b = '}';
		int n = 5;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i+j>=n-1){
					for(int k=0; k<=i; k++){
						System.out.print(a);
					}
					for(int k=0; k<=i; k++){
						System.out.print(b);
					}
					System.out.print(" ");
				}
				else{
					System.out.print(" ");
					for(int l=0; l<n; l++){
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
	}
}