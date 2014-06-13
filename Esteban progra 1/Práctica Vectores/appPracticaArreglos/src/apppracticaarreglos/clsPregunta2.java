/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticaarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta2 
{
    private int [] A;
    private int [] B;
    private int [] C;
    private int op;
    
    public clsPregunta2()
    {
        JOptionPane.showMessageDialog(null,"A continuación deberá ingresar 2 grupos de cuatro números");
        do
        {
            this.A = new int [4];
            this.B = new int [4];
            this.C = new int [4];
            Ingresar();
            Suma();
            JOptionPane.showMessageDialog(null, "Las sumas de los números de ambos grupos queda de la siguiente forma\n\n"
                    + Mostrar(0));
            this.op = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"Si desea ingresar nuevamente los 2 grupos de números\n"
                    + "digite 1, sino digite cualquier otro número: "));
        }while(this.op==1);
    }
    
    private void Ingresar()
    {
        for (int i = 0; i < 4; i++) 
        {
            this.A[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Grupo 1\n\n"
                    + (i+1)+" - Ingrese un número: "));
        }
        for (int i = 0; i < 4; i++) 
        {
            this.B[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Grupo 2\n\n"
                    + (i+1)+" - Ingrese un número: "));
        }
    }
    
    private void Suma()
    {
        for (int i = 0; i < 4; i++) 
        {
            this.C[i] = this.A[i] + this.B[i];
        }
    }
    
    private String Mostrar(int i)
    {
        if (i>3) 
        {
            return "";
        } else 
        {
            String muestra = this.A[i]+" + "+this.B[i]+" = "+this.C[i]+"\n"+Mostrar(i+1);
            return muestra;
        }
    }
}
