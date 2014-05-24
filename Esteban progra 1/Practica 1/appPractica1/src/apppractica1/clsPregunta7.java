/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta7 
{
    private int C;

    public clsPregunta7() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitarÃ¡ un nÃºmero\n\n"
                + "Luego se le desplegarÃ¡ un menu");
        this.C=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
    }
    
    private String TipoPosNeg()
    {
        if (this.C<0) 
        {
            return "negativo";
        } else 
        {
            return "positivo";
        }
    }
    private String TipoParImpar()
    {
        if ((this.C%2)==0)
        {
            return "par";
        } else 
        {
            return "impar";
        }
    }
    private String Multiplo5()
    {
        if ((this.C%5)==0)
        {
            return "Es";
        } else 
        {
            return "No es";
        }
    }
    private String Multiplo10()
    {
        if ((this.C%10)==0)
        {
            return "Es";
        } else 
        {
            return "No es";
        }
    }
    private String MayorMenor()
    {
        if (this.C==100) 
        {
            return "igual";
        } else 
        {
            if (this.C>100) 
            {
                return "mayor";
            } else 
            {
                return "menor";
            }
        }
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU\n\n"
                + "1- Ver caracterÃ­sticas\n"
                + "2- Cambiar nÃºmero\n"
                + "3- Salir\n\n"
                + "OpciÃ³n: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "NÃºmero: "+this.C+"\n\n"
                        + "Es "+TipoPosNeg()+"\n"
                        + "Es "+TipoParImpar()+"\n"
                        + Multiplo5()+" mÃºltiplo de 5\n"
                        + Multiplo10()+" mÃºltiplo de 10\n"
                        + "Es "+MayorMenor()+" que 100");
                Menu(); break;
            }
            case 2:
            {
                this.C=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un nÃºmero: "));
                Menu(); break;
            }
        }
    }
}
