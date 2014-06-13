/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica4;

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
        this.opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                + "Seleccione el ejercicio que desea realizar\n"
                + "1 - 2 \n"
                + "!= Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1: {clsPregunta1 A = new clsPregunta1();A.Menu();Menu();break;}
            case 2: {clsPregunta2 A = new clsPregunta2();A.Menu();Menu();break;}
        }
    }
}
