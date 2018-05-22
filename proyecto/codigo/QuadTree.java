


import java.util.ArrayList;
import java.util.List;






/**
 * author Original sacado de: AbhijeetMajumdar(2015) QuadTree
 * (Version1),https://gist.github.com/AbhijeetMajumdar/c7b4f10df1b87f974ef4
 * Modificado por: santiago valencia arango
 * 
 * 
 * 
 *Esta clase Es la que determina el tamaño de los cuadrados del quadtree
 */

class Boundry {
	/**
	 * @return retorna la x minima del cuadrado d
	 */
	public int getxMin() {
		return xMin;
	}

	/**
	 * @return retorna la y maxima del cuadrado 
	 */
	public int getyMin() {
		return yMin;
	}

	/**
	 * @return retorna la x maxima del cuadrado
	 */
	public int getxMax() {
		return xMax;
	}

	/**
	 * @return retorna la y maxima del cuadrado
	 */
	public int getyMax() {
		return yMax;
	}

	/**
	 * @param xMin x minima del cuadrado
	 * @param yMin y minima del cuadrado
	 * @param xMax x maxima del cuadrado
	 * @param yMax y maxima del cuadrado
	 */
	public Boundry(int xMin, int yMin, int xMax, int yMax) {
		super();
		/*
		 *  Esto almacena dos puntos diagonales del cuadrado.
		 */
		this.xMin = xMin;
		this.yMin = yMin;
		this.xMax = xMax;
		this.yMax = yMax;
	}

	/**
	 * @param x Posicion x de una abeja.
	 * @param y Posicion y de una abeja.
	 * @return Retorna true o false si una abeja dentro del rango de un cuadrante del quadtree
	 */
	public boolean inRange(int x, int y) {
		return (x >= this.getxMin() && x <= this.getxMax()
				&& y >= this.getyMin() && y <= this.getyMax());
	}

	int xMin, yMin, xMax, yMax;

}

/**
 * 
 *Clase que almacena todas las variables y declaraciones para poder desarollar un quadtree
 */
public class QuadTree {
	
    static ArrayList<Abeja> beeAux=new ArrayList<Abeja>(); //ArrayList auxiliar que guarda las abejas para ser comparadas con el resto de abejas
	final int MAX_Bees =4;//variable que define el limite de abejas por cuadrante
	int level = 0;
	static int col=0;
	List<Abeja> Bees;
	QuadTree northWest = null;
	QuadTree northEast = null;
	QuadTree southWest = null;
	QuadTree southEast = null;
	Boundry boundry;
	Boolean split;
	/**
	 * @param level Nivel en el que se encuentra el quadtree
	 * @param boundry Cuadrado que representa el cuadrante
	 */
	QuadTree(int level, Boundry boundry) {
		this.level = level;
		Bees = new ArrayList<Abeja>();
		this.boundry = boundry;
	}

	

	

	/**
	 * Metodo encargado de dividir el quadtree cuando el cuadrante alcanzo el nivel maximo de abejas
	 */
	void split() {
		int xOffset = this.boundry.getxMin()
				+ (this.boundry.getxMax() - this.boundry.getxMin()) / 2;
		int yOffset = this.boundry.getyMin()
				+ (this.boundry.getyMax() - this.boundry.getyMin()) / 2;
	
		
		northWest = new QuadTree(this.level + 1, new Boundry(
				this.boundry.getxMin(), this.boundry.getyMin(), xOffset,
				yOffset));
		northEast = new QuadTree(this.level + 1, new Boundry(xOffset,
				this.boundry.getyMin(), xOffset, yOffset));
		southWest = new QuadTree(this.level + 1, new Boundry(
				this.boundry.getxMin(), xOffset, xOffset,
				this.boundry.getyMax()));
		southEast = new QuadTree(this.level + 1, new Boundry(xOffset, yOffset,
				this.boundry.getxMax(), this.boundry.getyMax()));
		split=true;

	}

