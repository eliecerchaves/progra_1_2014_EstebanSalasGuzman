/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

import java.util.Calendar;
import javax.swing.JOptionPane;


/**
 *
 * @author esteban
 */
public class clsPregunta8 
{
    private int año;
    private int mes;
    private int dia;
    Calendar c1 = Calendar.getInstance();
    
    public clsPregunta8()
    {
        this.año=c1.get(Calendar.YEAR);
        this.mes=c1.get(Calendar.MONTH)+1;
        this.dia=1;
        JOptionPane.showMessageDialog(null, "El primero de este mes ( "+this.dia+"/"+this.mes+"/"+this.año+" ) fue "+QueDia());
        this.dia=c1.get(Calendar.DATE);
        JOptionPane.showMessageDialog(null, "Hoy ( "+this.dia+"/"+this.mes+"/"+this.año+" ) es "+QueDia());
    }
    
    private boolean Bisiesto() //DETERMINA SI UN AÑO ES BISIESTO O NO
    {
        if ((this.año%4)==0) 
        {
            return true;
        } else 
        {
            return false;
        }
    }
    
    private int DiasDelMes(int mes) //DEVUELVE LA CANT DE DIAS DE UN MES
                                            // CON BASE EN LA FUNCION "Bisiesto"
    {
        if (mes==2 && Bisiesto()==true) //SI EL MES INGRESADO ES 2 (FEBRERO)
        {                                       //Y SI EL AÑO INGRESADO ES BISIESTO (LLAMA A DICHA FUNCION)
            return 29;
        } else //SINO ES NI FEBRERO O EL AÑO NO ES BISIESTO
        {
            switch(mes) //DEVUELVE LOS DIAS DE CADA MES
            {
                case 2: return 28;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
                case 4: case 6: case 9: case 11: return 30;
            }
        }
        return 0; //ESTE RETURN NUNCA SE VA A OCUPAR, PERO EL PROGRAMA LO PEDÍA
    }
    private String QueDia()                                                        
    {
        int day=0;
            if (this.año<2012) 
            {
                day=6;
                for (int i = 1; i <= (2011-this.año); i++) 
                {
                    if (((2011-i+1)%4)==0) 
                    {
                        day=day-2;
                        if (day==0) {day=7;}
                        if (day<0) {day=6;}
                    } else 
                    {
                        day=day-1;
                        if (day<1) {day=7;}
                    }
                } //al final llega al 31/12/año ingresado
                int cantdias=0;
                for (int i = 12; i > this.mes; i--) 
                {
                    cantdias=cantdias+DiasDelMes(i);
                }
                cantdias=cantdias+DiasDelMes(this.mes)-this.dia+1;
                for (int i = 1; i < cantdias; i++) 
                {
                    day=day-1;
                    if (day<1) {day=7;}
                }
            } else 
            {
                day=7;
                for (int i = 1; i <= (this.año-2012); i++) 
                {
                    if (((2011+i-1)%4)==0) 
                    {
                        day=day+2;
                        if (day==8) {day=1;}
                        if (day>8) {day=2;}
                    } else 
                    {
                        day=day+1;
                        if (day>7) {day=1;}
                    }
                } //al final llega al 31/12/año ingresado
                int cantdias=0;
                for (int i = 1; i < this.mes; i++) 
                {
                    cantdias=cantdias+DiasDelMes(i);
                }
                cantdias=cantdias+this.dia;
                for (int i = 1; i < cantdias; i++) 
                {
                    day=day+1;
                    if (day>7) {day=1;}
                }
            }
            switch(day)
            {
                case 1: return "Lunes";
                case 2: return "Martes";
                case 3: return "Miércoles";
                case 4: return "Jueves";
                case 5: return "Viernes";
                case 6: return "Sábado";
                case 7: return "Domingo";
            }
            return "";
    }
}
