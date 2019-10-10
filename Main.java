import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Graph<String> newGraph = new Graph<String>();
        String myString = "Yeet";
        newGraph.addVertex(myString);
        //newGraph.clear();
        System.out.print(newGraph.getVertices().toString());
    }
}
