/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author remedy
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("whats your name");
        
        String myname =input.nextLine();
        
        // TODO code application logic here
        System.out.printf("hello,%s !!\n ",myname);
        
    }
    
}
