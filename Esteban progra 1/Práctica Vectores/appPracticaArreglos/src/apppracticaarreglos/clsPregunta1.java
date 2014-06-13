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
public class clsPregunta1 
{
    private int [] elementos;
    private int aux;
    private int suma;
    
    public clsPregunta1()
    {
        this.elementos = new int [8];
        JOptionPane.showMessageDialog(null,"A continuación deberá ingresar 8 números enteros\n\n"
                + "Luego se le mostrará unos resultados");
        do
        {
            Ingresar();
            JOptionPane.showMessageDialog(null, "El valor acumulado de todos los números ingresados es: "+Mostrar(0));
            JOptionPane.showMessageDialog(null, "El valor acumulado de los números mayores a 36 es: "+Mostrar(36));
            JOptionPane.showMessageDialog(null, "Usted ingresó "+Mostrar(50)+" números mayores que 50");
            this.aux=Integer.parseInt(JOptionPane.showInputDialog(null, "Si desea volver a ingresar los números digite 1"));
        }while(this.aux==1);
        
    }
    
    private void Ingresar()
    {
        for (int i = 0; i < 8; i++) 
        {
            this.elementos[i]=(int)Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+" - Ingrese un valor: "));
        }
    }
    
    private int Mostrar(int aux)
    {
        this.suma = 0;
        switch(aux)
        {
            case 0:
            {
                for (int i = 0; i < this.elementos.length; i++) 
                {
                    this.suma = this.suma + this.elementos[i];
                }
                return this.suma;
            }
            case 36:
            {
                for (int i = 0; i < this.elementos.length; i++) 
                {
                    if (this.elementos[i]>aux) 
                    {
                        this.suma = this.suma + this.elementos[i];
                    }
                }
                return this.suma;
            }
            default:
                for (int i = 0; i < this.elementos.length; i++) 
                {
                    if (this.elementos[i]>50) 
                    {
                        this.suma++;
                    }
                }
        }
        return this.suma;
    }
}
