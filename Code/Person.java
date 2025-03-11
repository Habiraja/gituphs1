import java.util.ArrayList;
class Person{
	String name;
	int age;
	int rank;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, int rank){
		this.name = name;
		this.age = age;
		this.rank = rank;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getRank(){
		return rank;
	}
	public String toString(){
		return ""+getName()+" "+getAge()+ " "+getRank();
	}
	public static void main(String [] args){
		ArrayList <Person> al = new ArrayList<>();
		Person p1 = new P
		al.add(new Person("balloon",5));
		al.add(new Person("toy", 10));
		for(Person p : al){
			System.out.println(p);
		}
		Person p1 = al.get(0);
		System.out.println(p1.getName()+ " " +p1.getAge());
	}
}