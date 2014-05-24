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
public class clsPregunta4 
{
    private int A;

    public clsPregunta4() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará 1 número (excepto cero)\n\n"
                + "Luego se le desplegará un menu");
        do
        {
            this.A=Integer.parseInt(JOptionPane.showInputDialog(null,1+"- Ingrese un número: "));
        }while(this.A==0);
    }
    
    private void Cambio()
    {
        do
        {
            this.A=Integer.parseInt(JOptionPane.showInputDialog(null,1+"- Ingrese un número: "));
        }while(this.A==0);    
    }
    
    private String Padovan(int a,int b,int c)
    {
        if (this.A<0) 
        {
            if((a+b)<this.A)
            {
                return " ";
            }else
            {
                String Pado=","+(a+b)+Padovan(b,c,a+b);
                return Pado;
            }
        } else 
        {
            if((a+b)>this.A)
            {
                return " ";
            }else
            {
                String Pado=","+(a+b)+Padovan(b,c,a+b);
                return Pado;
            }
        }
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU\n\n"
                + "1- Ver secuencia de Padovan\n"
                + "2- Cambiar número\n"
                + "3- Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1:
            {
                if (this.A<0) 
                {
                    JOptionPane.showMessageDialog(null,"-1,-1,-1"+Padovan(-1,-1,-1));
                } else 
                {
                    JOptionPane.showMessageDialog(null,"1,1,1"+Padovan(1,1,1));
                }
                Menu(); break;
            }
            case 2:
            {
                Cambio();
                Menu(); break;
            }
        }
    }
}
