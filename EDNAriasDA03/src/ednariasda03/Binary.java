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
public class Binary extends FetchClass {
@Override
public int Fetch(int num){ 
    int n = v.length;
    int start = 0;
    int center;
    int last = n-1;

    while(start<=last){ 
     center=(start+last)/2; 
     
     if(v[center]==num)
         return center; 
     
     if(num < v [center] ){
        last=center-1; 
     }else {
       start =center+1; 
     }
     
   }
   return -1;
 
 }
}
