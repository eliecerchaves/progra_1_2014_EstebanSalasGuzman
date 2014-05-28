/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta4 
{
    private int mes;
    private int año;
    
    public clsPregunta4()
    {
        JOptionPane.showMessageDialog(null,"Se le solicitará 2 números\n"
                + "Luego se le mostrará un menú");
        do
        {
            this.año=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año: (1900 - 3000)"));
        }while(this.año<1900 || this.año>3000);
        do
        {
            this.mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el mes: (1 - 12)"));
        }while(this.mes<1 || this.mes>12);
    }
    
    private boolean Bisiesto(int i)
    {
        if (this.año<2012) 
        {
            if (this.año==i) 
            {
                return true;
            } else 
            {
                if (i<this.año) 
                {
                    return false;
                } else 
                {
                    Bisiesto(i-4);
                }
            }
        } 
        if (this.año>=2012)
        {
            if (this.año==i) 
            {
                return true;
            } else 
            {
                if (i>this.año) 
                {
                    return false;
                } else 
                {
                    Bisiesto(i+4);
                }
            }
        }
        return true;
    }
    private int Mes()
    {
        if (this.mes==2 && Bisiesto(2012)==true)
        {
            return 29;
        } else 
        {
            switch(this.mes)
            {
                case 2: return 28;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
                case 4: case 6: case 9: case 11: return 30;
            }
        }
        return 0;
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                + "1 - Ver cantidad de días del mes\n"
                + "2 - Cambiar mes\n"
                + "3 - Cambiar año\n"
                + "4 - Salir\n\n"
                + "Opcion: "));
        
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "Año: "+this.año+"\nMes: "+this.mes+" ==> "+Mes()+" días");
                Menu(); break;
            }
            case 2:
            {
                do
                {
                    this.mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el mes: (1 - 12)"));
                }while(this.mes<1 || this.mes>12);
                Menu(); break;
            }
            case 3:
            {
                do
                {
                    this.año=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año: (1900 - 3000)"));
                }while(this.año<1900 || this.año>3000);
                Menu(); break;
            }
        }
    }
}
