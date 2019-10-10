public class Graph<V> implements GraphIfc<V> {
    protected Map<V, List<V>> graphObject = new HashMap<V, List<V>>();

    public Graph(V vertex) {
        this.vertex = vertex;
    }
}
