class AprilPattern{
	public static void main(String [] args){
		String s = "APRIL";
		char ch;
		int k=0;
		for(int i = 0; i < s.length(); i++){
			int len = s.length()/2;
			for(int j=0; j < s.length(); j++){
				if(i+j >= s.length()-1){
					if(len >= s.length()){
						len = 0;
					}
					ch = s.charAt(len);
					System.out.print(ch+" ");
					len++;
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}