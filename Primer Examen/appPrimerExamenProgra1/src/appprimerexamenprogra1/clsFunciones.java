/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appprimerexamenprogra1;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsFunciones 
{
    private int opcion;

    public clsFunciones() 
    {
        this.opcion = 0;
    }
    
    public void Menu()
    {
        this.opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"               MENU\n\n"
                + "Seleccione el enunciado al que quiere ingresar\n"
                + "(Si selecciona otro número saldrá del programa)\n\n"
                + "1 - Enunciado 1\n"
                + "2 - Enunciado 2\n"));
        switch(this.opcion)
        {
            case 1:
            {
                clsEnunciado1 E1 = new clsEnunciado1();
                String Palabra = JOptionPane.showInputDialog(null,"Ingrese una palabra ");
                E1.VerificarPalabra(Palabra.toUpperCase());
                if (E1.getVerificador()==false) 
                {
                    JOptionPane.showMessageDialog(null, "Error al ingresar la palabra");
                } else 
                {
                    JOptionPane.showMessageDialog(null, E1.getTraductor());
                }
                Menu(); break;
            }
            case 2:
            {
                clsEnunciado2 E2 = new clsEnunciado2();
                E2.IngresarPalabras();
                E2.IngresarPalabraBuscar();
                JOptionPane.showMessageDialog(null,"Existen " + E2.cant + " combinaciones posibles");
                Menu(); break;
            }
            default:
                JOptionPane.showMessageDialog(null, "GRACIAS... Que tenga un buen día");
        }
    }
}
