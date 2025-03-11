import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class ArrayCheck{
	String name;
	int age;
	public String toString(){
		return " "+this.name+ " "+this.age;
	}
	public ArrayCheck(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String [] args){

		ArrayCheck name1 = new ArrayCheck("habi", 24);
		ArrayCheck name2 = new ArrayCheck("naveen", 29);
		ArrayCheck name3 = new ArrayCheck("kamalesh", 22);
		ArrayList al = new ArrayList();
		al.add(name2);
		al.add(name1);
		al.add(name3); 
		System.out.println("before"+al);
		ComparatorDemo cd = new ComparatorDemo();
		
		Collections.sort(al, cd);
		System.out.println("after"+al);
	}
}