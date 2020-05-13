import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

//        int a = 0;
//        int b = 1;
//        int c = -6;
//        int d = 5;

        int count = 0;
        for (int x = 1; x < 1000; x++) {
            if (count == 3) {
                break;
            }
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                count++;
            }

        }
    }
}