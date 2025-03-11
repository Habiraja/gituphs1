import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find and display the longest word
        String longestWord = findLongestWord(input);
        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String str) {
        // Split the string into words
        String[] words = str.split("\\s+"); // Split by one or more spaces
        String longestWord = "";

        // Traverse the words to find the longest
        for (String word : words) {
             longestWord = (longestWord.length()>word.length())?longestWord : word;
        }

        return longestWord;
    }
}
