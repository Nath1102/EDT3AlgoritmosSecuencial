/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt2algoritmosecuencial;

/**
 *
 * @author nathalyarias
 */
public class EDT2AlgoritmoSecuencial {

    /**
     * @param args the command line arguments
     */
        public void seleccion(int a[]) {
          for (int i = 0; i < a.length - 1; i++)
       {
               int min = i;
               for (int j = i + 1; j < a.length; j++)
               {
                       if (a[j] < a[min]){
                               min = j;
                       }
               }
                       int aux= a[i];
                       a[i] = a[min];
                       a[min] = aux;
               }
       } 
          public void imprime(int a[]){
              for (int i=0; i < a.length-1; i++){
                  System.out.print(a[i]+ "\t");
              }
          }
          
        } 
        

    
