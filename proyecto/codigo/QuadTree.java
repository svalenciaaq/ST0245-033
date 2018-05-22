

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
 *  			N
 *  		W		E
 *  			S
 */


/* Using two points of Rectangular (Top,Left) & (Bottom , Right)*/
class Boundry {
	public int getxMin() {
		return xMin;
	}

	public int getyMin() {
		return yMin;
	}

	public int getxMax() {
		return xMax;
	}

	public int getyMax() {
		return yMax;
	}

	public Boundry(int xMin, int yMin, int xMax, int yMax) {
		super();
		/*
		 *  Storing two diagonal points 
		 */
		this.xMin = xMin;
		this.yMin = yMin;
		this.xMax = xMax;
		this.yMax = yMax;
	}

	public boolean inRange(int x, int y) {
		return (x >= this.getxMin() && x <= this.getxMax()
				&& y >= this.getyMin() && y <= this.getyMax());
	}

	int xMin, yMin, xMax, yMax;

}

public class QuadTree {
	
    static ArrayList<Abeja> beeAux=new ArrayList<Abeja>();
    static ArrayList<Integer>Ejex=new ArrayList<Integer>();
    static ArrayList<Integer>Ejey=new ArrayList<Integer>();
	final int MAX_CAPACITY =4;
	int level = 0;
	static int col=0;
	List<Abeja> Bees;
	QuadTree northWest = null;
	QuadTree northEast = null;
	QuadTree southWest = null;
	QuadTree southEast = null;
	Boundry boundry;
	Boolean split;
	QuadTree(int level, Boundry boundry) {
		this.level = level;
		Bees = new ArrayList<Abeja>();
		this.boundry = boundry;
	}

	/* Traveling the Graph using Depth First Search*/
	public QuadTree() {
		// TODO Auto-generated constructor stub
	}

	

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

	void insert(int x, int y, int val) {
		
		
		if (!this.boundry.inRange(x, y)) {
			return;
		}

		Abeja bee = new Abeja(x, y, val);
		if (Bees.size() < MAX_CAPACITY) {
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
	
	public static void Chocan() {
		long totalSum = 0;
		  long startTime = System.currentTimeMillis();
		
		   int dataSize=1024*1024;
		 
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
		 
		 
	   
   	 
		
		
		
	
	
	
	static void comprobarColisiones(QuadTree tree) {
		long totalSum = 0;
		  long startTime = System.currentTimeMillis();
		   int dataSize=1024*1024;
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

	
	
	
	

	
        
		
	



 


