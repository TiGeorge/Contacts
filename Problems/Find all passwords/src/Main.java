import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("(password:?\\s*)([a-z0-9]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean find = false;
        while (matcher.find()) {
            find = true;
            System.out.println(matcher.group(2));
        }
        System.out.println(find ? "" : "No passwords found.");
    }
}