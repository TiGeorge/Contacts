import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //int c = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int[] array = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean result = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == n && array[i - 1] == m) {
                result = true;
                break;
            }
            if (array[i] == m && array[i - 1] == n) {
                result = true;
                break;
            }
        }
        System.out.println(result);


    }
}