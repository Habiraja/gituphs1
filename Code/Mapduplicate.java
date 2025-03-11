import java.util.*;
class Mapduplicate
{
	public static void main(String[]args)
{
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a size of array");
      int size = scanner.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter array elements");
      for(int i=0; i<size; i++)
      {
        arr[i] = scanner.nextInt(); 
      }
	HashMap<Integer,Integer> map = new HashMap<>();
	for(Integer number : arr)
	{
	  map.put(number,map.get(number)+1);
	}
	for(Integer number : map.KeySet)
	{
 	  if(map.get(number)>1)
	  {
		System.out.println(number);
	  }
        }
}
}	