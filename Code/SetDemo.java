import java.util.LinkedHashSet;
import java.util.LinkedList;
class SetDemo{
	public static void main(String [] args){
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(20);
		System.out.println("at first"+l);
		LinkedHashSet lhs = new LinkedHashSet(l);
		System.out.println(lhs);
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(12);
		hs.add(11);
		hs.add(17);
		hs.add(8);	
		hs.add(8);
		System.out.println(hs);
	}
}