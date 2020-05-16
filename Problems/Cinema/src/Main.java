import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        scanner.nextLine();
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int k = scanner.nextInt();

        int available = 0;
        out:
        for (int y = 0; y < n; y++) {
            int count = 0;
            for (int x = 0; x < m; x++) {
                int seat = matrix[y][x];
                if (seat == 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == k) {
                    available = y + 1;
                    break out;
                }
            }
        }
        System.out.println(available);
    }
}