/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsEjercicio1 
{
    private int [][] Matriz = new int [5][2];

    public clsEjercicio1() 
    {
        
    }
    
    public void Ingresar()
    {
        for (int x = 0; x < 5; x++) 
        {
            for (int y = 0; y < 2; y++) 
            {
                this.Matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"
                        + "\n\nColumna "+(x+1)+"   Fila: "+(y+1)));
            }
        }
    }
    
    public String Mostrar(int x, int y)
    {
        if (y<2) 
        {
            if (x<5) 
            {
                String muestra = this.Matriz[x][y]+" "+Mostrar(x+1, y);
                return muestra;
            } else 
            {
                String muestra = "\n"+Mostrar(0, y+1);
                return muestra;
            }
        } else 
        {
            return "";
        }
    }
}
