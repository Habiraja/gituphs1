import java.util.ArrayList;
import java.util.List;
class ArrayListDemo{
	public static void  main(String [] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(3);
		al.add(8);;
		al.add(18);
		al.add("habiraja");
		al.add(3);
		al.add("vishal" );
		al.set(4, "vishal" );
		System.out.println(al.indexOf("vishal"));
		System.out.println(al.lastIndexOf("vishal"));
		 //System.out.println(al);
		//System.out.println(al.contains("vishal"));
		//System.out.println(al.get(1));
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println("al list : "+al2);
		ArrayList al3 = new ArrayList();
		al3.add("Chennai");
		al3.add("New Delhi");
		al3.add("Kolkata");
		al3.add("Mumbai");
		System.out.println(al3);
		al3.addAll(3, al);
		System.out.println("after addition :");
		System.out.println(al3);
		al3.removeAll(al);
		System.out.println("after remove all al");
		System.out.println(al3);
		List al4 = al3.subList(0,3);
		System.out.println(al4);
	}
}