import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse each word in the string
        String result = reverseEachWord(input);

        // Print the result
        System.out.println("Reversed words: " + result);
    }

    public static String reverseEachWord(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Reverse each word and append it to the result
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        // Trim the trailing space and return the result
        return reversedString.toString().trim();
    }
}
