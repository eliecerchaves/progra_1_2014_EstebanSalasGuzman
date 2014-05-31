/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsPregunta6 
{   // GUARDAN LOS DATOS DE LA FECHA
    private int dia;
    private int mes;
    private int año;
    
    public clsPregunta6()
    {   //INFORMA SOBRE LO QUE HACE LA CLASE
        JOptionPane.showMessageDialog(null,"Se le solicitará una fecha\n"
                + "Luego se le mostrará el día anterior al ingresado");
        Ingresar(); Mostrar();
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
    
    private String FechaAnterior(int dia, int mes, int año) //GENERA LA FECHA ANTERIOR A LA INDICADA
                                                            // CON BASE EN LAS FUNCIONES:
                                                            //"DiasDelMes" Y "Bisiesto"
    {
        if (dia==1) //SI EL DIA INGRESADO ES 1
        {
            if (mes==1) //SI EL DIA Y EL MES INGRESADOS, SON 1
            {
                return "31/12/"+(año-1); 
                //POR DEFECTO EL DIA ANTERIOR SERA 31 Y EL MES ANTERIOR SERÁ 12, SE LE RESTA 1 AL AÑO INGRESADO
            } else //SI EL DIA INGRESADO ES 1, PERO EL MES NO LO ES
            {
                return DiasDelMes(mes-1)+"/"+(mes-1)+"/"+año;
                //CON BASE A LOS DIAS QUE TENGA EL MES ANTERIOR Y A SI EL AÑO ES BISIESTO O NO
            }   //DEVUELVE ESOS DIAS, EL MES ANTERIOR AL INGRESADO Y EL MISMO AÑO
        } else //SI LOS DIAS INGRESADOS NO SON 1 (NO IMPORTA SI EL MES ES 1 O NO)
        {
            return (dia-1)+"/"+mes+"/"+año;//DEVUELVE UN DIA MENOS, EL MISMO MES Y EL MISMO AÑO
        }
    }
    
    private String Fecha() //DEVUELVE LA FECHA INGRESADA
    {
        return this.dia+"/"+this.mes+"/"+this.año;
    }
    
    private void Ingresar() //SOLICITA Y GUARDA LOS VALORES DE LA FECHA
    {
        do  //EL AÑO NO PODRÁ SER MENOR A 1900 NI MAYOR A 3000
        {
            this.año=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año: (1900 - 3000)"));
        }while(this.año<1900 || this.año>3000);
        do  //EL MES NO PODRÁ SER MENOR A 1 NI MAYOR A 12 (POR OBVIAS RAZONES)
        {
            this.mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Año: "+this.año+"\n"
                    +"Ingrese el mes: (1 - 12)"));
        }while(this.mes<1 || this.mes>12);
        do //EL DÍA NO PODRÁ SER MENOR A 1 NI MAYOR A LA CANTIDAD DE DÍAS QUE TENGA EL MES INGRESADO
        {   //TOMANDO EN CUENTA SI EL AÑO INGRESADO ES BISIESTO O NO
            this.dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Año: "+this.año+"\n"
                    +"Mes: "+this.mes+"\n"
                    +"Ingrese el día: (1 - "+DiasDelMes(this.mes)+")"));
        }while(this.dia<1 || this.dia>DiasDelMes(this.mes));
    }
    
    private void Mostrar()//MUESTRA LA FECHA INGRESADA Y LA FECHA ANTERIOR
    {
        JOptionPane.showMessageDialog(null,"Fecha ingresada: "+Fecha()+"\n"
                        + "Fecha anterior: "+FechaAnterior(this.dia, this.mes, this.año));
    }
    
    public void Menu() //MUESTRA UN MENU Y MANEJA LAS DEMÁS FUNCIONES DE LA CLASE
    {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"       MENU\n\n"
                + "1 - Cambiar fecha\n"
                + "2 - Salir\n\n"
                + "Opcion: "));
        switch(opcion)
        {
            case 1:
            {
                Ingresar(); Mostrar();
                Menu(); break;
            } 
        }
    }
}
