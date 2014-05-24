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
public class clsPregunta5 
{
    private double A;

    public clsPregunta5() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número (excepto cero)\n\n"
                + "Luego se le desplegará un menu");
        do
        {
            this.A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        }while(this.A==0);
    }
    
    private double Elevacion(int i)
    {
        if (i==0) 
        {
            return 1;
        } else 
        {
            double elev=this.A*Elevacion(i-1);
            return elev;
        }
    }
    private void Elevar()
    {
        int pot;
        pot=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la potencia: "));
        JOptionPane.showMessageDialog(null, "El resultado es: "+Elevacion(pot));
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU\n\n"
                + "1- Elevar\n"
                + "2- Cambiar número\n"
                + "3- Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1:
            {
                Elevar();
                Menu(); break;
            }
            case 2:
            {
                do
                {
                    this.A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: "));
                }while(this.A==0);                
                Menu(); break;
            }
        }
    }
}
