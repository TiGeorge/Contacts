import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int[] array = IntStream.range(0, c).map(i -> scanner.nextInt()).toArray();
        int n = scanner.nextInt();
        int count = 0;
        for (int e : array) {
            if (e == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
