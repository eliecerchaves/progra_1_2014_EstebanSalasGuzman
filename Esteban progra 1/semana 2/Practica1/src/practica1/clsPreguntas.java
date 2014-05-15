/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPreguntas 
{
    private int pregunta;
    
    public clsPreguntas()
    {
        this.pregunta=0;
    }
    
    public void Menu()
    {
        this.pregunta=Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione un ejercicio: \n\n"
                + "1 - 2 - 3 - 4 - 5 - 6 - 7\n"
                + "Otro # - Salir\n\n"
                + "Opción: "));
        switch(this.pregunta)
        {
            case 1:
            {
                clsPregunta1 A = new clsPregunta1();
                A.Menu();
                Menu();
                break;
            }
            case 2:
            {
                clsPregunta2 A = new clsPregunta2();
                A.Menu();
                Menu();
                break;
            }
            case 3:
            {
                
                Menu();
                break;
            }
            case 4:
            {
                
                Menu();
                break;
            }
            case 5:
            {
                
                Menu();
                break;
            }
            case 6:
            {
                
                Menu();
                break;
            }
            case 7:
            {
                
                Menu();
                break;
            }
        }
    }
}
