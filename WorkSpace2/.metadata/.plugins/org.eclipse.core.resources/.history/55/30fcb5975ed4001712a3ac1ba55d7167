
package graph;
import java.util.ArrayList;
import java.util.Iterator;
public class LinkedNode<T> {
	
	private T element;
	private ArrayList<Edge<T>> edges;
	
	public LinkedNode(T element){
		this.element = element;
		edges= new ArrayList<Edge<T>>();
	}
	
	public T getElement(){
		return element;
	}
	
	public void addEdge(Edge<T> edge){
		edges.add(edge);
	}
		
	public ArrayList<Edge<T>> getEdges(){
		return edges;
	}
	
	public String toString(){
		String str = "";
		str  = str + element.toString() + " <-> ";
		for(int i = 0; i < edges.size(); i++){
			str = str + edges.get(i).getConnectedNode().toString() + " ";
		}
		return str;
	}
}
