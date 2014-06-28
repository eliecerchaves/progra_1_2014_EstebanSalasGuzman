/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appprimerexamenprogra1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsEnunciado2 
{
    private String [] Palabras;
    public String PalabraBuscar;
    public int cant;
    
    public clsEnunciado2()
    {
        this.PalabraBuscar = "";
        this.cant = 0;
    }
    
    public void IngresarPalabras()
    {
        int c;
        do
        {
            c = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuántas palabras quiere ingresar¿¿"));
        }while(c<1);
        
        this.Palabras = new String [c];
        
        for (int i = 0; i < c; i++) 
        {
            this.Palabras[i] = JOptionPane.showInputDialog(null,"Ingrese una palabra para la lista: ");
        }
    }
    
    public void IngresarPalabraBuscar()
    {
        this.PalabraBuscar = JOptionPane.showInputDialog(null,"Ingrese una palabra para buscar combinaciones: ");
    }
    
    public void ContarPalabras()
    {
        for (int i = 0; i < this.Palabras.length; i++) 
        {
            for (int j = 0; j < this.Palabras[i].length(); j++) 
            {
                boolean verif = false;
                int c = 0;
                while(c<this.PalabraBuscar.length())
                {
                    if (this.Palabras[i].charAt(j)==this.PalabraBuscar.charAt(c)) 
                    {
                        verif = true;
                        break;
                    }
                    c++;
                }
                if (verif==true) 
                {
                    this.cant++;
                    break;
                }else
                {
                    break;
                }
            }
        }
    }
}
