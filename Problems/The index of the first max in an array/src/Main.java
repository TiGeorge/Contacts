import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int e = scanner.nextInt();
            if (e > max) {
                max = e;
                index = i;
            }
        }
        System.out.println(index);

    }
}
