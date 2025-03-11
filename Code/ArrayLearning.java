package Array;
import java.util.Arrays;
import java.util.Comparator;
public class ArrayLearning{
	public static void main(String [] args){
		String [] arr = {"habi", "nathiya", "kamal", "anbu"};
		Arrays.sort(arr);
		System.out.println("ascending order");
		for(String s : arr){
			System.out.println(s);
		}
		ArrayCompare cd = new ArrayCompare();
		Arrays.sort(arr, cd);
		System.out.println("Descending order ");
		for(String s : arr){
			System.out.println(s);
		}
	}
}