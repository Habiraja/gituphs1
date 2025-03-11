import java.util.ArrayList;
import java.util.Collections;
public class CollectionDemo{
	public static void main(String [] args){
		Laptops dell = new Laptops("hari",10000, 5, true);
		Laptops lenovo = new Laptops("habi",10000, 6, false);
		Laptops hp = new Laptops("siva",10000, true);
		ArrayList laptopList = new ArrayList();
		laptopList.add(lenovo);
		laptopList.add(dell);
		laptopList.add(hp);
		System.out.println("before"+laptopList);
		ComparatorDemo cd = new ComparatorDemo();
		Collections.sort(laptopList, cd);
		System.out.println("after"+laptopList);
	}
}