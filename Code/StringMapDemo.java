import java.util.HashMap;
class StringMapDemo{
	public static void main(String [] args){
		String s = "ammaappa";
		HashMap<Character,Integer> charCountMap = new HashMap();
		System.out.println(charCountMap);
		char [] ch = s.toCharArray();
		for(char c : ch){
			System.out.println(c);
		}
	}
}