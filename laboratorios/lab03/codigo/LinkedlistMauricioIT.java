/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3dedatos;

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
public class LinkedlistMauricioIT {
    
    public LinkedlistMauricioIT() {
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
     * Test of size method, of class LinkedlistMauricio.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedlistMauricio instance = new LinkedlistMauricio();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of insert method, of class LinkedlistMauricio.
     */
    @Test
    public void testInsert() {
         LinkedlistMauricio list = new LinkedlistMauricio();
        list.insert(5, 0);
        assertEquals(list.get(0), 5);
       
       
    }

    /**
     * Test of remove method, of class LinkedlistMauricio.
     */
    @Test
    public void testRemove() {
        LinkedlistMauricio list = new LinkedlistMauricio();
        list.remove(0);
        assertEquals(list.get(0), 0);
        
    }
   
    @Test
    public void testContain(){
        LinkedlistMauricio list = new LinkedlistMauricio();
        list.insert(5, 0);
        list.insert(8, 0);
        list.insert(7, 0);
        list.insert(20, 0);
        list.insert(35, 0);
        
        assertTrue(list.contain(20));
        
        
        
    }
    
}
