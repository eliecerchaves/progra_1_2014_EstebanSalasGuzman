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
public class clsEjercicio4 
{
    private int [][] Matriz;
    private int n,m;
    private int mayor;
    private String Posiciones;

    public clsEjercicio4() 
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
    
    public void Mayor()
    {
        int c = 0;
        this.mayor = 0;
        for (int y = 0; y < this.m; y++) 
        {
            for (int x = 0; x < this.n; x++) 
            {
                if (this.Matriz[x][y] >= this.mayor) 
                {
                    if (this.Matriz[x][y] == this.mayor) 
                    {
                        c++;
                        this.Posiciones = this.Posiciones + x + "," + y + "\n";
                    }else
                    {
                        c = 1;
                        this.mayor = this.Matriz[x][y];
                        this.Posiciones = x + "," + y + "\n";
                    }
                }
            }
        }
    }
    
    public String Mostrar()
    {
        return ("Mayor: "+this.mayor+"\n\n"
                + "Posiciones: \n"
                + this.Posiciones);
    }
}
