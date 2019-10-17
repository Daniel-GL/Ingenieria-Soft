/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oliva
 */
public class blue_ticketTest {
    
    public blue_ticketTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    

    @Test
    public void caso1() 
    {
        
        int a = 9;
        int b = 1;
        int c = 0;
         System.out.println("BLUETICKET CASO 1 (9,1,0)");
         String str= "Code";
        blue_ticket instance = new blue_ticket();
        int expResult = 10;
        int result = instance.blueTicket(a, b, c);
        assertEquals(expResult, result);  
        
    }
    
    @Test
     public void caso2() 
    {
        
        int a = 9;
        int b = 2;
        int c = 0;
         System.out.println("BLUETICKET CASO 2 (9,2,0)");
        blue_ticket instance = new blue_ticket();
        int expResult = 0;
        int result = instance.blueTicket(a, b, c);
        assertEquals(expResult, result);  
        
    }
     
     
     @Test
     public void caso3() 
    {
        
        int a = 6;
        int b = 1;
        int c = 4;
         System.out.println("BLUETICKET CASO 3 (6,1,4)");
         String str= "Code";
        blue_ticket instance = new blue_ticket();
        int expResult = 10;
        int result = instance.blueTicket(a, b, c);
        assertEquals(expResult, result);  
        
    }

    /**
     * Test of blueTicket method, of class blue_ticket.
     */
    @org.junit.Test
    public void testBlueTicket() {
        System.out.println("blueTicket");
        int a = 0;
        int b = 0;
        int c = 0;
        blue_ticket instance = new blue_ticket();
        int expResult = 0;
        int result = instance.blueTicket(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
