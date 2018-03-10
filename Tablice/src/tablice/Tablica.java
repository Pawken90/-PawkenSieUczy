/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablice;


/**
 *
 * @author pawla
 */
public class Tablica 
{
  
    
    void printNumbers() 
{
   int a = 0 ;
   
   int[] tablica = new int[10] ;
   
   while(a < tablica.length-1)
   {
       tablica[a] = a * 5;
       
       System.out.println(tablica[a]);
       
       a++;
   }
    
    
}
    
}