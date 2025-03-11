import java.util.Scanner;
public class  Sum27{
    public static int check(String s){
        int [] arr = new int[26];
        for(int i=0; i<s.length(); i++){
        if(s.charAt(i) != ' '){
                arr[s.charAt(i) - 'a'] ++;
            }
        }
        for(int i=0; i<26; i++){
            if(arr[i] != 1){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ::");
        String s = scan.nextLine();
        int result = check(s);
        if(result == 1){
            System.out.println("it is PANGRAM");
        }
        else{
            System.out.println("It is Not");
        }
    }
}