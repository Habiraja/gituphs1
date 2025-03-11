import java.util.Comparator;
public class ArrayCompare implements Comparator{
	public int compare(Object o1, Object O2){
		String s1 = (String)o1;
		String s2 = o2.toString();
		//int result = s1.compareTo(s2);
		if(s1.length() > s2.length()){
			return 1;
		}else if(s1.length() < s2.length()){
			return -1;
		}else{		
			return 0;
		}
	}
}