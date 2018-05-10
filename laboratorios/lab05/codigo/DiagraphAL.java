package lab5;


import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;
import lab5.Graph;


 
public class DiagraphAL extends Graph {

    LinkedList<LinkedList<Pair<Integer, Integer>>> lista;
    
    
    public ArrayList<Integer> getSuccessors(int vertice) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (Pair<Integer, Integer> pareja : lista.get(vertice)) {
            if (pareja.getKey() != null && pareja.getValue() != 0) {
                ans.add(pareja.getKey());
            }
        }
        return ans;
    }
    
     public int getWeight(int source, int destination) {
        LinkedList<Pair<Integer, Integer>> listaQueVaALaDerecha = lista.get(source);
        for (Pair<Integer, Integer> pareja : listaQueVaALaDerecha) {
            if (pareja.getKey() == destination) {
                return pareja.getValue();
            }
        }
        return 0;
    }


    public DiagraphAL(int valor, int size) {
        super(valor);
        lista = new LinkedList<LinkedList<Pair<Integer, Integer>>>();
        for (int i = 0; i < size; i++) {
            lista.add(new LinkedList<Pair<Integer, Integer>>());
        }
    }
    public void addArc(int source, int destination, int weight) {
        lista.get(source).add(new Pair(destination, weight));
    }

   
    

}



