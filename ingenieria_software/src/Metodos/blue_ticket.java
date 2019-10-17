/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author oliva
 */
public class blue_ticket 
{
    
     public int blueTicket(int a, int b, int c) 
     {
        if ((a + b) == 10)
            return 10;
        if ((a + c) == 10)
            return 10;
        if ((b + c) == 10)
            return 10;
        if ((a + b) == 5)
            return 5;
        if ((a + c) == 5)
            return 5;
        if ((b + c) == 5)
            return 5;
        return 0;
    }
}
    

