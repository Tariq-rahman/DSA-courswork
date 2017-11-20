
package graph;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkedGraphNode<T> {
	
	private T element;
	private ArrayList<LinkedGraphNode> connectedNodes;
	
	public LinkedGraphNode(T element){
		this.element = element;
		connectedNodes = new ArrayList<LinkedGraphNode>();
	}
	
	public T getElement(){
		return element;
	}
	
	public void setConnectedNodes(LinkedGraphNode node){
		connectedNodes.add(node);
	}

	
}