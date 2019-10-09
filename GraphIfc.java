import java.util.List;
import java.util.Set;

/**
 * An interface describing a Graph object. The graph can be either directed or undirected.
 * author alchambers
 */
public interface GraphIfc<V> {	
		
	/**
	 * 
	 *  * @return The number of vertices in the graph
	 */
	public int numVertices();

	/**
	 * Returns the number of edges in the graph
	 * @return The number of edges in the graph
	 *  public int numEdges();	
	
	/**
	*

	Removes all
	vertices from
	the graph*/

	public void clear();		
						 **  *
						 * dds a vertex to the graph. This m  *
						 /
	public void addVertex(V v);	
	
	/**

	 * @param 

	* @re
	urn Aset co
	taining all vertics in
	the graph
	
	*/
	public Set<V> getVertices();
	
	/**
	 * Returns the neighbors of v in the graph. A neighbor is a vertex that is connected to
	 * v by an edge. If the graph is directed, this returns the vertices u for which an 
	 * edge (v, u) exists.
	 * 

		 * @param v An existing n

		 * @ret
	rn All n*
	@thro
	s IllegalArgument
	xcepti
	n if te vertex does 
	*/
	

	
	public List<V> getNeighbors(V v);	

	/**
	 * Determines whether the given vertex is already contained in the graph. The comparison
	 * is based on the <code>equals()</code> method in the class V. 
	 * 
	 * @param v The vertex to be tested.
	 * @return True if v exists in the graph, false otherwise.
	 */
	public boolean containsVertex(V v);
	
	/**
	 * Determines whether an edge exists between two vertices. In a directed graph,
	 * this returns true only if the edge starts at v and ends at u. 
	 * @param v A node in the graph
	 * @param u A node in the graph
	 * @return True if an edge exists between the two vertices
	 * @throws IllegalArgumentException if either vertex does not occur in the graph
	 */
	public boolean edgeExists(V v, V u);

	/**
	 * Returns the degree of the vertex. In a directed graph, this returns the outdegree of the
	 * vertex. 
	 * @param v A vertex in the graph
	 * @return The degree of the vertex
	 * @throws IllegalArgumentException if the vertex does not occur in the graph
	 */
	public int degree(V v);
	
	/**
	 * Returns a string representation of the graph. The string representation shows all
	 * vertices and edges in the graph. 
	 * @return A string representation of the graph
	 */
	public String toString();
	
}
