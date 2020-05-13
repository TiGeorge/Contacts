import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char ch = s.charAt(0);
        System.out.println(ch == 'j' || ch == 'J');

    }
}