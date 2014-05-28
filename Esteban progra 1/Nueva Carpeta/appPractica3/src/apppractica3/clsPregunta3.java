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
public class clsPregunta3 
{
    private char N;
    private int N2;
    
    public clsPregunta3()
    {
        this.N='A'; this.N2=(int)this.N;
        JOptionPane.showMessageDialog(null, this.N+" = "+this.N2);
        this.N='a'; this.N2=(int)this.N;
        JOptionPane.showMessageDialog(null, this.N+" = "+this.N2);
        
        JOptionPane.showMessageDialog(null,"Se le solicitará una letra\n\n"
                + "Luego se le desplegará un menú");
        do
        {
            this.N=JOptionPane.showInputDialog(null,"Ingrese una calificación (a..e): ").charAt(0);
            this.N2=(int)this.N;
        }while((this.N2<65 || this.N2>69) || (this.N2<97 || this.N2>101));
        JOptionPane.showMessageDialog(null,"La calificación "+this.N+" es: "+Calif());
    }
    
    private String Calif()
    {
        switch(this.N2)
        {
            case 65: case 97: return "Excelente";
            case 66: case 98: return "Bueno";
            case 67: case 99: return "Regular";
            case 68: case 100: return "Malo";
            case 69: case 101: return "Pésimo";
        }
        return "";
    }
    
    public void Menu()
    {
        
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"      MENU\n\n"
                + "1- Cambiar calificación\n\n"
                + "2- Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                do
                {
                    this.N=JOptionPane.showInputDialog(null,"Ingrese una calificación (a..e): ").charAt(0);
                    this.N2=(int)this.N;
                }while(this.N2<65 || this.N2>69);
                JOptionPane.showMessageDialog(null,"La calificación "+this.N+" es: "+Calif());
                Menu(); break;
            }
        }
    }
}
