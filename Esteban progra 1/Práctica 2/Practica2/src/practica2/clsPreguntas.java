/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPreguntas 
{
    private int pregunta;
    private boolean reloj;
    clsPregunta13 B;
    
    public clsPreguntas()
    {
        this.pregunta=0;
        this.reloj=false;
        this.B = new clsPregunta13();
    }
    
    public void Menu()
    {
        if (reloj==true) 
        {
            this.pregunta=Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione un ejercicio: \n\n"
                + "1 - 2 - 3 - 4 - 5 - 6 - 7 - 8\n"
                + "9 - 10 - 11 - 12 - 13 - 14 - 15\n\n"
                + "20 - Pausar reloj\n"
                + "21 - Continuar reloj\n"
                + "22 - Reiniciar reloj\n"
                + "23 - Finalizar reloj\n\n"
                + "!= # - Salir\n\n"
                + "Opción: "));
        } else 
        {
            this.pregunta=Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione un ejercicio: \n\n"
                + "1 - 2 - 3 - 4 - 5 - 6 - 7 - 8\n"
                + "9 - 10 - 11 - 12 - 13 - 14 - 15\n\n"
                + "!= # - Salir\n\n"
                + "Opción: "));
        }
        
        if (this.reloj==true) 
        {
            switch(this.pregunta)
            {
                case 20:
                {
                    this.B.reloj.stop();
                    Menu();
                    break;
                }
                case 21:
                {
                    this.B.reloj.restart();
                    Menu();
                    break;
                }
                case 22:
                {
                    this.B.reloj.stop();
                    this.B=new clsPregunta13();
                    this.B.Menu();
                    this.B.reloj.start();
                    Menu();
                    break;
                }
                case 23:
                {
                    this.B.reloj.stop();
                    this.reloj=false;
                    Menu();
                    break;
                }
            }
        }
        
        switch(this.pregunta)
        {
            case 1:
            {
                clsPregunta1 A = new clsPregunta1();
                A.Menu();
                Menu();
                break;
            } 
            case 2:
            {
                clsPregunta2 A = new clsPregunta2();
                A.Menu();
                Menu();
                break;
            }
            case 3:
            {
                clsPregunta3 A = new clsPregunta3();
                A.Menu();
                Menu();
                break;
            }
            case 4:
            {
                clsPregunta4 A = new clsPregunta4();
                A.Menu();
                Menu();
                break;
            }
            case 5:
            {
                clsPregunta5 A = new clsPregunta5();
                A.Menu();
                Menu();
                break;
            }
            case 6:
            {
                clsPregunta6 A = new clsPregunta6();
                A.Menu();
                Menu();
                break;
            } 
            case 7:
            {
                clsPregunta7 A = new clsPregunta7();
                A.Menu();
                Menu();
                break;
            }
            case 8:
            {
                clsPregunta8 A = new clsPregunta8();
                A.Menu();
                Menu();
                break;
            } 
            case 9:
            {
                clsPregunta9 A = new clsPregunta9();
                A.Menu();
                Menu();
                break;
            } 
            case 10:
            {
                clsPregunta10 A = new clsPregunta10();
                A.Menu();
                Menu();
                break;
            } 
            case 11:
            {
                clsPregunta11 A = new clsPregunta11();
                A.Menu();
                Menu();
                break;
            } 
            case 12:
            {
                clsPregunta12 A = new clsPregunta12();
                A.Menu();
                Menu();
                break;
            } 
            case 13:
            {
                JOptionPane.showMessageDialog(null,"Se mostrará en pantalla un reloj digital");
                this.B.Menu();
                this.B.reloj.start();
                this.reloj=true;
                Menu();
                break;
            } 
            case 14:
            {
                clsPregunta14 A = new clsPregunta14();
                A.Menu();
                Menu();
                break;
            } 
            case 15:
            {
                clsPregunta15 A = new clsPregunta15();
                A.Menu();
                Menu();
                break;
            }
        }
    }
}
