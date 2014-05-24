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
public class clsPregunta5 
{
    private int A;

    public clsPregunta5() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitarÃ¡ un nÃºmero\n\n"
                + "Luego se le desplegarÃ¡ un menu");
        this.A=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
    }
    
    private String Tipo()
    {
        if ((this.A%2)==0) 
        {
            return "PAR";
        } else 
        {
            return "IMPAR";
        }
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU\n\n"
                + "1- Â¿Es par o impar?\n"
                + "2- Cambiar nÃºmero\n"
                + "3- Salir\n\n"
                + "OpciÃ³n: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "El nÃºmero "+this.A+" es: "+Tipo());
                Menu(); break;
            }
            case 2:
            {
                this.A=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
                Menu(); break;
            }
        }
    }
}
