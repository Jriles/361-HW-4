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
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);
        g.addVertex(6);
        g.addEdge(2, 5);
        g.addEdge(2, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.edgeExists(2, 5);
        g.edgeExists(5, 2);
        g.printMap();

        // Graph<String> newGraph = new Graph<String>();
        // String myString = "Yeet";
        // newGraph.addVertex(myString);
        // // newGraph.clear();
        // System.out.print(newGraph.getVertices().toString());
    }
}
