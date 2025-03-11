import java.util.HashMap;
class Long{
	public static void main(String [] args){
		String s = "sundarspklsu", ans = "";
		int big =0;
		for(int i=0; i<s.length(); i++){
			String add = "";
			for(int j=i+1; j<s.length(); j++){
				if(add.indexOf(s.charAt(j)) == -1){
					add = add + s.charAt(j);	
				}	
				else{
					break;
				}
			}
			if(big < add.length()){
				big = add.length();
				ans = add;
			}
		}
		System.out.println(ans);
		System.out.println(big);
	}
}