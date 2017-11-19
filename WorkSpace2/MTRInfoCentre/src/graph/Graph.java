package graph;

import java.util.*;

public class Graph {

	private HashMap<String, Vertex> vertices;
	private HashMap<Integer, Edge> edges;

	public Graph() {
		this.vertices = new HashMap<String, Vertex>();
		this.edges = new HashMap<Integer, Edge>();
	}

	public Graph(ArrayList<Vertex> vertices) {
		this.vertices = new HashMap<String, Vertex>();
		this.edges = new HashMap<Integer, Edge>();

		for (Vertex v : vertices) {
			this.vertices.put(v.getLabel(), v);
		}

	}

	public boolean addEdge(Vertex one, Vertex two) {
		return addEdge(one, two, 1);
	}

	public boolean addEdge(Vertex one, Vertex two, int weight) {
		if (one.equals(two)) {
			return false;
		}

		Edge e = new Edge(one, two, weight);
		if (edges.containsKey(e.hashCode())) {
			return false;
		}

		// and that the Edge isn't already incident to one of the vertices
		else if (one.containsNeighbor(e) || two.containsNeighbor(e)) {
			return false;
		}

		edges.put(e.hashCode(), e);
		one.addNeighbor(e);
		two.addNeighbor(e);
		return true;
	}

	public boolean containsEdge(Edge e) {
		if (e.getOne() == null || e.getTwo() == null) {
			return false;
		}

		return this.edges.containsKey(e.hashCode());
	}

	public Edge removeEdge(Edge e) {
		e.getOne().removeNeighbor(e);
		e.getTwo().removeNeighbor(e);
		return this.edges.remove(e.hashCode());
	}

	public boolean containsVertex(Vertex vertex) {
		return this.vertices.get(vertex.getLabel()) != null;
	}

	public Vertex getVertex(String label) {
		return vertices.get(label);
	}

	public boolean addVertex(Vertex vertex, boolean overwriteExisting) {

		Vertex current = this.vertices.get(vertex.getLabel());

		if (current != null) {

			if (!overwriteExisting) {

				return false;

			}

			while (current.getNeighborCount() > 0) {

				this.removeEdge(current.getNeighbor(0));

			}

		}

		vertices.put(vertex.getLabel(), vertex);

		return true;

	}

	/**
	 *
	 * 
	 * 
	 * @param label
	 *            The label of the Vertex to remove
	 * 
	 * @return Vertex The removed Vertex object
	 * 
	 */

	public Vertex removeVertex(String label) {

		Vertex v = vertices.remove(label);

		while (v.getNeighborCount() > 0) {

			this.removeEdge(v.getNeighbor((0)));

		}

		return v;

	}

	/**
	 *
	 * 
	 * 
	 * @return Set<String> The unique labels of the Graph's Vertex objects
	 * 
	 */

	public Set<String> vertexKeys() {

		return this.vertices.keySet();

	}

	/**
	 *
	 * 
	 * 
	 * @return Set<Edge> The Edges of this graph
	 * 
	 */

	public Set<Edge> getEdges() {

		return new HashSet<Edge>(this.edges.values());

	}

}
