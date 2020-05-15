import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ConcatPositiveNumbersProblem {

    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> l3 = Stream.concat(l1.stream(), l2.stream())
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> positives = new ArrayList<>();
        for (Integer integer: l3) {
            if (integer > 0) {
                positives.add(integer);
            }
        }
        return positives;
        // write your code here
    }

    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);

        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);

        for (Integer n : result) {
            System.out.print(n + " ");
        }
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}