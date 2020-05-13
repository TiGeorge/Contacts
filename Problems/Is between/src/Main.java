import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        System.out.println(s1 >= s2 && s1 <= s3 || s1 <= s2 && s1 >= s3);
    }
}