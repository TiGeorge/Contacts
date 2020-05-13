import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int s = 0;
        int f = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                s++;
            } else if (x == 1) {
                f++;
            } else {
                r++;
            }
        }
        System.out.println(s + " " + f + " " + r);
    }
}