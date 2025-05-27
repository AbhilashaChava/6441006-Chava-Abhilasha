import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Anu");
        names.add("Kiran");
        names.add("Deepa");

        System.out.println("Before sorting: " + names);
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("After sorting: " + names);
    }
}

