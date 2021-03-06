
package graph;
import java.util.ArrayList;
import java.util.Iterator;
public class LinkedNode<T> {
	
	private T element;
	private ArrayList<Edge<T>> edges;
	
	/**
	 * Instantiates a new linked node. requires an element to be instantiated.
	 * creates an empty ArrayList of edges that should be filled in later.
	 *
	 * @param element the element : type generic
	 */
	public LinkedNode(T element){
		this.element = element;
		edges= new ArrayList<Edge<T>>();
	}
	
	/**
	 * creates an edge.
	 *
	 * @param node the node
	 * @param weight the weight
	 */
	public void makeEdge(LinkedNode<T> node, String weight){
		Edge<T> edge = new Edge<T>(this, node, weight);
		edges.add(edge);
	}
	
	
	/**
	 * Gets the element.
	 *
	 * @return the element : type generic
	 */
	public T getElement(){
		return element;
	}
	
	/**
	 * Sets the element.
	 *
	 * @param newValue the new element : type generic
	 */
	public void setElement(T newValue){
		element = newValue;
	}
		
	/**
	 * Gets the edges, an ArrayList of edges.
	 *
	 * @return the edges : type ArrayList<Edge>
	 */
	public ArrayList<Edge<T>> getEdges(){
		return edges;
	}
	
	/**
	 * @return node <-> connectednode...
	 */
	public String toString(){
		String str = "";
		str  = str + element.toString() ;
		for(int i = 0; i < edges.size(); i++){
			str = str + " <-> " + edges.get(i).getConnectedNode().getElement().toString() + " ";
		}
		return str;
	}
}
