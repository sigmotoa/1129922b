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
public class Persona {

    String name;
    String id;
    String surname;
    int birthday[] = new int[3];// 0=dia, 1=mes, 2=año
    byte age;
    final int FECHAACTUALA = 2016;
    final int FECHAACTUALM = 11;
    final int FECHAACTUALD = 24;
    int FECHAACTUAL[] = {FECHAACTUALD, FECHAACTUALM, FECHAACTUALA};

    public Persona(String name, String id, String surname, int day[]) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        birthday = day;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        
        calcularEdad();
        return name + " " + surname + "\t" + id + " " +age;

    }

    public void calcularEdad() {
        age = (byte) (FECHAACTUALA - birthday[2]);

    }

    public int[] calcularEdad(int fecha[]) {
        int arre[] = new int[3];
        for (int i = 0; i < fecha.length; i++) {
            arre[i] = FECHAACTUAL[i] - fecha[i];

        }
        return arre;
    }

}
