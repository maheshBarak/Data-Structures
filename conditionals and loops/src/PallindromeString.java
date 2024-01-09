public class PallindromeString {
    public static void main(String[] args) {
        String str = "Geeks", copyStr = "";

        int n = str.length();
        int s = 0;

        while (s < n) {
            char ch = str.charAt(s); // extracts each character
            copyStr += ch;
            s++;
        }
        System.out.println(copyStr);
    }
}
