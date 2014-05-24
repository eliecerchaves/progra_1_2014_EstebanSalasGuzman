/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta2 
{
    private int X,Y;
    private double N,M;
    
    public clsPregunta2()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitarÃ¡ 2 pares de nÃºmeros\n\n"
            + "Luego se le desplegarÃ¡ un menÃº");
        this.X=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
            + "Ingrese un nÃºmero: "));
        this.Y=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
            + "Ingrese otro nÃºmero: "));
        this.N=Double.parseDouble(JOptionPane.showInputDialog(null,"   Grupo B\n\n"
            + "Ingrese un nÃºmero: "));
        this.M=Double.parseDouble(JOptionPane.showInputDialog(null,"   Grupo B\n\n"
            + "Ingrese otro nÃºmero: "));
    }
    
    private double suma(int i)
    {
        switch(i)
        {
            case 1:
            {
                return (this.X+this.Y);
            }
            case 2:
            {
                return (this.N+this.M);
            }
        }
        return 0;
    }
    private double resta(int i)
    {
        switch(i)
        {
            case 1:
            {
                return (this.X-this.Y);
            }
            case 2:
            {
                return (this.N-this.M);
            }
        }
        return 0;
    }
    private double multiplicacion(int i)
    {
        switch(i)
        {
            case 1:
            {
                return (this.X*this.Y);
            }
            case 2:
            {
                return (this.N*this.M);
            }
        }
        return 0;
    }
    private double division(int i)
    {
        switch(i)
        {
            case 1:
            {
                return (this.X/this.Y);
            }
            case 2:
            {
                return (this.N/this.M);
            }
        }
        return 0;
    }
    
    private void cambiar(int i)
    {
        switch(i)
        {
            case 1:
            {
                this.X=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
                    + "Ingrese un nÃºmero: "));
                this.Y=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
                    + "Ingrese otro nÃºmero: "));
                break;
            }
            case 2:
            {
                this.N=Double.parseDouble(JOptionPane.showInputDialog(null,"   Grupo B\n\n"
                    + "Ingrese un nÃºmero: "));
                this.M=Double.parseDouble(JOptionPane.showInputDialog(null,"   Grupo B\n\n"
                    + "Ingrese otro nÃºmero: "));
                break;
            }
        }
    }
    
    private int submenu(char grupo)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog(null,"     MENU "+grupo+"\n\n"
                            + "1- Ver suma\n"
                            + "2- Ver resta\n"
                            + "3- Ver multiplicaciÃ³n\n"
                            + "4- Ver divisiÃ³n\n"
                            + "5- Cambiar nÃºmeros\n"
                            + "6- Salir\n\n"
                            + "Opcion: ")));
    }
    
    private void MenuA()
    {
        switch(submenu('A'))
            {
                case 1:
                    {
                        JOptionPane.showMessageDialog(null,"La suma de "+this.X+" y "+this.Y+" es: "+(int)suma(1));
                        MenuA();
                        break;
                    }
                case 2:
                    {
                        JOptionPane.showMessageDialog(null,"La resta de "+this.X+" y "+this.Y+" es: "+(int)resta(1));
                        MenuA();
                        break;
                    }
                case 3:
                    {
                        JOptionPane.showMessageDialog(null,"La multiplicaciÃ³n de "+this.X+" y "+this.Y+" es: "+(int)multiplicacion(1));
                        MenuA();
                        break;
                    }
                case 4:
                    {
                        JOptionPane.showMessageDialog(null,"La divisiÃ³n de "+this.X+" y "+this.Y+" es: "+(int)division(1));
                        MenuA();
                        break;
                    }
                case 5:
                    {
                        cambiar(1);
                        MenuA();
                    }
            }  
    }
    
    private void MenuB()
    {
        switch(submenu('B'))
            {
                case 1:
                    {
                        JOptionPane.showMessageDialog(null,"La suma de "+this.N+" y "+this.M+" es: "+suma(2));
                        MenuB();
                        break;
                    }
                case 2:
                    {
                        JOptionPane.showMessageDialog(null,"La resta de "+this.N+" y "+this.M+" es: "+resta(2));
                        MenuB();
                        break;
                    }
                case 3:
                    {
                        JOptionPane.showMessageDialog(null,"La multiplicaciÃ³n de "+this.N+" y "+this.M+" es: "+multiplicacion(2));
                        MenuB();
                        break;
                    }
                case 4:
                    {
                        JOptionPane.showMessageDialog(null,"La divisiÃ³n de "+this.N+" y "+this.M+" es: "+division(2));
                        MenuB();
                        break;
                    }
                case 5:
                    {
                        cambiar(2);
                        MenuB();
                    }
            }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
               + "1- Ver grupo A\n"
               + "2- Ver grupo B\n"
               + "3- Salir\n\n"
               + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                MenuA();
                Menu();
                break;
            }
            case 2:
            {
                MenuB();
                Menu();
                break;
            }
        }
    }
}
