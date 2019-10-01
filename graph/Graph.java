package datastructures.graph;

import java.util.HashMap;
import java.util.Set;

class Vertex{
	int id;
	HashMap<Vertex, Integer> connectedTo;
	
	public Vertex(int key) {
		this.id = key;
		this.connectedTo = new HashMap<Vertex, Integer>();
	}
	
	public void addNeighbour(Vertex neighbour, int weight) {
		this.connectedTo.put(neighbour, weight);
	}
	
	public Set<Vertex> getConnections(Vertex vertex){
		return this.connectedTo.keySet();
	}
	
	public int getWeight(Vertex vertex) {
		return this.connectedTo.get(vertex);
	}
	
	public String toString() {
		return this.id + " connected to " + printConnections(this.connectedTo.keySet());
	}

	private String printConnections(Set<Vertex> keySet) {
		String result = "";
		for (Vertex key: keySet)
			result += " " + key.id;
		return result;
	}
}
public class Graph {
	
	int noOfVertices;
	HashMap<Integer, Vertex> verticesList;
	
	public Graph() {
		this.noOfVertices = 0;
		this.verticesList = new HashMap<Integer, Vertex>();
	}
	
	public Vertex addVertex(int key) {
		this.noOfVertices += 1;
		this.verticesList.put(key, new Vertex(key));
		return this.verticesList.get(key);
	}
	
	public void addEdge(int fromVertex, int toVertex, int weight) {
		if(!this.verticesList.containsKey(fromVertex))
			this.addVertex(fromVertex);
		if(!this.verticesList.containsKey(toVertex))
			this.addVertex(toVertex);
		this.verticesList.get(fromVertex).addNeighbour(this.verticesList.get(toVertex), weight);
	}
	
	public Set<Integer> getVertices(){
		return this.verticesList.keySet();
	}
	
	public Vertex getVertex(int key) {
		return this.verticesList.get(key);
	}
	
	public static void main(String args[]) {
		Graph g = new Graph();
		for(int i=0; i < 6; i++)
			g.addVertex(i);
		g.addEdge(0, 1, 5);
		System.out.println("Weight of the edge between the vertices 0 and 1 is: " + g.verticesList.get(0).getWeight(g.verticesList.get(1)));
		for (int i=0; i< g.verticesList.size(); i++) {
			System.out.println(g.verticesList.get(i));
		}
	}

}
