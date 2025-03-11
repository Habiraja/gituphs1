class SubString{
	public static void main(String [] args){
		int i=0, j=0;
		String s1 = "hljhadfhabilafas";
		String s2 = "hasd";
		int count=0;
		while(i<s1.length() && j<s2.length()){
			if(s1.charAt(i) == s2.charAt(j)){
				i++;
				j++;
				count++;
				if(count == s2.length()){								System.out.print("it is a substring");
						return;
					}
			}
			else if(j == 0 && s1.charAt(i) != s2.charAt(j)){
				i++;
				if(i == s1.length()){									break;
				}
			}
			else{
				j=0;
				count=0;
			}		
		}
		System.out.print("it is not a substring");	
	}
}