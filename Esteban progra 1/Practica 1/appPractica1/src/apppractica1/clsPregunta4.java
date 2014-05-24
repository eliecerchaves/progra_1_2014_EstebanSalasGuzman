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
public class clsPregunta4 
{
    private int A;
    private int B;
    private int C;
    private int D;

    public clsPregunta4() 
    {
        JOptionPane.showMessageDialog(null,"Se le solicitarÃ¡ cuatro nÃºmeros\n\n"
                + "Luego se le desplegarÃ¡ un menu");
        this.A=Integer.parseInt(JOptionPane.showInputDialog(null,1+"- Ingrese un nÃºmero: "));
        this.B=Integer.parseInt(JOptionPane.showInputDialog(null,2+"- Ingrese un nÃºmero: "));
        this.C=Integer.parseInt(JOptionPane.showInputDialog(null,3+"- Ingrese un nÃºmero: "));
        this.D=Integer.parseInt(JOptionPane.showInputDialog(null,4+"- Ingrese un nÃºmero: "));
    }
    
    private void Cambio()
    {
        int aux;
        aux=this.C;
        this.C=this.B;
        this.B=this.D;
        this.D=this.A;
        this.A=aux;
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"    MENU\n\n"
                + "1- Ver nÃºmeros\n"
                + "2- Cambiar nÃºmeros (de posiciÃ³n)\n"
                + "3- Modificar nÃºmeros\n"
                + "4- Salir\n\n"
                + "OpciÃ³n: "));
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null,"1- "+this.A
                        +"\n2- "+this.B
                        +"\n3- "+this.C
                        +"\n4- "+this.D);
                Menu(); break;
            }
            case 2:
            {
                Cambio();
                JOptionPane.showMessageDialog(null, "Cambio realizado");
                Menu(); break;
            }
            case 3:
            {
                this.A=Integer.parseInt(JOptionPane.showInputDialog(null,1+"- Ingrese un nÃºmero: "));
                this.B=Integer.parseInt(JOptionPane.showInputDialog(null,2+"- Ingrese un nÃºmero: "));
                this.C=Integer.parseInt(JOptionPane.showInputDialog(null,3+"- Ingrese un nÃºmero: "));
                this.D=Integer.parseInt(JOptionPane.showInputDialog(null,4+"- Ingrese un nÃºmero: "));
                Menu(); break;
            }
        }
    }
}
