
package lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Mirar block de notas con citas
 */
public class Simulacion {

    Arbolcompa miArbol = new Arbolcompa();

    public Simulacion() {
    }

    public boolean insertar(Integer data) {
         return (this.miArbol.insertar(data));
    }
   
    public String preOrden() {
        LinkedList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }

    public String postOrden() {
        LinkedList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }
    
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }
    
    

    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
}
