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
public class clsPregunta1 
{
    private int N;
    private double A;
    private char C;

    public clsPregunta1() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará 2 números\n\n"
            + "El primero será tipo entero\n"
            + "El segundo será tipo decimal\n\n"
            + "Además se le solicitará un caracter del teclado\n\n"
            + "Luego se le desplegará un menú");
        this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        this.A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
        this.C=JOptionPane.showInputDialog(null,"Ingrese un caracter del teclado ").charAt(0);
    }
    
    private void cambiar(int i)
    {
        switch(i)
        {
            case 1:
            {
                this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
                this.A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
            }
            case 2:
            {
                this.C=JOptionPane.showInputDialog(null,"Ingrese un caracter del teclado ").charAt(0);
            }
        }
    }
    private double suma()
    {
        return (this.N+this.A);
    }
    private double resta()
    {
        if ((this.N-this.A)<0) 
        {
            return ((this.N-this.A)*-1);
        } else 
        {
            return (this.N-this.A);
        }
        
    }
    private int valorDec()
    {
        return (int)this.C;
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"         MENU\n\n"
                + "1- Ver suma\n"
                + "2- Ver diferencia (en la recta numérica)\n"
                + "3- Ver valor dec. del caracter\n"
                + "4- Cambiar números\n"
                + "5- Cambiar caracter\n"
                + "6- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "La suma de "+this.N+" y "+this.A+" es: "+suma());
                Menu();
                break;
            }
            case 2:
            {
                JOptionPane.showMessageDialog(null, "La diferencia entre "+N+" y "+A+" es: "+resta());
                Menu();
                break;
            }
            case 3:
            {
                JOptionPane.showMessageDialog(null,"El valor decimal de "+C+" es: "+valorDec());
                Menu();
                break;
            }
            case 4:
            {
                cambiar(1);
                Menu();
                break;
            }
            case 5:
            {
                cambiar(2);
                Menu();
                break;
            }
        }
    }     
}
