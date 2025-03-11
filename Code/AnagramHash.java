import java.util.Scanner;
public class AnagramHash{
    public static String anagramHash(String words, String word){
    int [] hash = new int[26];
    if(words.length() != word.length()){
        return "not a anagram";
    }
    for(int i=0; i<word.length(); i++){

        hash[words.charAt(i) - 'a']++;
        hash[word.charAt(i) - 'a']--;
    }
    for(Integer i : hash){
        if(i != 0){
            return "not a anagram";
        }
    }
    return "it is a anagram";
}
    public static void main(String [] args){
        System.out.println("Enter the checking string");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("Enter how many words");
        int n = scan.nextInt();
        System.out.println("Enter the words");
        String [] arr = new String [n];
        for(int i=0; i<n; i++){
            arr[i] = scan.next();
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i] +" --> "+ anagramHash(arr[i], word));
        }  
    }
}