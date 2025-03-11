import java.util.ArrayList;
class ArrayListDemo1{
public static void  main(String [] args){
		ArrayList <Person> al = new ArrayList<>();
		al.add(new Person("habi", 25));
		al.add(new Person("kamalesh", 25, 1));
		al.add(new Person("anbu", 30));
		
		for(Person i : al){
			System.out.println(i);
		}
		Person person = al.get(1);
		System.out.println(person.getName()+ " " +person.getRank());
	}
}