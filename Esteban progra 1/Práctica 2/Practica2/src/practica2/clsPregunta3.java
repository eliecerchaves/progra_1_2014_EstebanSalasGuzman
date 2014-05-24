
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
public class clsPregunta3 
{
    private double N;
    private double N2;
    private double N3;
    
    public clsPregunta3()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará tres números\n\n"
                + "Luego se le desplegará un menu");
        this.N=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: (inicio) "));
        do
        {
            this.N2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: (final <<mayor que el primero>>) "));
        }while(this.N2<=this.N);
        do
        {
            this.N3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: (secuencia)\n"
                    + "positivo y menor que la diferencia entre los numeros anteriores"));
        }while(this.N3<=0 || this.N3>=(this.N2-this.N));
        
    }
    
    private String Secuencia(Double i)
    {
        if ((i+this.N)>this.N2) 
        {
            return "";
        } else 
        {
            String Sec = (this.N+i)+" , "+Secuencia(i+this.N3);
            return Sec;
        }
    }
    private void Cambio(int i)
    {
        switch(i)
        {
            case 1: 
                this.N=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: (inicio) "));
                break;
            case 2:
                do
                {
                    this.N2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: (final <<mayor que el primero>>) "));
                }while(this.N2<=this.N);
                break;
            case 3:
                do
                {
                    this.N3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un número: (secuencia)\n"
                            + "positivo y menor que la diferencia entre los numeros anteriores"));
                }while(this.N3<=0 || this.N3>=(this.N-this.N2));
                break;
        }
    }
    
    public void Menu()
    {
        
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"      MENU\n\n"
                + "1- Ver secuencia\n"
                + "2- Cambiar el número inicial\n"
                + "3- Cambiar el número final\n"
                + "4- Cambiar el número secuencial\n"
                + "5- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null,"Inicio: "+this.N+"\n"
                        + "Fin: "+this.N2+"\n"
                        + "Secuencia: "+this.N3+"\n\n"
                        + Secuencia(0.0));
                Menu(); break;
            }
            case 2:
            {
                Cambio(opcion-1);
                Menu(); break;
            }
            case 3:
            {
                Cambio(opcion-1);
                Menu(); break;
            }
            case 4:
            {
                Cambio(opcion-1);
                Menu(); break;
            }
        }
    }
}
