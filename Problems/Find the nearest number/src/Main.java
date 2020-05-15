import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        int n = scanner.nextInt();

        int closest = Integer.MAX_VALUE;
        for (Integer i : array) {
            closest = Math.min(Math.abs(n - i), closest);
        }

        final int closestFin = closest;
        List<Integer> collect = array.stream().filter(e -> Math.abs(n - e) == closestFin)
                .sorted().collect(Collectors.toList());
        collect.forEach(e -> System.out.print(e + " "));

    }
}