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
    private int N2;
    
    public clsPregunta3()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número\n\n"
                + "Luego se le desplegará un menu");
        this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        this.N2=this.N;
    }
    
    private void Proced(int i)
    {
        switch(i)
        {
            case 2:
            {
                this.N2=this.N2+77;
                break;
            }
            case 3:
            {
                this.N2=this.N2-3;
                break;
            }
            case 4:
            {
                this.N2=this.N2*2;
            }
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
                JOptionPane.showMessageDialog(null,"El número inicial es: "+this.N+"\n"
                        + "El número actual es: "+this.N2);
                Menu(); break;
            }
            case 2:
            {
                Proced(2);
                JOptionPane.showMessageDialog(null,"Aumento realizado");
                Menu(); break;
            }
            case 3:
            {
                Proced(3);
                JOptionPane.showMessageDialog(null,"Disminución realizada");
                Menu(); break;
            }
            case 4:
            {
                Proced(4);
                JOptionPane.showMessageDialog(null,"Duplicación realizada");
                Menu(); break;
            }
            case 5:
            {
                this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
                this.N2=this.N;
                Menu(); break;
            }
        }
    }
}
