import java.util.ArrayList;
class MergeArray{
	public static void main(String [] args){
		int [] arr1 = {5,4,2,1};
		int [] arr2 = {3,4,5,6};
		ArrayList <Integer>al = new ArrayList<>();
		for(int i=0; i<arr1.length; i++){
			al.add(arr1[i]);
			al.add(arr2[i]);
		}
		//al.add(5,7);
		al.add(85);
		System.out.println(al);
	}
}