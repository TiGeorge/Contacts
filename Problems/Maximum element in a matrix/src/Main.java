import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] matrix = new int[x][];
        scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int max = Integer.MIN_VALUE;
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] > max) {
                    max = row[j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(maxI + " " + maxJ);

    }
}