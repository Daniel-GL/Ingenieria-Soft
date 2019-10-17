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
public class StringE {
    
//    public boolean stringE(String str) {
//        
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'e') {
//                count++;
//            }
//        }
//        if (count >= 1 && count <= 3) 
//        {
//            return true;
//        } 
//        else 
//            {
//                return false;
//            }
//    }
    
    
    public boolean stringE(String str) {
  int count = 0;

  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == 'e') count++;
    // alternately: str.substring(i, i+1).equals("e")
  }

  return (count >= 1 && count <= 3);
}
    
    
}
