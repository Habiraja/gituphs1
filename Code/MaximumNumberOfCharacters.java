class MaximumNumberOfCharacters{
	public static void main(String [] args){
		String s = "abba";
		int count = 0, add =0;
		boolean check = false;
		
		for(int i=0; i<s.length()-1; i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					check = true;
					break;
				}
				else{
					count ++;
				}
			}
			if(check == true && count > add){
				add = count;
			}
			count =0;
			check = false;
		}
		System.out.print("ans is "+add);
	}
}