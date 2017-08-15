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
public class EDNAriasDA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cuál es el tamaño del vectro?: ");
        Scanner size = new Scanner(System.in);
        
        int n=size.nextInt();
        
        Secuencial main = new Secuencial();
        main.setVector(main.RandomVector(n));
        System.out.println(main.DisplayVector());
    }
    
}
