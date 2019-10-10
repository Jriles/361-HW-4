import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Graph<String> newGraph = new Graph<String>();
        // newGraph.add("Yeet");
        // System.out.println(newGraph.numVerticies());
        // for (int i = 0; i < 5; i++) {
        // list1.add(i);
        // }
        Graph<Integer> g = new Graph<Integer>();
        g.addVertex(2);
        g.addVertex(5);
        g.printMap();

        Graph<String> newGraph = new Graph<String>();
        String myString = "Yeet";
        newGraph.addVertex(myString);
<<<<<<< HEAD
        //newGraph.clear();
        System.out.print(newGraph.numEdges());
=======
        // newGraph.clear();
        System.out.print(newGraph.getVertices().toString());
>>>>>>> 5d2546acc1e1784f78e95fe0c6333c0abdc06d57
    }
}
