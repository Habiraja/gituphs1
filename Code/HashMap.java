import java.util.HashMap;
public class Hash{
	public static void main(String [] args){
		int [] arr = {2,3,4,5,5,6,5,4,3,8,9,10};
		HashMap <Integer, Integer> map = new HashMap<>();
		for(Integer num : arr){
			if(map.containsKey(num)){
				map.put(num, map.get(num)+1);
			}
			else{
				map.put(num, 1);
			}
		}
		for(Integer num : map.keySet()){
			if(map.get(num)>1){
				System.out.println(num);
			}
		}
	}
}