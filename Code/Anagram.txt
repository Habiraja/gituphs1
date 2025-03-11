class Anagram{	
	public static void main(String [] args){
		String s1 = "nathiya";
		char [] arr1 = s1.toCharArray();
		String s2 = "";
		char [] arr2 = s2.toCharArray();
		
		if(arr1.length != arr2.length){
			System.out.print("not anagram");
			return;
		}
		int flag =0;
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i] == arr2[j]){
					flag =1;
					arr2[j] = '*';
					break;

				}
				
			}
			if(flag == 0){
				System.out.print("not anagram");
				return;
			}
			flag =0;
		}
		System.out.print("it is anagram");
	}
}