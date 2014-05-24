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
public class clsPregunta10 
{
    private int promedio;
    private int calif;
    
    public clsPregunta10()
    {
        JOptionPane.showMessageDialog(null,"Se le va a solicitar una serie de números\n\n"
                + "Luego aparecerá un menú");
        JOptionPane.showMessageDialog(null,"Vamos a calcular un promedio de calificaciones\n"
                + "Entre 0 y 10 (cero => termina)");
        Ingresar();
    }
    
    private void Ingresar()
    {
        int i=0;
        do
        {
            i=i+1;
            do
            {
                this.calif=Integer.parseInt(JOptionPane.showInputDialog(null,i+" Ingrese una calificación: "));
            }while(this.calif<0 || this.calif>10);
            this.promedio=this.promedio+this.calif;
        }while(this.calif!=0);
        if (i==1) 
        {
            JOptionPane.showMessageDialog(null,"Promedio: No ingresó ninguna calificación!!!");
        } else 
        {
            JOptionPane.showMessageDialog(null,"Promedio: "+(this.promedio/(i-1)));
        }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"            MENU\n\n"
                + "1 - Reingresar calificaciones\n"
                + "2 - Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                Ingresar();
                Menu(); break;
            }
        }
    }
}