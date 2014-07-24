/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticastring;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsEjercicios 
{
    private int opcion;
    private String frase;

    public clsEjercicios() {
    }
    
    public void Menu()
    {
        this.opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un ejercicio\n\n"
                + "1 - 2 - 3 - 4"));
        switch(this.opcion)
        {
            case 1:
            {
                Ejercicio1();
                Menu(); break;
            }
            case 2:
            {
                Ejercicio2();
                Menu(); break;
            }
            case 3:
            {
                Ejercicio3();
                Menu(); break;
            }
            case 4:
            {
                Ejercicio4();
                Menu(); break;
            }
        }
    }
    
    private void Ejercicio1()
    {
        do
        {
            this.frase = JOptionPane.showInputDialog("Ingrese una palabra");
        }while("".equals(this.frase));
        JOptionPane.showMessageDialog(null, "Usted ingresó: "+this.frase+"\nEl inverso es: "+Inverso(this.frase.length()));
    }
    private String Inverso(int i)
    {
        if (i > 0) 
        {
            String inv = this.frase.charAt(i-1) + Inverso(i-1);
            return inv;
        } else 
        {
            return "";
        }
    }
    
    private void Ejercicio2()
    {
        do
        {
            this.frase = JOptionPane.showInputDialog("Ingrese una palabra");
        }while("".equals(this.frase));
        if (VerificaPalindromo()==true) 
        {
            JOptionPane.showMessageDialog(null, "Usted ingresó: "+this.frase+"\nEl palíndromo es: "+this.frase);
        } else 
        {
            JOptionPane.showMessageDialog(null, "Usted ingresó: "+this.frase+"\nEl palíndromo es: "+this.frase+Palindromo(this.frase.length()-1));
        }
        
    }
    private boolean VerificaPalindromo()
    {
        for (int i = 0; i < (this.frase.length()/2); i++) 
        {
            if (this.frase.charAt(i) != this.frase.charAt(this.frase.length()-i-1)) 
            {
                return false;
            }
        }
        return true;
    }
    private String Palindromo(int i)
    {
        if (this.frase.length()==1) 
        {
            return this.frase;
        }
        if (i > (0)) 
        {
            String pal = this.frase.charAt(i-1) + Palindromo(i-1);
            return pal;
        } else 
        {
            return "";
        }
    }
    
    
    private void Ejercicio3()
    {
        do
        {
            this.frase = JOptionPane.showInputDialog("Ingrese una frase (15 caracteres mínimo)");
        }while(this.frase.length() < 15);
        String palabra = "";
        do
        {
            palabra = JOptionPane.showInputDialog("Ingrese una palabra a buscar en la frase\n"
                    + "<<"+this.frase+">>");
        }while("".equals(palabra));
        JOptionPane.showMessageDialog(null, "Usted ingresó la frase: "+this.frase+"\n"
                + "Palabra a buscar: "+palabra+"\n"
                + "Frase final: "+FraseFinal(0, palabra));
    }
    private boolean PalabraEncontrada(String palabra, int pos)
    {
        for (int i = 0; i < palabra.length(); i++) 
        {
            if ((pos+palabra.length()-1) > this.frase.length())
            {
                return false;
            }else
            {
                if (this.frase.charAt(pos+i) != palabra.charAt(i)) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    private String FraseFinal(int i, String palabra)
    {
        if (i < this.frase.length()) 
        {
            if (PalabraEncontrada(palabra, i) == true) 
            {
                String frasefinal = "-" + palabra + FraseFinal(i+palabra.length(), palabra);
                return frasefinal;
            } else 
            {
                String frasefinal = this.frase.charAt(i) + FraseFinal(i+1, palabra);
                return frasefinal;
            }
        } else 
        {
            return "";
        }
    }
    
    private void Ejercicio4()
    {
        do
        {
            this.frase = JOptionPane.showInputDialog("Ingrese una frase (15 caracteres mínimo)");
        }while(this.frase.length() < 15);
        String palabra = "";
        do
        {
            palabra = JOptionPane.showInputDialog("Ingrese una palabra a buscar en la frase\n"
                    + "<<"+this.frase+">>");
        }while("".equals(palabra));
        JOptionPane.showMessageDialog(null, "Usted ingresó la frase: "+this.frase+"\n"
                + "Palabra a buscar: "+palabra+"\n"
                + "Palabra encontrada: " + Cantidad(0, palabra) + " veces");
    }
    private int Cantidad(int i, String palabra)
    {
        if (i < this.frase.length()) 
        {
            if (PalabraEncontrada(palabra, i) == true) 
            {
                int c = 1 + Cantidad(i+palabra.length(), palabra);
                return c;
            } else 
            {
                int c = 0 + Cantidad(i+1, palabra);
                return c;
            }
        } else 
        {
            return 0;
        }
    }
}
