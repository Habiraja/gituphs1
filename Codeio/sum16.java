class Sum16{
	public static void main(String [] args){
		String s1 = "aaaaaaaaaa";
		String s2 = "aaaa";

		int i=0, j=0;
		while(i<s1.length()){
			if(s1.charAt(i) == s2.charAt(j)){
				i++;
				j++;
				if(j == s2.length()){
					System.out.println(true);
					System.out.println(i-s2.length());
					return;
				}
			}
			else if(j>0 && s1.charAt(i) != s2.charAt(j)){
				j=0;
			}
			else{
				i++;
				j=0;
			}
		}
		System.out.println(false);
	}
}