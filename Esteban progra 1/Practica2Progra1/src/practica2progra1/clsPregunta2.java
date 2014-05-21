/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2progra1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta2 
{
    private int N,Y;
    
    public clsPregunta2()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará 2 números (positivos)\n\n"
            + "Luego se le desplegará un menú");
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
            this.Y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
        }while(this.N<=0 || this.Y<=0);
        
    }
        
    private void cambiar()
    {
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
            this.Y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
        }while(this.N<=0 || this.Y<=0);
    }
    private String Respuesta(int i, String Res)
    {
        if (i>this.N) 
        {
            return " ";
        } else 
        {
            if ((this.Y%i)==0) 
            {
                Res=Res+" * "+Respuesta(i+1,Res);
                return Res;
            } else 
            {
                Res=Res+" "+i+" "+Respuesta(i+1,Res);
                return Res;
            }
        }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
               + "1- Ver respuesta\n"
               + "2- Cambiar números\n"
               + "3- Salir\n\n"
               + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "Aparecerá en pantalla una secuencia\n"
                        + "Esta empezará en 1 y terminará en el primer número ingresado ("+this.N+")\n"
                        + "Los números de dicha secuencia que sean múltiplos del segundo\n"
                        + "número ingresado ("+this.Y+") serán reemplazados por un *");
                JOptionPane.showMessageDialog(null, Respuesta(1," "));
                Menu();
                break;
            }
            case 2:
            {
                cambiar();
                Menu();
                break;
            }
        }
    }    
}
