import java.util.HashSet;
class Setexample
{
	public static void main(String[]args)

{
	HashSet<String>Set = new HashSet<>();
	Set.add("apple");
	Set.add("mango");
	Set.add("kiwi");
	String[] setArray = Set.toArray(new String[0]);
	for(String set : setArray)
	{
	  System.out.print(set+" ");
	}
}
}	