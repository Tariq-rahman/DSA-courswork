package graph;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * The Class LinkedHashGraph.
 *
 * @param <T> the generic type
 */
public class LinkedHashGraph<T> {

	/** The graph. */
	private HashMap<String, LinkedNode<T>> graph;
	private HashMap<String, String[]> lineMap;
	private ArrayList<String> lineKeyList;
	
	/**
	 * Instantiates a new linked hash graph.
	 */
	public LinkedHashGraph() {
		graph = new HashMap<String, LinkedNode<T>>();
		lineMap = new HashMap<String, String[]>();
		lineKeyList = new ArrayList<String>();
	}

	/**
	 * Adds the node.
	 *
	 * @param name the name
	 * @param element the element
	 */
	public void addNode(String name, T element) {
		if (graph.containsKey(name)) {
			// throw exception Object already exists;
		} else {
			LinkedNode<T> node = new LinkedNode<T>(element);
			graph.put(name, node);
		}
	}

	/**
	 * creates an edge between two existing nodes.
	 *
	 * @param originNode the origin node
	 * @param connectingNode the connecting node
	 * @param weight the weight
	 */
	public void addEdge(String originNode, String connectingNode, String weight) {

		if (graph.containsKey(originNode) && graph.containsKey(connectingNode)) {

			graph.get(originNode).makeEdge(graph.get(connectingNode), weight);
		} else {
			// throw exceptions; 404 node not found;
		}
	}

	/**
	 * Removes the.
	 *
	 * @param key the key
	 */
	public void remove(String key) {
		if (graph.containsKey(key)) {
			graph.remove(key);
		} else {
			// throw exception 404 node not found
		}
	}

	/**
	 * Gets the hashmap.
	 *
	 * @return the hashmap
	 */
	public HashMap<String, LinkedNode<T>> getHashmap(){
		return graph;
	}
	
	/**
	 * Gets the node.
	 *
	 * @param key the key
	 * @return the node
	 */
	public LinkedNode<T> getNode(String key){
		return graph.get(key);
	}
	
	/**
	 * @return the LineMap, a HashMap of key String and value String[]
	 */
	public HashMap<String, String[]> getLineMap(){
		return lineMap;
	}
	
	/**
	 * @param lineName
	 * @param value
	 */
	public void addLine(String lineName, String[] value){
		lineMap.put(lineName, value);
		
		lineKeyList.add(lineName);
	}
	
	public ArrayList<String> getLineKeyList(){
		return lineKeyList;
	}
	
	public String[] getLine(String lineName){
		return lineMap.get(lineName);
	}
	
	public String getLineKey(int i){
		return lineKeyList.get(i);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = "";
		
		
		
		return str;
	}
}
