/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3dedatos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class Lab3dedatosIT {
    
    public Lab3dedatosIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiply method, of class Lab3dedatos.
     */
 
    @Test
    public void testSmartInsert() {
        System.out.println("smartInsert");
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(new Integer[]{1, 2, 3 ,4,5}));
        int data = 5;
        List<Integer> expResult = new LinkedList<>();
        expResult.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4,5}));
        List<Integer> result = Lab3dedatos.smartInsert(list, data);
        assertEquals(expResult, result);
       
    }

  
    
}
