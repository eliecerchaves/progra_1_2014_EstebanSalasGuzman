/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticaarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPreguntas 
{
    private int opcion;
    
    public clsPreguntas()
    {
        this.opcion=0;
    }
    
    public void Menu()
    {
        this.opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione un ejercicio \n\n"
                + "1 - 2 - 3 - 4\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1: { 
                clsPregunta1 A = new clsPregunta1();
                Menu(); break;}
            case 2: {
                clsPregunta2 A = new clsPregunta2();
                Menu(); break;}
            case 3: {
                clsPregunta3 A = new clsPregunta3();
                Menu(); break;}
            case 4: {
                clsPregunta4 A = new clsPregunta4();
                Menu(); break;}
        }
    }
}
