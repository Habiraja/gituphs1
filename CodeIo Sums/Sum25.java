import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Sum25{
    public static String check(String arr[]){
    HashMap <String , Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
        }else{
            map.put(arr[i], 1);
        }
    }
    int max=0, secondMax=0;  
    for(Integer nums : map.values()){
        if(max < nums){
            secondMax = max;
            max = nums;
        }
        else if(secondMax<nums && max>nums){
            secondMax = nums;
        }
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        String key = entry.getKey();   // Getting the key
        int value = entry.getValue();  // Getting the value
        if(value == secondMax){
            return key;
        }
    }
    return null;
}

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scan.nextInt();
        System.out.println("Enter the Strings");
        String [] arr = new String [size];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.next();
        }
        System.out.println(check(arr));
    }
}