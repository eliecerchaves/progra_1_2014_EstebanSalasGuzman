/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author profe
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        /*
        int N;
        double A;
        char C;
        
        N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
        C=JOptionPane.showInputDialog(null,"Ingrese un caracter del teclado ").charAt(0);
        
        int opcion;
        
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                    + "1- Ver suma\n"
                    + "2- Ver diferencia ( resta)\n"
                    + "3- Ver valor dec. del caracter\n"
                    + "4- Cambiar números\n"
                    + "5- Cambiar caracter\n"
                    + "6- Salir\n\n"
                    + "Opcion: "));
            switch(opcion)
            {
                case 1:
                {
                    JOptionPane.showMessageDialog(null, "La suma de "+N+" y "+A+" es: "+(N+A));
                    break;
                }
                case 2:
                {
                    JOptionPane.showMessageDialog(null, "La diferencia entre "+N+" y "+A+" es: "+(N-A));
                    break;
                }
                case 3:
                {
                    JOptionPane.showMessageDialog(null,"El valor decimal de "+C+" es: "+(int)C);
                    break;
                }
                case 4:
                {
                    N=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
                    A=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
                    break;
                }
                case 5:
                {
                    C=JOptionPane.showInputDialog(null,"Ingrese un caracter del teclado ").charAt(0);
                    break;
                }
            }
        }while(opcion>0 && opcion<6);
        */
        int opcion;
        int X,Y;
        double N2,M;
    
        X=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
            + "Ingrese un número: "));
        Y=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
            + "Ingrese otro número: "));
        N2=Double.parseDouble(JOptionPane.showInputDialog(null,"   Grupo B\n\n"
            + "Ingrese un número: "));
        M=Double.parseDouble(JOptionPane.showInputDialog(null,"   Grupo B\n\n"
            + "Ingrese otro número: "));
        
        int opcion2;
        
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                    + "1- Ver grupo A\n"
                    + "2- Ver grupo B\n"
                    + "3- Salir\n\n"
                    + "Opcion: "));
            switch(opcion)
            {
                case 1:
                {
                    do
                    {
                        opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"     MENU A\n\n"
                            + "1- Ver suma\n"
                            + "2- Ver resta\n"
                            + "3- Ver multiplicación\n"
                            + "4- Ver división\n"
                            + "5- Cambiar números\n"
                            + "6- Salir\n\n"
                            + "Opcion: "));
                        switch(opcion2)
                        {
                        case 1:
                        {
                            JOptionPane.showMessageDialog(null,"La suma de "+X+" y "+Y+" es: "+(X+Y));
                            break;
                        }
                        case 2:
                        {
                            JOptionPane.showMessageDialog(null,"La resta de "+X+" y "+Y+" es: "+(X-Y));
                            break;
                        }
                        case 3:
                        {
                            JOptionPane.showMessageDialog(null,"La multiplicación de "+X+" y "+Y+" es: "+(X*Y));
                            break;
                        }
                        case 4:
                        {
                            JOptionPane.showMessageDialog(null,"La división de "+X+" y "+Y+" es: "+(X/Y));
                            break;
                        }
                        case 5:
                        {
                            X=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
                                    + "Ingrese un número: "));
                            Y=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
                                    + "Ingrese otro número: "));
                            break;
                        }
                        }
                    }while(opcion2>0 && opcion2<6);
                    break;
                }
                case 2:
                {
                    do
                    {
                        opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"     MENU A\n\n"
                            + "1- Ver suma\n"
                            + "2- Ver resta\n"
                            + "3- Ver multiplicación\n"
                            + "4- Ver división\n"
                            + "5- Cambiar números\n"
                            + "6- Salir\n\n"
                            + "Opcion: "));
                        switch(opcion2)
                        {
                        case 1:
                        {
                            JOptionPane.showMessageDialog(null,"La suma de "+N2+" y "+M+" es: "+(N2+M));
                            break;
                        }
                        case 2:
                        {
                            JOptionPane.showMessageDialog(null,"La resta de "+N2+" y "+M+" es: "+(N2-M));
                            break;
                        }
                        case 3:
                        {
                            JOptionPane.showMessageDialog(null,"La multiplicación de "+N2+" y "+M+" es: "+(N2*M));
                            break;
                        }
                        case 4:
                        {
                            JOptionPane.showMessageDialog(null,"La división de "+N2+" y "+M+" es: "+(N2/M));
                            break;
                        }
                        case 5:
                        {
                            X=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
                                    + "Ingrese un número: "));
                            Y=Integer.parseInt(JOptionPane.showInputDialog(null,"   Grupo A\n\n"
                                    + "Ingrese otro número: "));
                            break;
                        }
                        }
                    }while(opcion2>0 && opcion2<6);
                    break;
                }
            }
        }while(opcion>0 && opcion<3);
        
    }
}
