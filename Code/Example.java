import java.util.HashMap;
class Example
{
       public static void main(String[]args)
{
       HashMap<String,Integer>map = new HashMap<>();
       map.put("cat" , 6);
       map.put("horse",9);
       System.out.println(map.entrySet());
}
}