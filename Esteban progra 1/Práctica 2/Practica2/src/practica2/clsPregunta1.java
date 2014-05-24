/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta1 
{
    private int N;

    public clsPregunta1() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará 1 número (positivo)\n\n"
            + "Luego aparecerá un menú");
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        }while(this.N<=0);
    }
    
    private void cambiar()
    {
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        }while(this.N<=0);    }
    private String asteriscos(int i)
    {
        if (i==0) 
        {
            return " ";
        } else 
        {
            String ast = " * "+asteriscos(i-1);
            return ast;
        }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"         MENU\n\n"
                + "1- Ver 'n' *\n"
                + "2- Cambiar número\n"
                + "3- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null,asteriscos(this.N));
                Menu();
                break;
            }
            case 2:
            {
                cambiar();
                Menu();
                break;
            }
        }
    }     
}
