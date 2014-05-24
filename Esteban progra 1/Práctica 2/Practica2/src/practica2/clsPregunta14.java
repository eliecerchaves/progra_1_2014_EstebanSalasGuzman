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
public class clsPregunta14 
{
    public clsPregunta14()
    {
        JOptionPane.showMessageDialog(null,"Se invierte $1000 con 2% interés mensual");
    }
    
    private String Inversion(int i, float inv)
    {
        if (i>11)
        {
            return "Final   $"+inv;
        } else
        {
            String Camb = i+"        $"+inv+"       2%       $"+(float)((inv*0.02)+inv)+"\n"+Inversion(i+1,(float)(inv*0.02)+inv);
            return Camb;
        }
    }
    
    public void Menu()
    {
        JOptionPane.showMessageDialog(null,"Mes  Inicial      Interés    Final\n"+Inversion(0,1000));
    }
}