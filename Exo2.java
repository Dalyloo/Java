/*
 * Dalila MEKRARBECHE
 * BDML 3
 * TP0 - Calculatrice
 * 16/11/2026
 */
package exo2;

/**
 *
 * @author daly3
 */

import java.util.Scanner;

public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; //indice
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
        result=result+ind;
        ind++;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
