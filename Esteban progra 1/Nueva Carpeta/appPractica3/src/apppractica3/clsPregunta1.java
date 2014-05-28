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
public class clsPregunta1 
{
    private int N;

    public clsPregunta1() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número\n\n"
            + "Luego se le desplegará un menú");
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número (entre 1 y 12): "));
        }while(this.N<1 || this.N>12);
        JOptionPane.showMessageDialog(null, "El mes "+this.N+" es: "+Mes());
    }
    
    private String Mes()
    {
        switch(this.N)
        {
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Setiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
        }
        return "";
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"         MENU\n\n"
                + "1- Cambiar mes\n"
                + "2- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                do
                {
                    this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de un mes (entre 1 y 12): "));
                }while(this.N<1 || this.N>12);
                JOptionPane.showMessageDialog(null, "El mes "+this.N+" es: "+Mes());
                Menu();
                break;
            }
        }
    }
}
