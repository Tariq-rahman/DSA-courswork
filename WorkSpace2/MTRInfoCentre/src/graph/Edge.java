package graph;

public class Edge<T> {
	
	private String weight;
	private LinkedNode<T> origin;
	private LinkedNode<T> connectedNode;
	
	public Edge(LinkedNode<T> one, LinkedNode<T> two, String weight){
		setOrigin(one);
		setConnectedNode(two);
		this.setWeight(weight);
	}
	
	/**
	 * Gets the weight, a component of the edge that describes the edge or gives it value.
	 *
	 * @return the weight : type String
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 *
	 * @param weight the new weight : type String
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * Gets the origin. Origin is the node that the edge is contained in.
	 * Example: Edge AB is contained in node A, here A would be the origin node. 
	 *
	 * @return the origin : Type LinkedNode<T>
	 */
	public LinkedNode<T> getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param origin the new origin : type LinkedNode<T>
	 */
	public void setOrigin(LinkedNode<T> origin) {
		this.origin = origin;
	}

	/**
	 * Gets the connected node. ConnectedNode is the node that is connected to the origin node.
	 * Example: Edge AB is contained in node A, here node B would be the connected node.
	 *
	 * @return the connected node : type LinkedNode<T>
	 */
	public LinkedNode<T> getConnectedNode() {
		return connectedNode;
	}

	/**
	 * Sets the connected node.
	 *
	 * @param connectedNode the new connected node : type LinkedNode<T>
	 */
	public void setConnectedNode(LinkedNode<T> connectedNode) {
		this.connectedNode = connectedNode;
	}
	
	/**
	 * @return String weight || origin <-> connectedNode
	 */
	public String toString(){
		String str = "";
		str = weight + " || " + origin + " <-> " + connectedNode;
		return str;
		
	}
	
	
}
