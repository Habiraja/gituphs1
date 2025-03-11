class SentenceReverseWords{
	public static void main(String [] args){
		String n= "nathiya is a good girl";
		for(int i=n.length()-1; i>=0; i--){
			if(n.charAt(i) == ' ' || i==0 ){
				int j = (i==0?0:i+1);
				while(j<n.length() && n.charAt(j) != ' '){
					System.out.print(n.charAt(j));
					j++;
				}
				System.out.print(" ");
			}
		}
	}
}