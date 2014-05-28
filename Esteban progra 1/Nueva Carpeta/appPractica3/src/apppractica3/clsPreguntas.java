/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

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
                + "OpciÃ³n: "));
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
                clsPregunta3 A = new clsPregunta3();
                A.Menu();
                Menu();
                break;
            }
            case 4:
            {
                clsPregunta4 A = new clsPregunta4();
                A.Menu();
                Menu();
                break;
            }
            case 5:
            {
                clsPregunta5 A = new clsPregunta5();
                A.Menu();
                Menu();
                break;
            }
            case 6:
            {
                clsPregunta6 A = new clsPregunta6();
                A.Menu();
                Menu();
                break;
            }
            case 7:
            {
                clsPregunta7 A = new clsPregunta7();
                A.Menu();
                Menu();
                break;
            }
        }
    }
}
