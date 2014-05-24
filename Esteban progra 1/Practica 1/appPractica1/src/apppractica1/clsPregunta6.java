/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica1;

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
        JOptionPane.showMessageDialog(null,"Se le solicitarÃ¡ un nÃºmero\n\n"
                + "Luego se le desplegarÃ¡ un menu");
        this.B=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
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
                + "1- Â¿Es positivo o negativo?\n"
                + "2- Cambiar nÃºmero\n"
                + "3- Salir\n\n"
                + "OpciÃ³n: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "El nÃºmero "+this.B+" es: "+Tipo());
                Menu(); break;
            }
            case 2:
            {
                this.B=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
                Menu(); break;
            }
        }
    }
}
