/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ednariasda03;

/**
 *
 * @author nathalyarias
 */
public class Secuencial extends FetchClass{
   @Override
    int Fetch(int n) {
        for(int i=0; i<v.length; i++){ 
            if(v[i]== n){
                return i;
        }
        }
        return -1;
    }

    
}
