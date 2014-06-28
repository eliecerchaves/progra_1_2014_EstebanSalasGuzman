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
public class clsEjercicio2 
{
    private int [][] Matriz;
    private int n,m;

    public clsEjercicio2() 
    {
        do
        {
            this.n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de columnas que quiere que tenga la matriz"));
        }while(this.n<2);
        do
        {
            this.m = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de filas que quiere que tenga la matriz"));
        }while(this.m<2);
        this.Matriz = new int [this.n][this.m];
    }
    
    public void Ingresar()
    {
        for (int y = 0; y < this.m; y++) 
        {
            for (int x = 0; x < this.n; x++) 
            {
                this.Matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"
                        + "\n\nColumna "+(x+1)+"   Fila: "+(y+1)));
            }
        }
    }
    
    public void Intercambiar()
    {
        int aux = 0;
        for (int x = 0; x < this.n; x++) 
        {
            aux                 =   this.Matriz[x][0];
            this.Matriz[x][0]   =   this.Matriz[x][1];
            this.Matriz[x][1]   =   aux;
        }
    }
    
    public String Mostrar(int x, int y)
    {
        if (y<this.m) 
        {
            if (x<this.n) 
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
