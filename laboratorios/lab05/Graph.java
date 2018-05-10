
import java.util.ArrayList;
/**
 * Graph is the parent class for all Digraph classes
 */
public abstract class Graph {

protected int size;
/**
 * This is the class constructor
 * @param vertices the number of vertices or nodes on the graph
 */
public Graph(int vertices){
        size=vertices;
}
public abstract void addArc(int source, int destination, int weight);
public abstract ArrayList<Integer> getSuccessors(int vertice);
public abstract int getWeight(int source, int destination);
public int size(){
        return size;
}
}
