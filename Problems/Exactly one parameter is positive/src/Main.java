import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        boolean first = one > 0 && two <= 0 && three <= 0;
        boolean second = two > 0 && one <= 0 && three <= 0;
        boolean third = three > 0 && one <= 0 && two <= 0;
        boolean result = first || second || third;

        System.out.println(result);


    }
}