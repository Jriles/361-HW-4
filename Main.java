import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Graph<String> newGraph = new Graph<String>();
        newGraph.add("Yeet");
        System.out.println(newGraph.numVerticies());
        // Map<String, ArrayList<Integer>> test = new HashMap<String,
        // ArrayList<Integer>>();
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // for (int i = 0; i < 5; i++) {
        // list1.add(i);
        // }
        // test.put("a", list1);
        // test.forEach((key, value) -> System.out.println("Element: " + key + " " + "
        // Index: " + value));
    }
}
