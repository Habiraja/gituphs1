import java.util.*;

public class ReverseStringPreserveSpaces {
    public static String reverseAlphanumeric(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if ((arr[left] <= 97 && arr[left] >= 123) || (arr[left] >=47 && arr[left] <=56)){
                left++;
            } 
            
            else if ((arr[right] >= 97 && arr[right] <= 123) || (arr[right] >=47 && arr[right] <=56)) {
                right--;
            } 
            
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "house!no:12";
        String result = reverseAlphanumeric(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }
}