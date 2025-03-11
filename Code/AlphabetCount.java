class AlphabetCount{
	public static void main(String [] args){
		String s = "h3a13b2i1";hd
		int i=0, count =0, m=0;
		while(i<s.length()){
			m=i;
			int j=i+1;
			while(j<s.length() && (s.charAt(j)>=48 && s.charAt(j)<=57)){
				count = count*10 + Character.getNumericValue(s.charAt(j));
				j++;
				i=j;
			}
			for(int k=0; k<count; k++){
				System.out.print(s.charAt(m));
			}
			count =0;
		}
	}
}