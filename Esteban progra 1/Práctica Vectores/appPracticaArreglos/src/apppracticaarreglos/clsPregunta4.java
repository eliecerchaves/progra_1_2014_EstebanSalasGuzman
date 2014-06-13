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
public class clsPregunta4 
{
    private int [] A;
    private int op;
    
    public clsPregunta4()
    {
        JOptionPane.showMessageDialog(null,"A continuación deberá ingresar 10 números en orden ascendente");
        do
        {
            this.A = new int [10];
            Ingresar();
            JOptionPane.showMessageDialog(null, Mostrar(0));
            this.op = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"Si desea ingresar nuevamente los 10 números\n"
                    + "digite 1, sino digite cualquier otro número:"));
        }while(this.op==1);
    }
    
    private void Ingresar()
    {
        for (int i = 0; i < 10; i++) 
        {
            this.A[i] = Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+" Número: "));
        }
    }
    private String Mostrar(int c)
    {
        if (c<this.A.length) 
        {
            String muestra = this.A[c]+","+Mostrar(c+1);
            return muestra;
        } else 
        {
            boolean orden = true;
            for (int i = 0; i < (this.A.length-1); i++) 
            {
                if (this.A[i]>this.A[i+1]) 
                {
                    orden = false; break;
                }
            }
            if (orden==true) 
            {
                return "\n\nLos números están ordenados de manera ascendente";
            } else 
            {
                return "\n\nLos números NO están ordenados de manera ascendente";
            }
        }
    }
}
