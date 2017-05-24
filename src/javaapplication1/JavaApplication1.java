/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author JeBroer 
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */


/**
 *
 * @author wilger
 */
   


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int geheelgetal;
        System.out.print("geef een geheel getal : ");
        geheelgetal = input.nextInt();
        
        System.out.print("geef een double : ");
        
        
        double tweedegetal = input.nextDouble();
        double uitkomst = geheelgetal / tweedegetal; //double / int ==> double
        System.out.println(uitkomst);
        
        String eersteGetal = "1";
        String tweedeGetal = "2";
        
        System.out.println(eersteGetal + tweedeGetal);
        
        int een,twee;
        
        een = Integer.decode(eersteGetal);
        twee = Integer.decode(tweedeGetal);
        
        System.out.println(een + twee);
        
    }
    
    
}



        
        
 
        
        
    
        
        
    