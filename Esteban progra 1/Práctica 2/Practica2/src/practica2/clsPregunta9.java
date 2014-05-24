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
public class clsPregunta9 
{
    private int n;
    private int promedio;
    
    public clsPregunta9()
    {
        JOptionPane.showMessageDialog(null,"Se le va a solicitar un número\n\n"
                + "Luego aparecerá un menú");
        do
        {
            this.n=Integer.parseInt(JOptionPane.showInputDialog(null,"Vamos a calcular un promedio\n\n"
                    + "Cuántos números quiere ingresar¿: (más de 2)"));
        }while(this.n<2);
        Ingresar();
    }
    
    private void Ingresar()
    {
        int i; i=1;
        while(i<=this.n)
        {
            this.promedio=this.promedio+Integer.parseInt(JOptionPane.showInputDialog(null,i+" Ingrese un número: "));
            i=i+1;
        }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"            MENU\n\n"
                + "1 - Calcular promedio\n"
                + "2 - Cambiar los "+this.n+" números anteriores\n"
                + "3 - Ingresar otra cantidad de números\n"
                + "4 - Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null,"El promedio es: "+(this.promedio/this.n));
                Menu(); break;
            }
            case 2:
            {
                this.promedio=0;
                Ingresar();
                Menu(); break;
            }
            case 3:
            {
                do
                {
                    this.n=Integer.parseInt(JOptionPane.showInputDialog(null,"Vamos a calcular un promedio\n\n"
                            + "Cuántos números quiere ingresar¿: (más de 2)"));
                }while(this.n<2);
                Ingresar();
                Menu(); break;
            }
        }
    }
}
