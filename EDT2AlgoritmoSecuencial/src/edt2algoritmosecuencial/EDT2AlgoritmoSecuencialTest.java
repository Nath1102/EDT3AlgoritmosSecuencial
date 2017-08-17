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
public class EDT2AlgoritmoSecuencialTest {

    public static void main(String[] args) {
        EDT2AlgoritmoSecuencial ordena = new EDT2AlgoritmoSecuencial();
        int[] arreglo = {10, 2, 5, 20, 24, 50, 7, 13, 14, 3};
        ordena.seleccion(arreglo);
        ordena.imprime(arreglo);
    }
}
