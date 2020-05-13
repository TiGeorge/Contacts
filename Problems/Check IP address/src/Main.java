import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String r = "(1\\d\\d|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)";

        String regex = r + "\\." + r + "\\." + r + "\\." + r;

        System.out.println(s.matches(regex) ? "YES" : "NO");
    }
}
