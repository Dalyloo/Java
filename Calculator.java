/*
 * Dalila MEKRARBECHE
 * BDML 3
 * TP0 - Calculatrice
 * 16/11/2026
 */
package calculator;

/**
 *
 * @author daly3
 */

import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        
        int operateur; 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer l'operateur :");
        operateur=sc.nextInt();
        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : l'operateur doit etre compris entre 1 et 5.");
        } else {
        
        int operande1; 
        System.out.println("\n Entrer une première valeur :");
        operande1=sc.nextInt();
        
        int operande2; 
        System.out.println("\n Entrer une deuxieme valeur :");
        operande2=sc.nextInt();
        
        int resultat = 0;
        boolean operateurValide = true;
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
           
        }
        System.out.println("The result is : " + resultat);
        
    }
    
}
}