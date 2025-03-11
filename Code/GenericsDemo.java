import java.util.TreeSet;
import java.util.ArrayList;
class GenericsDemo{
	
	public static void main(String [] args){
		ArrayList<String> al = new ArrayList<>();
		al.add("muthu");
		al.add("suriyan");
		System.out.println(al);
		GenericsDemo gd = new GenericsDemo();
		gd.add(al);
	}
}