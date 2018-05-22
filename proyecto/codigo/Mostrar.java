/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *Clase encargada de generar un jframe y dibujar las abejas en este
 * @author santiago valencia arango
 * 
 */
public class Mostrar extends JFrame{
	

	AgregarAbejas bee=new AgregarAbejas();

    
    
    /**
     * Constructor de la clase, donde se crea el jframe
     */
    public Mostrar() {
    	
    	super("Dibujar");
			
    	
    	setSize(1000,1000);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	  
    	
    }
    
  
    
    /* (non-Javadoc)
     * @see java.awt.Window#paint(java.awt.Graphics)
     * Metodo de la clase java2d encatgado de dibujar las abejas en el plano cartesiano.
     */
    public void paint(Graphics g) {
   
    	super.paint(g);
    	
    	Graphics2D circulo=(Graphics2D)g;
    	circulo.setStroke(new BasicStroke(10.f));
    	circulo.setPaint(Color.BLUE);
    	for(int i=0;i<bee.Ejex.size();i++) {
    		circulo.fillOval(bee.Ejex.get(i),bee.Ejey.get(i), 10, 10);
    	}
    	
    }
    }

    
   
    
    
 



