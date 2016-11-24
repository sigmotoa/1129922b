/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taberna;

/**
 *
 * @author SergioIván
 */
public class Persona 
{

    String name;
    String id;
    String surname;
    int birthday[]=new int[3];// 0=dia, 1=mes, 2=año
    byte age;

    public Persona(String name, String id, String surname, int day[]) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        birthday=day;
    }

    public Persona() {
    }
    
    
    
}
