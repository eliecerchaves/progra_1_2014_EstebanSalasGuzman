/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsEjercicios 
{
    private int opcion;
    
    public clsEjercicios()
    {
        this.opcion=0;
    }
    
    public void Menu()
    {
        this.opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "        MENU\n\n"
                + "Seleccione una pregunta\n"
                + "1 - 2 -"));
        switch(this.opcion)
        {
            case 1: {clsEjercicio1 A = new clsEjercicio1(); Menu(); break;}
            case 2: {clsEjercicio2 A = new clsEjercicio2(); A.Menu(); Menu(); break;}
        }
    }
}
