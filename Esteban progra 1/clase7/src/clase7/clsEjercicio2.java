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
public class clsEjercicio2 
{
    private String Palabra;
    
    public clsEjercicio2()
    {
        JOptionPane.showMessageDialog(null,"Deberá ingresar una cadena de caracteres");
        this.Palabra=JOptionPane.showInputDialog(null, "Cadena: ");
    }
    
    private String Cadena(int i, int x)
    {
        switch(i)
        {
            case 1:
            {
                if (x>(this.Palabra.length()/2)-1) 
                {
                    return "";
                } else 
                {
                    String cad = this.Palabra.charAt(x)+Cadena(i,x+1);
                    return cad;
                }
            }
            case 2:
            {
                return this.Palabra.charAt(this.Palabra.length()-1)+"";
            }
            case 3:
            {
                if (x<0) 
                {
                    return "";
                } else 
                {
                    String cad = this.Palabra.charAt(x)+Cadena(i,x-1);
                    return cad;
                }
            } 
            case 4:
            {
                if (x>(this.Palabra.length())-2)
                {
                    return this.Palabra.charAt(x)+"";
                } else 
                {
                    String cad = this.Palabra.charAt(x)+"-"+Cadena(i,x+1);
                    return cad;
                }
            }
            case 6:
            {
                for (int j = 0; j < (this.Palabra.length()/2); j++) 
                {
                    if (this.Palabra.charAt(j)!=this.Palabra.charAt(this.Palabra.length()-1-j)) 
                    {
                        return "No es Palíndroma";
                    }
                }
                return "Es Palíndroma";
            }
        }
        return "";
    }
    private int CantVocales()
    {
        int cant=0;
        for (int x = 0; x < this.Palabra.length(); x++)
        {
            if (this.Palabra.charAt(x)=='a' ||
                this.Palabra.charAt(x)=='e' ||
                this.Palabra.charAt(x)=='i' ||
                this.Palabra.charAt(x)=='o' ||
                this.Palabra.charAt(x)=='u' || 
                this.Palabra.charAt(x)=='A' ||
                this.Palabra.charAt(x)=='E' ||
                this.Palabra.charAt(x)=='I' ||
                this.Palabra.charAt(x)=='O' ||
                this.Palabra.charAt(x)=='U')
            {
                cant = cant+1;
            }
        }
        return cant;
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"         MENU\n\n"
                + "1 - Mostrar la primer mitad\n"
                + "2 - Mostrar el último caracter\n"
                + "3 - Mostrar al reves\n"
                + "4 - Agregar un guión bajo entre cada caracter\n"
                + "5 - Cantidad de vocales de la cadena\n"
                + "6 - Es palíndroma¿¿\n"
                + "7 - Cambiar cadena\n"
                + "8 - Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1: case 2: case 4: case 6:
                {JOptionPane.showMessageDialog(null,"Cadena inicial: "+this.Palabra+"\n\n"+Cadena(opcion,0));Menu();break;}
            case 3:
                {JOptionPane.showMessageDialog(null,"Cadena inicial: "+this.Palabra+"\n\n"+Cadena(opcion,this.Palabra.length()-1));Menu();break;}
            case 5:
                {JOptionPane.showMessageDialog(null,"Cadena inicial: "+this.Palabra+"\n\n"+"Contiene "+CantVocales()+" vocales");Menu();break;}
            case 7:
                {this.Palabra=JOptionPane.showInputDialog(null, "Cadena: ");Menu();break;}
        }
    }
}
