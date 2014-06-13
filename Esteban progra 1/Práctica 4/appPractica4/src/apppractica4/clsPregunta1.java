/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica4;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta1 
{
    private String cadena;
    
    public clsPregunta1()
    {
        this.cadena=JOptionPane.showInputDialog(null,"Ingrese una cadena de caracteres (o frase): ");
    }
    
    private String Generar(int op,int cont,int cont2,String cade,boolean aux)
    {
        switch(op)
        {
            case 1:
            {
                if (cont<0) 
                {
                    return "";
                } else 
                {
                    String cad = this.cadena.charAt(cont)+Generar(op, cont-1, cont2, cade, aux);
                    return cad;
                }
            }
            case 2:
            {
                for (int j = 0; j < (this.cadena.length()/2); j++) 
                {
                    if (this.cadena.charAt(j)!=this.cadena.charAt(this.cadena.length()-1-j)) 
                    {
                        aux=false; break;
                    }
                }
                if (aux==true) 
                {
                    return this.cadena+" ya es palíndromo";
                } else 
                {
                    if (cont<1) 
                    {
                        return "";
                    } else 
                    {
                        String cad=this.cadena.charAt(cont-1)+Generar(op, cont-1,0,"",aux);
                        return this.cadena+cad;
                    }
                }
            }
            case 3:
            {
                if (aux==true) 
                {
                    if (cont2>(this.cadena.length()-1))
                    {
                        return "";
                    } else 
                    {
                        if (cont2==cont || cont2==(cont2+cade.length()-1)) 
                        {
                            String cad ="'"+Generar(op, cont, cont2+1, cade, aux);
                            return cad;
                        } else 
                        {
                            String cad=this.cadena.charAt(cont2)+Generar(op,cont,cont2,cade,aux);
                            return cad;
                        }
                    }
                }
                if (this.cadena.length()-1<(cont+cade.length()-1)) 
                {
                    return cade+" no se encuentra en "+this.cadena;
                } else 
                {
                    for (int j = 0; j < (cade.length()-1); j++) 
                    {     
                        if (this.cadena.charAt(cont+j)!=cade.charAt(j))
                        {
                            Generar(op,cont+1,0,cade,aux);
                        }
                    }
                    Generar(op,cont,0,cade,true);
                }
            }
            case 4:
            {
                if (this.cadena.length()-1<(cont+cade.length()-1)) 
                {
                    return cade+" no se encuentra en "+this.cadena;
                } else 
                {
                    for (int j = 0; j < (cade.length()-1); j++) 
                    {     
                        if (this.cadena.charAt(cont+j)!=cade.charAt(j))
                        {
                            Generar(op,cont+1,0,cade,aux);
                        }
                    }
                    Generar(op,cont+cade.length(),cont2+1,cade,true);
                }
                return cont2+"";
            }
        }
        return "";
    }
    
    public void Menu()
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                + "1 - Invertir caracteres\n"
                + "2 - Verificar o crear palíndromo\n"
                + "3 - Buscar una parte de caracteres\n"
                + "4 - Buscar la cantidad de veces que\n"
                + "    sale un conjunto de caracteres\n"
                + "5 - Cambiar cadena de caracteres\n"
                + "6 - Salir\n\n"
                + "Opción: "));
        switch(opcion)
        {
            case 1: case 2: {
                JOptionPane.showMessageDialog(null, "Cadena original: "+this.cadena+"\n\n"
                        + "Resultado: "+Generar(opcion,this.cadena.length()-1,0,"",true));
                Menu(); break;}
            case 3: 
            {
                String cade;
                do
                {
                    cade=JOptionPane.showInputDialog(null,"Escriba la parte de la cadena que quiere buscar: ");
                }while(cade.length()>this.cadena.length());
                JOptionPane.showMessageDialog(null, "Cadena original: "+this.cadena+"\n\n"
                        + "Parte buscada: "+cade+"\n\n"
                        + "Resultado: "+Generar(opcion,0,0,cade,false));
                Menu(); break;
            }
            case 4: 
            {
                String cade;
                do
                {
                    cade=JOptionPane.showInputDialog(null,"Escriba la parte de la cadena que quiere buscar: ");
                }while(cade.length()>this.cadena.length());
                JOptionPane.showMessageDialog(null, "Cadena original: "+this.cadena+"\n\n"
                        + "Parte buscada: "+cade+"\n\n"
                        + "Resultado: "+Generar(opcion,0,0,"",false)+" veces");
                Menu(); break;
            }
            case 5:{this.cadena=JOptionPane.showInputDialog(null,"Ingrese una cadena de caracteres (o frase): ");}
        }
    }
}
