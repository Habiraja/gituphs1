import java.util.Scanner;
public class Sum32{
    public static int check(int n){
        int add =0, remainder=0;
        while(n>0){
            remainder = n % 2;
            n=n/2;
            add = add *10 + remainder;
        }
        return add;
    }
    public static void main(String [] args){
        System.out.println("Enter the number ::");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = check (n);
        System.out.println("Binary number is :: "+result);
    }
}