	/**
	 * @param x Posicion x de la abeja
	 * @param y Posicion y de la abajea
	 * @param val Identificador asignado a la abeja
	 * 
	 * Metodo encargado de introducir las abejas al quadtree
	 */
	void insert(int x, int y, int val) {
		
		
		if (!this.boundry.inRange(x, y)) {
			return;
		}

		Abeja bee = new Abeja(x, y, val);
		if (Bees.size() < MAX_Bees) {
			Bees.add(bee);
			return;
		}
		// Exceeded the capacity so split it in FOUR
		if (northWest == null) {
			split();
		}

		// Check coordinates belongs to which partition 
		if (this.northWest.boundry.inRange(x, y))
			this.northWest.insert(x, y,val);
		else if (this.northEast.boundry.inRange(x, y))
			this.northEast.insert(x, y,val);
		else if (this.southWest.boundry.inRange(x, y))
			this.southWest.insert(x, y,val);
		else if (this.southEast.boundry.inRange(x, y))
			this.southEast.insert(x, y,val);
				
	
	}
	
	
	
	
	/**
	 * @param first Primera abeja a comparar
	 * @param second SEgunda abeja a comparar
	 * @return True si las dos abejas estan colisionando
	 * 
	 * Metodo encargado de recibit dos abejas, Recuperar las posiciones x,y de las dos abejas, para luego sacar las distancia entre las dos abejas atravez de
	 * el teorema de pitagoras, Luego obtener sus radios para comparar si el radio es mayor a la distancia entra las dos abejas, si asi es, retorna true, lo que significa que las dos abejas colisionan
	 */
	public static  boolean colision(Abeja first, Abeja second) {
		int x1=first.getX();
		int y1=first.getY();
		int x2=second.getX();
		int y2=second.getY();
		
		int cat1=x1-x2;
		int cat2=y1-y2;
		
		int distancia=(int)Math.sqrt(cat1*cat1 + cat2*cat2);
		
		double rad1=first.getRadio();
		double rad2=second.getRadio();
		boolean yes=false;
		double radmax=rad1+rad2;
		
		if(radmax> distancia) {
			yes=true;
			
		}
		
		return yes;
		
		
		
	}
	
	/**
	 * Metodo encargado de recorrer el Arraylist donde estan guardadas las abejas, y ir comparando cada una de las abejas con el resto de las abejas, y llamando la funcion colision que retorna true, o false
	 * Para asi detectar la colision entre dos abejas.
	 */
	public static void Chocan() {
			 
	Abeja aux = null;
	Abeja aux2 = null;
	
		for(int i=0;i<beeAux.size();i++) {
			for(int p=i+1;p<beeAux.size();p++) {
			aux=beeAux.get(i);
			aux2=beeAux.get(p);
			
		
			if(colision(aux,aux2)) {
				System.out.println("Abejas " +aux.val+" "+aux2.val+" Colisionan");
				col++;				
			}else {
				System.out.println("Abejas "+aux.val+" "+aux2.val+" No colisionan");
			}
		}
		}
	}
		 	
	/**
	 * @param tree Arbol que recibe para recorrrerlo
	 * Metodo encargado de recorrer el quadtree nodo por nodo para asi recuperar las abejas y guardarlas en un Arraylist auxiliar para luego ser comparadas
	 */
	static void comprobarColisiones(QuadTree tree) {
		if (tree == null)
			return ;


		for (Abeja bee : tree.Bees) {
			beeAux.add(bee);
		}
		if (tree.Bees.size() == 0) {
			
		}
		
		comprobarColisiones(tree.northWest);
		comprobarColisiones(tree.northEast);
		comprobarColisiones(tree.southWest);
		comprobarColisiones(tree.southEast);
		
		
		
		
	}
	
	
	
	
	
	
	
	
    }

	
	
	
	

	
        
		
	



 


