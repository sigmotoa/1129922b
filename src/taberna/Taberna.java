/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taberna;

import java.util.Scanner;

/**
 *
 * @author SergioIván
 */
public class Taberna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Persona migente[]=new Persona[3];
        Scanner read=new Scanner(System.in);
        //String dato="";
        for (int i = 0; i < migente.length; i++) 
        {   migente[i]=new Persona();
            System.out.println("Ingrese el nombre");
            //dato=read.next();
            migente[i].name=read.next();
            System.out.println("Ingrese apellido");
          //  dato=read.next();
            migente[i].surname=read.next();
            System.out.println("Ingrese ID");
            migente[i].id=read.next();
            System.out.println("Ingrese dia mes y año separadamente");
            for (int j = 0; j < 3; j++) {
            migente[i].birthday[j]=read.nextInt();
            }
            
            
            
            
        }
            
    
    }
    
}
