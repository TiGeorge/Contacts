import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        if (Objects.nonNull(firstName) && Objects.nonNull(lastName)) {
            return firstName + " " + lastName;
        } else {
            return Objects.nonNull(firstName) ? firstName : lastName;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}