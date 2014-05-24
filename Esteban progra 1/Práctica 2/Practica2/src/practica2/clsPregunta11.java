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
public class clsPregunta11 
{
    public clsPregunta11()
    {
        JOptionPane.showMessageDialog(null,"Se mostrará el cambio de 1 a 10 dólares en colones");
    }
    
    private String Cambio(int i)
    {
        if (i>10) 
        {
            return "";
        } else 
        {
            String Camb = i+" dólares = "+(i*560)+" colones\n"+Cambio(i+1);
            return Camb;
        }
    }
    
    public void Menu()
    {
        JOptionPane.showMessageDialog(null,Cambio(1));
    }
}