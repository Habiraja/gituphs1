import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class HashMapDemo{
	public static void main(String [] args){
		HashMap hm = new HashMap();
		hm.put("suriyan", 200);
		hm.put("nithya", 201);
		hm.put("vishal", 202);
		System.out.println(hm);
		Set s = hm.keySet();
		System.out.println("keys are"+s);
		Collection c = hm.values();
		System.out.println("values are"+c);
		Set s2 = hm.entrySet();
		System.out.println(s2);
	}
}