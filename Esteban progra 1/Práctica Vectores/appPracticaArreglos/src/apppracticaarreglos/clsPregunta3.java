/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticaarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta3 
{
    private int [] A;
    private int [] B;
    private int op;
    private int mayor;
    
    public clsPregunta3()
    {
        JOptionPane.showMessageDialog(null,"A continuación deberá ingresar las notas del primer parcial\n"
                + "de 2 materias. Cada una tiene 5 estudiantes.");
        do
        {
            this.A = new int [5];
            this.B = new int [5];
            Ingresar();
            JOptionPane.showMessageDialog(null, "Grupo A\n"+Mostrar(0, 1)+"\nGrupo B\n"+Mostrar(0, 2));
            this.op = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"Si desea ingresar nuevamente los 2 grupos de números\n"
                    + "digite 1, sino digite cualquier otro número:"));
        }while(this.op==1);
    }
    
    private void Ingresar()
    {
        for (int i = 0; i < 5; i++) 
        {
            this.A[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Grupo A\n\n"
                    + "Estudiante "+(i+1)+" - Ingrese su nota: "));
        }
        for (int i = 0; i < 5; i++) 
        {
            this.B[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Grupo B\n\n"
                    + "Estudiante "+(i+1)+" - Ingrese su nota: "));
        }
    }
    
    private String Mostrar(int i,int g)
    {
        switch(g)
        {
            case 1:
            {
                if (i>4) 
                {
                    int mayor2 = this.A[0];
                    for (int j = 1; j < 5; j++) 
                    {
                        if (this.A[j]>mayor2) 
                        {
                            mayor2 = this.A[j];
                        }
                    }
                    this.mayor = mayor2;
                    return "\n";
                } else 
                {
                    String muestra = "Estudiante "+(i+1)+" - Nota "+this.A[i]+"\n"+Mostrar(i+1, g);
                    return muestra;
                }
            }
            case 2:
            {
                if (i>4) 
                {
                    int mayor2 = this.B[0];
                    for (int j = 1; j < 5; j++) 
                    {
                        if (this.B[j]>mayor2) 
                        {
                            mayor2 = this.B[j];
                        }
                    }
                    if (this.mayor>mayor2) 
                    {
                        return "\nNota Mayor: "+this.mayor+" - Grupo A";
                    } else 
                    {
                        if (this.mayor==mayor2) 
                        {
                            return "\nNota Mayor: "+mayor2+" - Grupo A y B";
                        } else 
                        {
                            return "\nNota Mayor: "+mayor2+" - Grupo B";
                        }
                    }
                } else 
                {
                    String muestra = "Estudiante "+(i+1)+" - Nota "+this.B[i]+"\n"+Mostrar(i+1, g);
                    return muestra;
                }
            }
        }
        return "";
    }
}
