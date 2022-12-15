import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>integers = new ArrayList<>(Arrays.asList(2,4,6,54,34));
        System.out.println(integers.stream().filter(s -> s % 2 == 0).map(s -> s += s).toList());
    }
}