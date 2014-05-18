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
public class clsPregunta6 
{
    private int B;

    public clsPregunta6() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número\n\n"
                + "Luego se le desplegará un menu");
        this.B=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
    }
    
    private String Tipo()
    {
        if (this.B<0) 
        {
            return "NEGATIVO";
        } else 
        {
            return "POSITIVO";
        }
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU\n\n"
                + "1- ¿Es positivo o negativo?\n"
                + "2- Cambiar número\n"
                + "3- Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "El número "+this.B+" es: "+Tipo());
                Menu(); break;
            }
            case 2:
            {
                this.B=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
                Menu(); break;
            }
        }
    }
}
