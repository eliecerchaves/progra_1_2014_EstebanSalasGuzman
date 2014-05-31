/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsEjercicio1 
{
    private String email;
    private boolean hayArroba;
    
    public clsEjercicio1()
    {
        this.hayArroba=false;
        this.email=JOptionPane.showInputDialog(null, "Ingrese su correo: ");
        JOptionPane.showMessageDialog(null, ValidarCorreo());
    }
    
    public String ValidarCorreo()
    {
        for (int i = 0; i < this.email.length(); i++) 
        {
            if (this.email.charAt(i)=='@') 
            {
                this.hayArroba=true;
                break;
            }
        }
        if (this.hayArroba==true) 
        {
            return "El correo tiene @";
        } else 
        {
            return "El correo NO tiene @";
        }
    }
}
