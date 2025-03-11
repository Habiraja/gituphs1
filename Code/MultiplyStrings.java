public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "12";
        String b = "172";

        String c = multiplyStrings(a, b);
        System.out.println("c = \"" + c + "\"");
    }

    public static String multiplyStrings(String num1, String num2) {
        int n1 = toInt(num1);
        int n2 = toInt(num2);
        int product = n1 * n2;
        return toString(product);
    }

    public static int toInt(String num) {
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            result = result * 10 + (num.charAt(i) - '0');
        }
        return result;
    }

    public static String toString(int num) {
        if (num == 0) return "0";
        String result = "";
        while (num > 0) {
            result = (char) ('0' + num % 10) + result;
            num /= 10;
        }
        return result;
    }
}
