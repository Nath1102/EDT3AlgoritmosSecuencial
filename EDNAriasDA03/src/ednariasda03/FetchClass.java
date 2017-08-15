/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ednariasda03;
import java.util.*;
/**
 *
 * @author nathalyarias
 */
public abstract class FetchClass {
    
   protected int[] v;
   
   abstract int Fetch(int n);

    public int[] getVector() {
        return v;
    }

    public void setVector(int[] v) {
        this.v = v;
    }
    
    public int[] RandomVector(int n){
       int[] vector = new int [n];
       
        for (int i=0; i<vector.length; i++){
         vector[i] = (int)(Math.random()*10);
        }
        return vector;
    }
    
    public String DisplayVector(){
        String display;
        display = "( ";
        for(int i=0;i<v.length;i++){
            display = display + v[i];
            if(i<v.length-1){
                display = display + " ";
            }
            
        }display = display + " )";
        return display;
    }

    public void showFetch(int n){
        System.out.println("El número es: " + n);
                }
          
}