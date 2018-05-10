package lab5;



import java.util.ArrayList;

public class DigraphAM extends Graph {

int [][] adyacencia;


public DigraphAM(int size){
        super(size);
        adyacencia= new int[size][size];
}

public void addArc(int source, int destination, int weight){
        adyacencia[source][destination]=weight;
}

public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> temp= new ArrayList<>();
        int [] tem=adyacencia[vertice];
        for(int i=0; i<tem.length; i++) {
                if(tem[i]!=0) {temp.add(i);}
        }
        return temp;
}

public int getWeight(int source, int destination){
        return adyacencia[source][destination];

}
}
