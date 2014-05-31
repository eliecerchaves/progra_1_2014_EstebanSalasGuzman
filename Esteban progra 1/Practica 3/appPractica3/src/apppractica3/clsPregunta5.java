/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta5 
{
    private final Random Valor = new Random();
    private int num;
    
    public clsPregunta5()
    {
        JOptionPane.showMessageDialog(null,"Se generará un número aleatorio entre 1 y 9999\n\n"
                + "Luego se mostrará ese número en Romano");
    }
    
    private String RomanoMil(int mil)
    {
        if (mil==0) 
        {
            return "";
        } else 
        {
            switch(mil)
            {
                case 1:{
                    String romanos="M"+ RomanoMil(0);
                    return romanos;} 
                case 2:{
                    String romanos="MM"+ RomanoMil(0);
                    return romanos;}
                case 3:{
                    String romanos="MMM"+ RomanoMil(0);
                    return romanos;}
                case 4:{
                    String romanos="M|V|"+ RomanoMil(0);
                    return romanos;}
                case 5:{
                    String romanos="|V|"+ RomanoMil(0);
                    return romanos;}
                case 6:{
                    String romanos="|V|M"+ RomanoMil(0);
                    return romanos;}
                case 7:{
                    String romanos="|V|MM"+ RomanoMil(0);
                    return romanos;}
                case 8:{
                    String romanos="|V|MMM"+ RomanoMil(0);
                    return romanos;}
                case 9:{
                    String romanos="M|X|"+ RomanoMil(0);
                    return romanos;}
            }
            return "";
        }
    }
    private String RomanoCien(int cien)
    {
        if (cien==0) 
        {
            return "";
        } else 
        {
            switch(cien)
            {
                case 1:{
                    String romanos="C"+ RomanoCien(0);
                    return romanos;} 
                case 2:{
                    String romanos="CC"+ RomanoCien(0);
                    return romanos;}
                case 3:{
                    String romanos="CCC"+ RomanoCien(0);
                    return romanos;}
                case 4:{
                    String romanos="CD"+ RomanoCien(0);
                    return romanos;}
                case 5:{
                    String romanos="D"+ RomanoCien(0);
                    return romanos;}
                case 6:{
                    String romanos="DC"+ RomanoCien(0);
                    return romanos;}
                case 7:{
                    String romanos="DCC"+ RomanoCien(0);
                    return romanos;}
                case 8:{
                    String romanos="DCCC"+ RomanoCien(0);
                    return romanos;}
                case 9:{
                    String romanos="CM"+ RomanoCien(0);
                    return romanos;}
            }
            return "";
        }
    }
    private String RomanoDiez(int diez)
    {
        if (diez==0) 
        {
            return "";
        } else 
        {
            switch(diez)
            {
                case 1:{
                    String romanos="X"+ RomanoDiez(0);
                    return romanos;} 
                case 2:{
                    String romanos="XX"+ RomanoDiez(0);
                    return romanos;}
                case 3:{
                    String romanos="XXX"+ RomanoDiez(0);
                    return romanos;}
                case 4:{
                    String romanos="XL"+ RomanoDiez(0);
                    return romanos;}
                case 5:{
                    String romanos="L"+ RomanoDiez(0);
                    return romanos;}
                case 6:{
                    String romanos="LX"+ RomanoDiez(0);
                    return romanos;}
                case 7:{
                    String romanos="LXX"+ RomanoDiez(0);
                    return romanos;}
                case 8:{
                    String romanos="LXXX"+ RomanoDiez(0);
                    return romanos;}
                case 9:{
                    String romanos="LC"+ RomanoDiez(0);
                    return romanos;}
            }
            return "";
        }
    }
    private String RomanoUno(int uno)
    {
        if (uno==0) 
        {
            return "";
        } else 
        {
            switch(uno)
            {
                case 1:{
                    String romanos="I"+ RomanoUno(0);
                    return romanos;} 
                case 2:{
                    String romanos="II"+ RomanoUno(0);
                    return romanos;}
                case 3:{
                    String romanos="III"+ RomanoUno(0);
                    return romanos;}
                case 4:{
                    String romanos="IV"+ RomanoUno(0);
                    return romanos;}
                case 5:{
                    String romanos="V"+ RomanoUno(0);
                    return romanos;}
                case 6:{
                    String romanos="VI"+ RomanoUno(0);
                    return romanos;}
                case 7:{
                    String romanos="VII"+ RomanoUno(0);
                    return romanos;}
                case 8:{
                    String romanos="VIII"+ RomanoUno(0);
                    return romanos;}
                case 9:{
                    String romanos="IX"+ RomanoUno(0);
                    return romanos;}
            }
            return "";
        }
    }
    
    private String Romano()
    {
        return RomanoMil(this.num/1000)+RomanoCien((this.num%1000)/100)+RomanoDiez(((this.num%1000)%100)/10)+RomanoUno(this.num%10);
    }
    
    public void Menu()
    {
        int opcion;
        this.num = this.Valor.nextInt(10000);
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                + "1 - Generar número\n"
                + "2 - Salir\n\n"
                + "Opción: "));
        
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "Número: "+this.num+"\n"
                        + "Romano: "+Romano());
                Menu();
            }
        }
    }
}
