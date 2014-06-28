/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPreguntas 
{
    private int opcion;
    
    public void Menu()
    {
        this.opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione un ejercicio\n\n"
                + "1 - 2 - 3 - 4"));
        switch (this.opcion)
        {
            case 1: {
                clsEjercicio1 A = new clsEjercicio1();
                A.Ingresar();
                JOptionPane.showMessageDialog(null, A.Mostrar(0, 0));
                Menu();break;}
            case 2: {
                clsEjercicio2 A = new clsEjercicio2();
                A.Ingresar();
                A.Intercambiar();
                JOptionPane.showMessageDialog(null, A.Mostrar(0, 0));
                Menu();break;}
            case 3: {
                clsEjercicio3 A  = new clsEjercicio3();
                A.Ingresar();
                JOptionPane.showMessageDialog(null, A.Mostrar(0, 0));
                Menu();break;}
            case 4: {
                clsEjercicio4 A = new clsEjercicio4();
                A.Ingresar();
                A.Mayor();
                JOptionPane.showMessageDialog(null,A.Mostrar());
                Menu();break;}
        }
    }
    
}
