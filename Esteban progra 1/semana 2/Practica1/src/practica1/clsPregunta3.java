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
public class clsPregunta3 
{
    private int N;
    
    public clsPregunta3()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número\n\n"
                + "Luego se le desplegará un menu");
        this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
    }
    
    private int Aumentar(int i)
    {
        if (i==0) 
        {
            return 0;
        } else 
        {
            int aum=
        }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"      MENU\n\n"
                + "1- Ver número\n"
                + "2- Aumentar 77\n"
                + "3- Decrementar 3\n"
                + "4- Duplicar\n"
                + "5- Cambiar número\n"
                + "6- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null,"E");
            }
            case 2:
            {
                N=N+77;
                Menu();
                break;
            }
            case 3:
            {
                N=N-3;
                Menu();
                break;
            }
            case 4:
            {
                N=N*2;
                Menu();
                break;
            }
            case 5:
            {
                N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
                Menu();
                break;
            }
        }
    }
}
