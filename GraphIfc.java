import java.util.List;
import java.util.Set;

/**
 * An interface describing a Graph object. The graph can be either directed or
 * undirected.
 * 
 * @author alchambers
 */
public interface GraphIfc<V> {
	HashMap<V, List<V>> graphObject = new HashMap<V, <V>>();
	// hi
	public static void main(String[] args) {
		System.out.println("called main!");
		// how to initialize
	}

	/**
	 * Returns the number of vertices in the graph
	 * 
	 * @return The number of vertices in the graph
	 */
	public int numVertices(){
		return graphObject.size();
	}

	/**
	 * Returns the number of edges in the graph
	 * 
	 * @return The number of edges in the graph
	 */
	public int numEdges(){
		//NOT TESTED
		//lists hold each vertex's connections to other verticies. Each connection is represented twice however since each vertex is showing all of their connections,
		//not just one's that have not been represented before. Therefore we should have double the number of connections that actually exist but because we are recording
		//edges not connections, we divide by 2.
		int edgeCount = 0;
		for(Map.Entry<String, HashMap> entry : graphObject.entrySet()) {
			List value = entry.getValue();
			edgecount += value.size();
		}
		return edgeCount = bigCount/2;
	}
	/**
	 * Removes all vertices from the graph
	 */
	public void clear(){
		//we can just clear the outer map and we're covered here
	}

	/**
	 * Adds a vertex to the graph. This method has no effect if the vertex already
	 * exists in the graph.
	 * 
	 * @param v The vertex to be added
	 */
	public void addVertex(V v);

	/**
	 * Adds an edge between vertices u and v in the graph.
	 * 
	 * @param u A vertex in the graph
	 * @param v A vertex in the graph
	 * @throws IllegalArgumentException if either vertex does not occur in the
	 *                                  graph.
	 */
	public void addEdge(V u, V v);

	/**
	 * Returns the set of all vertices in the graph.
	 * 
	 * @return A set containing all vertices in the graph
	 */
	public Set<V> getVertices();

	/**
	 * Returns the neighbors of v in the graph. A neighbor is a vertex that is
	 * connected to v by an edge. If the graph is directed, this returns the
	 * vertices u for which an edge (v, u) exists.
	 * 
	 * @param v An existing node in the graph
	 * @return All neighbors of v in the graph.
	 * @throws IllegalArgumentException if the vertex does not occur in the graph
	 */
	public List<V> getNeighbors(V v);

	/**
	 * Determines whether the given vertex is already contained in the graph. The
	 * comparison is based on the <code>equals()</code> method in the class V.
	 * 
	 * @param v The vertex to be tested.
	 * @return True if v exists in the graph, false otherwise.
	 */
	public boolean containsVertex(V v);

	/**
	 * Determines whether an edge exists between two vertices. In a directed graph,
	 * this returns true only if the edge starts at v and ends at u.
	 * 
	 * @param v A node in the graph
	 * @param u A node in the graph
	 * @return True if an edge exists between the two vertices
	 * @throws IllegalArgumentException if either vertex does not occur in the graph
	 */
	public boolean edgeExists(V v, V u);

	/**
	 * Returns the degree of the vertex. In a directed graph, this returns the
	 * outdegree of the vertex.
	 * 
	 * @param v A vertex in the graph
	 * @return The degree of the vertex
	 * @throws IllegalArgumentException if the vertex does not occur in the graph
	 */
	public int degree(V v);

	/**
	 * Returns a string representation of the graph. The string representation shows
	 * all vertices and edges in the graph.
	 * 
	 * @return A string representation of the graph
	 */
	public String toString();

}
