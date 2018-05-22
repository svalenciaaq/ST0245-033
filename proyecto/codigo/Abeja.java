	
/**
 * @author santiago valencia arango
 * Clase encargada de almacenar los datos de las abejas, los cuales son la posicion en x,posicion en y y el radio de cada abeja, ademas de una variable val,
 * donde se le es asignado un valor entero a cada abeja para asia identificar con que otras abejas van a colisionar,
 *
 */
public class Abeja {
	int x;
	int y;
	int val;
	double radio;
	
	/**
	 * @param x Posicion x donde se ubica la abeja en el plano cartesiano.
	 * @param y Posicion y donde se ubica la abeja en el plano cartesiano.
	 * @param val Valor que identifica a la abeja.
	 */
	public Abeja(int x,int y,int val) {
		this.x=x;
		this.y=y;
		this.radio=100;
		this.val=val;
		
	}
	
	


	/**
	 * @return Retorna la posicion x de la abeja.
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x Recibe una posicion x de una abeja para asi modificarla.
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return Retorna la posicion y de la abeja.
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y Recibe una posicion y de una abeja para asi modificarla.
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 * @return Retorna el radio de una abeja.
	 */
	public double getRadio() {
		return radio;
	}


	/**
	 * @param radio Recibe el radio de una abeja para asi modificarlo
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}




	/**
	 * @return Retorna el valor de identificacion de una abeja.
	 */
	public int getVal() {
		return val;
	}




	/**
	 * @param val Recibe la identificacion de una abeja Para modificarla.
	 */
	public void setVal(int val) {
		this.val = val;
	}
	
	

}
