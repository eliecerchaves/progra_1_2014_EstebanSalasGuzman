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
public class clsPregunta8 
{
    private int n;
    private int n2;
    
    public clsPregunta8()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará un número\n\n"
                + "Luego aparecerá un menú");
        do
        {
            this.n=Integer.parseInt(JOptionPane.showInputDialog(null,"La tabla de cuál número quiere ver¿: "));
        }while(this.n<0);
        do
        {
            this.n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Tabla del "+this.n+"\n\n"
                    + "Empezará desde el cero\n"
                    + "Hasta cuál número quiere verla¿: "));
        }while(this.n2<=0);
    }
    
    
    private String Tabla(int i)
    {
        if (i>this.n2) 
        {
            return "";
        } else 
        {
            String tab = i+"x"+this.n+"="+(i*this.n)+"\n"+Tabla(i+1);
            return tab;
        }
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"         MENU\n\n"
                + "1 - Ver tabla del "+this.n+"\n"
                + "2 - Cambiar tabla\n"
                + "3 - Cambiar tope ("+this.n2+")\n"
                + "4 - Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null,"Tabla del "+this.n+"\n\n"+Tabla(0)); //recursiva
                /* Usando for
                for (int i = 0; i <= this.n2; i++) 
                {
                    System.out.println(i+"x"+this.n+"="+(i*this.n));
                }
                */
                /* Usando while
                int i = 0;
                while(i<=this.n2)
                {
                    System.out.println(i+"x"+this.n+"="+(i*this.n));
                    i=i+1;
                }
                */
                /* Usando do while
                int i = 0;
                do
                {
                    System.out.println(i+"x"+this.n+"="+(i*this.n));
                    i=i+1;
                }while(i<=this.n2);
                */
                Menu(); break;
            }
            case 2:
            {
                do
                {
                    this.n=Integer.parseInt(JOptionPane.showInputDialog(null,"La tabla de cuál número quiere ver¿: "));
                }while(this.n<0);
                Menu(); break;
            }
            case 3:
            {
                do
                {
                    this.n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Tabla del "+this.n+"\n\n"
                            + "Empezará desde el cero\n"
                            + "Hasta cuál número quiere verla¿: "));
                }while(this.n2<=0);
                Menu(); break;
            }
        }
    }
}
