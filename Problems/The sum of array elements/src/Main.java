import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int sum = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}