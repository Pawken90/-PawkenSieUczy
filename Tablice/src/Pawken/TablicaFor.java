/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pawken;

/**
 *
 * @author pawla
 */
public class TablicaFor
{
    void petlaFor()
    {
      
        int[] tablicaFor = new int[10];
        
        for (int i = 0 ; i < tablicaFor.length; i++)
        {
            tablicaFor[i] = i * 5;
                    
            System.out.println(tablicaFor[i]);
        }
    }
  
    
    
}
