
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author santiago valencia arango Clase encargada de leer el fichero y
 *         introducirla en el quad tree;
 */
public class AgregarAbejas {
	static ArrayList<Integer> Ejex = new ArrayList<Integer>();
	static ArrayList<Integer> Ejey = new ArrayList<Integer>();
	ArrayList<Abeja> aux = new ArrayList<Abeja>();

	/**
	 * Constructor de la clase encargado de crear una instancia de QuadTree, Leer de
	 * un fichero de texto y introducirlas en el Quad, ademas de llamar dos metodos
	 * de la clase QuadTree, que son los encargados de detectar las colisiones entre
	 * las abejas
	 */
	public AgregarAbejas() {

		int dataSize = 1024 * 1024;
		QuadTree tree = new QuadTree(1, new Boundry(0, 0, 1000, 1000));
		String cadena;
		FileReader f = null;
		int i = 1;
		try {
			f = new FileReader("ConjuntoDeDatosCon10000abejas.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader b = new BufferedReader(f);

		Runtime runtime = Runtime.getRuntime();
		try {
			while ((cadena = b.readLine()) != null) {
				String[] papu = cadena.split(",");
				double x = Double.parseDouble(papu[0]);
				double y = Double.parseDouble(papu[1]);
				double ent = (double) (x + 75.50);
				int xaux = (int) (ent * 10000);
				int xt = (1000 + xaux);
				double ent2 = (double) (y - 6.30);
				int yaux = (int) (ent2 * 10000);
				int yt = ((yaux - 700) * -1);

				Ejex.add(xt);
				Ejey.add(yt);

				tree.insert(xt, yt, i);

				i++;

			}

		} catch (NumberFormatException | IOException e) {
				
			e.printStackTrace();
		}
		try {
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		QuadTree.comprobarColisiones(tree);
		QuadTree.Chocan();
	}

}
