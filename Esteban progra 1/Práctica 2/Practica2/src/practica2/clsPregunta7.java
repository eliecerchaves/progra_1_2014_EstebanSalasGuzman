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
public class clsPregunta7 
{
    private int N;
    private final int [] ParImpar = new int [2];
    private final int [] Cant = new int [100];
    
    public clsPregunta7() 
    {
        JOptionPane.showMessageDialog(null, "Se le pedirá un número\n"
                + "Luego se le mostrará un menú");
        do
        {
            this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántos números quiere ingresar?: "));
        }while(this.N<1);
        Ingresar();
    }

    private String Ingresados(int i)
    {
        if (i>=this.N) 
        {
            return "";
        } else 
        {
            String Ing = this.Cant[i]+"  "+Ingresados(i+1);
            return Ing;
        }
    }
    private void Ingresar()
    {
        for (int i = 0; i < this.N; i++) 
        {
            do
            {
                this.Cant[i]=Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+" Ingrese un número (positivo): "));
            }while(this.Cant[i]<1);
            if ((this.Cant[i]%2)==0) 
            {
                this.ParImpar[0]=this.ParImpar[0]+1;
            } else 
            {
                this.ParImpar[1]=this.ParImpar[1]+1;
            }
        }
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"            MENU\n\n"
                + "1 - Ver cantidad de pares e impares\n"
                + "2 - Ingresar otra cantidad de números\n"
                + "3 - Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "De los números ingresados\n"
                        + Ingresados(0)+"\n\n"
                        + "Hay:\n"
                        + this.ParImpar[0]+" pares y "+this.ParImpar[1]+" impares");
                Menu(); break;
            }
            case 2:
            {
                do
                {
                    this.N=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántos números quiere ingresar?: "));
                }while(this.N<1);
                Ingresar();
                Menu(); break;
            }
        }
    }
}
