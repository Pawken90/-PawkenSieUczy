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
public class Break 
{
    void breakDruk()
    {
        for(int i = 1 ; i <= 10 ; i++)
    {
            for(int j = 1 ; j <= 10 ; j++)

            {
                if (j % 2 != 0 )
                    continue;
            
                System.out.print(i*j +" ");
            }
        System.out.println("");
    }    
    }
    
    
    
    
    
    
    
    
}
