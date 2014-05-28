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
    
    private float Inversion(float inv)
    {
        if (inv>1500)
        {
            return 0;
        } else
        {
            float meses = 1+Inversion((float)(inv*0.02)+inv);
            return meses;
        }
    }
    
    public void Menu()
    {
        JOptionPane.showMessageDialog(null,"Después de "+Inversion(1000)+" meses se obtiene más de $1500");
    }
}