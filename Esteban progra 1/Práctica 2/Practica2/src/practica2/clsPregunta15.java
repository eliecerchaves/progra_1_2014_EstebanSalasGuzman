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
public class clsPregunta15 
{
    private int N;
    
    public clsPregunta15()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número\n"
                + "Luego se desplegará un menú");
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántas filas de números impares desea ver¿: "));
        }while(this.N<1);
    }
    
    private String Filas(int cant, int impr, int num)
    {
        if (cant>this.N) 
        {
            return "";
        } else 
        {
            if (impr<=cant) 
            {
                String fil = num+" "+Filas(cant,impr+1,num+2);
                return fil;
            }else
            {
                String fil = "\n"+Filas(cant+1, 1, 1);
                return fil;
            }
        }
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"      MENU\n\n"
                + "1 - Ver cantidad de filas\n"
                + "2 - Cambiar cantidad de filas\n"
                + "3 - Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, this.N+" filas de números impares\n\n"+Filas(1,1,1));
                Menu(); break;
            }
            case 2:
            {
                do
                {
                    this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántas filas de números impares desea ver¿: "));
                }while(this.N<1);
                Menu(); break;
            }
        }
    }
}