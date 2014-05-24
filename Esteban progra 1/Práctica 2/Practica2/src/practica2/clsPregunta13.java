/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author esteban
 */
public class clsPregunta13 
{
    private int hora;
    private int minuto;
    private int segundo;
    private int sentesima;
    public clsPregunta13()
    {
        JOptionPane.showMessageDialog(null,"Se mostrará en pantalla un reloj digital");
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
        this.sentesima=-1;
    }

    private void setHora(int i)
    {
        this.hora=i;
    }
    private void setMinuto(int i)
    {
        this.minuto=i;
    }
    private void setSegundo(int i)
    {
        this.segundo=i;
    }
    private void setSentesima(int i)
    {
        this.sentesima=i;
    }
    private int getHora()
    {
        return this.hora;
    }
    private int getMinuto()
    {
        return this.minuto;
    }
    private int getSegundo()
    {
        return this.segundo;
    }
    private int getSentesima()
    {
        return this.sentesima;
    }
    /*
    private void clscr()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.println();
        }
    }
    */
    public void Menu()
    {
        Timer reloj = new Timer(10,new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if (getSentesima()==99) 
                {
                    if (getSegundo()==59) 
                    {
                        if (getMinuto()==59) 
                        {
                            if (getHora()==59) 
                            {
                                setHora(0); setMinuto(0); setSegundo(0); setSentesima(0);
                                System.out.println(getHora()+":"+getMinuto()+":"+getSegundo()+";"+getSentesima());
                                //clscr();
                            } else 
                            {
                                setMinuto(0); setSegundo(0); setSentesima(0);
                                setHora(getHora()+1);
                                System.out.println(getHora()+":"+getMinuto()+":"+getSegundo()+";"+getSentesima());
                                //clscr();
                            }
                        } else 
                        {
                            setSegundo(0);setSentesima(0);
                            setMinuto(getMinuto()+1);
                            System.out.println(getHora()+":"+getMinuto()+":"+getSegundo()+";"+getSentesima());
                            //clscr();
                        }
                    } else 
                    {
                        setSentesima(0);
                        setSegundo(getSegundo()+1);
                        System.out.println(getHora()+":"+getMinuto()+":"+getSegundo()+";"+getSentesima());
                        //clscr();
                    }
                } else 
                {
                    setSentesima(getSentesima()+1);
                    System.out.println(getHora()+":"+getMinuto()+":"+getSegundo()+";"+getSentesima());
                    //clscr();
                }
            }
        });
        //clscr();
        reloj.start();
        char opcion;
        opcion=JOptionPane.showInputDialog("Si desea detener el reloj, presione cualquier caracter").charAt(0);
        if (opcion!=' ') 
        {
            reloj.stop();
        }
    }
}