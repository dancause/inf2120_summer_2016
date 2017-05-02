/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2120_tp1;

import classe.TableauPartiel.TableauPartiel;
import classe.coupe.Coupe;
import classe.coupe.CoupeDeA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janindancause
 */
public class TableauPartielTest {
    String[]tmp=new String[]{"test0","test1"};
        TableauPartiel<String>test=new TableauPartiel<>(tmp);
    
    public TableauPartielTest() {
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
     * Test of position method, of class TableauPartiel.
     */
    @Test
    public void testPosition() throws Exception {
        System.out.println("position");
        Object a_element = "test0";
        int expResult = 0;
        int result = test.position((String) a_element);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of contient method, of class TableauPartiel.
     */
    @Test
    public void testContient() {
        System.out.println("contient");
        Object a_element = "test2";
        //TableauPartiel instance = null;
        boolean expResult = false;
        boolean result = test.contient((String) a_element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of coupe method, of class TableauPartiel.
     */
    @Test
    public void testCoupe() throws Exception {
        System.out.println("coupe");
        String[]testS=new String[]{"test0"};
        Coupe a_coupe = new CoupeDeA(0,1);
        //TableauPartiel instance = null;
        TableauPartiel<String> expResult = new TableauPartiel<>(testS);
        TableauPartiel<String> result = (test.coupe(a_coupe));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of elements method, of class TableauPartiel.
     */
    @Test
    public void testElements() {
        System.out.println("elements");
        //TableauPartiel instance = null;
        Object[] expResult = tmp;
        Object[] result = test.elements();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of estVide method, of class TableauPartiel.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        boolean result=false;
        TableauPartiel instance = null;
        boolean expResult = false;
        try{
        result = instance.estVide();
        }catch(NullPointerException e){
         assertEquals(expResult, result);
        }
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class TableauPartiel.
     */
    @Test
    public void testGet() throws Exception {
        System.out.println("get");
        int a_position = 0;
        //TableauPartiel instance = null;
        Object expResult = "test0";
        Object result = test.get(a_position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of remplacer method, of class TableauPartiel.
     */
    @Test
    public void testRemplacer() throws Exception {
        System.out.println("remplacer");
        String a_ancien = "test0";
        String a_nouveau = "testa";
        //TableauPartiel instance = null;
        test.remplacer(a_ancien, a_nouveau);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class TableauPartiel.
     */
    @Test
    public void testSet() throws Exception {
        System.out.println("set");
        int a_position = 0;
        Object a_element = "test1";
        //ableauPartiel instance = null;
        test.set(a_position, (String) a_element);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of taille method, of class TableauPartiel.
     */
    @Test
    public void testTaille() {
        System.out.println("taille");
        //TableauPartiel instance = null;
        int expResult = 2;
        int result = test.taille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ToString method, of class TableauPartiel.
     */
    @Test
    public void testToString() {
        
    }
    
}
