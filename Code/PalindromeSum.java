class PalindromeSum{
	public static void main(String [] args){
		String name = "madam";
		for(int i=0, j=name.length()-1; j>i; i++,j--){
			if(name.charAt(i) != name.charAt(j)){
				System.out.println("not palindrome");
				return;
			}
		}
		System.out.println("its palindrome");
	}
}