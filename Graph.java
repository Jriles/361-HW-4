
/**
 * Authors: Jiman Kim, Jack Riley
 */

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph<V> implements GraphIfc<V> {
    protected Map<V, List<V>> graphObject;

    public Graph() {
        graphObject = new HashMap<>();
    }

    /**
     * Returns the number of vertices in the graph
     * 
     * @return The number of vertices in the graph
     */
    public int numVertices() {
        return graphObject.size();
    }

    /**
     * Returns the number of edges in the graph
     * 
     * @return The number of edges in the graph
     */
    public int numEdges() {
        int edgeCount = 0;
        for (Map.Entry<V, List<V>> entry : graphObject.entrySet()) {
            edgeCount += entry.getValue().size();
        }
        return edgeCount;
    }

    /**
     * Removes all vertices from the graph
     */
    public void clear() {
        // bla
        graphObject.clear();
    }

    /**
     * Adds a vertex to the graph. This method has no effect if the vertex already
     * exists in the graph.
     * 
     * @param v The vertex to be added
     */
    public void addVertex(V v) {
        if (containsVertex(v) == false) {
            // need to check if this vertext already exists in the graph
            List<V> connList = new LinkedList<>();
            graphObject.put(v, connList);
        }
    }

    /**
     * Adds an edge between vertices u and v in the graph.
     * 
     * @param u A vertex in the graph
     * @param v A vertex in the graph
     * @throws IllegalArgumentException if either vertex does not occur in the
     *                                  graph.
     */
    public void addEdge(V u, V v) {
        if (!containsVertex(u) || !containsVertex(v)) {
            throw new IllegalArgumentException();
        } else {
            graphObject.get(u).add(v);
        }
    }

    /**
     * Returns the set of all vertices in the graph.
     * 
     * @return A set containing all vertices in the graph
     */

    public Set<V> getVertices() {
        Set<V> vertSet = new HashSet<V>();
        for (Map.Entry<V, List<V>> entry : graphObject.entrySet()) {
            vertSet.add(entry.getKey());
        }
        return vertSet;
    }

    /**
     * Returns the neighbors of v in the graph. A neighbor is a vertex that is
     * connected to v by an edge. If the graph is directed, this returns the
     * vertices u for which an edge (v, u) exists.
     *
     * @param v An existing node in the graph
     * @return All neighbors of v in the graph.
     * @throws IllegalArgumentException if the vertex does not occur in the graph
     */
    public List<V> getNeighbors(V v) {
        if (containsVertex(v) == false) {
            throw new IllegalArgumentException("vertex does not exist");
        }
        return graphObject.get(v);
    }

    /**
     * Determines whether the given vertex is already contained in the graph. The
     * comparison is based on the <code>equals()</code> method in the class V.
     *
     * @param v The vertex to be tested.
     * @return True if v exists in the graph, false otherwise.
     */
    public boolean containsVertex(V v) {
        if (graphObject.get(v) == null) {
            return false;
        }
        return true;
    }

    /**
     * Determines whether an edge exists between two vertices. In a directed graph,
     * this returns true only if the edge starts at v and ends at u.
     * 
     * @param v A node in the graph
     * @param u A node in the graph
     * @return True if an edge exists between the two vertices
     * @throws IllegalArgumentException if either vertex does not occur in the graph
     */
    public boolean edgeExists(V v, V u) {
        if (!containsVertex(u) || !containsVertex(v)) {
            throw new IllegalArgumentException();
        } else {
            if (graphObject.get(v).contains(u)) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    /**
     * Returns the degree of the vertex. In a directed graph, this returns the
     * outdegree of the vertex.
     * 
     * @param v A vertex in the graph
     * @return The degree of the vertex
     * @throws IllegalArgumentException if the vertex does not occur in the graph
     */
    public int degree(V v) {
        if (!containsVertex(v)) {
            throw new IllegalArgumentException();
        }
        return graphObject.get(v).size();
    }

    /**
     * Returns a string representation of the graph. The string representation shows
     * all vertices and edges in the graph.
     * 
     * @return A string representation of the graph
     */
    public String toString() {
        return graphObject.toString();
    }
}
