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
public class clsPregunta6 
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    public clsPregunta6() 
    {
        JOptionPane.showMessageDialog(null,"Se le mostrará un menú");
        this.a=1;this.b=1;this.c=1;this.d=1;this.e=1;
    }
    
    private void setA(int i)
    {
        this.a=i;
    }
    private void setB(int i)
    {
        this.b=i;
    }
    private void setC(int i)
    {
        this.c=i;
    }
    private void setD(int i)
    {
        this.d=i;
    }
    private void setE(int i)
    {
        this.e=i;
    }
    private int getA()
    {
        return this.a;
    }
    private int getB()
    {
        return this.b;
    }
    private int getC()
    {
        return this.c;
    }
    private int getD()
    {
        return this.d;
    }
    private int getE()
    {
        return this.e;
    }
    
    private void Serie()
    {
        //Timer reloj = new Timer(1000,new ActionListener() 
        //{
            //@Override
            //public void actionPerformed(ActionEvent ae)
            //{
                if (getE()==9) //verifica desde la ultima posiciòn a la primera, porque es el que màs varìa
                {
                    if (getD()==9) // d==9 , e==9
                    {
                        if (getC()==9) // c==9 , d==9, e==9
                        {
                            if (getB()==9) // b==9 , c==9, d==9, e==9
                            {
                                if (getA()==9) // todos son iguales a 9
                                {
                                    System.out.println(getA()+""+getB()+""+getC()+""+getD()+""+getE());
                                } else // a!=9 ( b==9 , c==9 , d==9, e==9 )
                                {
                                    System.out.println(getA()+""+getB()+""+getC()+""+getD()+""+getE());
                                    //Serie(a+1,1,1,1,1);
                                    setA(getA()+1);setB(1);setC(1);setD(1);setE(1);
                                    Serie();
                                }
                            } else // b!=9 ( c==9 , d==9 , e==9 )
                            {
                                System.out.println(getA()+""+getB()+""+getC()+""+getD()+""+getE());
                                //Serie(a,b+1,1,1,1);
                                setB(getB()+1);setC(1);setD(1);setE(1);
                                Serie();
                            }
                        } else // c!=9 ( d==9 , e==9 )
                        {
                            System.out.println(getA()+""+getB()+""+getC()+""+getD()+""+getE());
                            //Serie(a,b,c+1,1,1);
                            setC(getC()+1);setD(1);setE(1);
                            Serie();
                        }
                    } else // d!=9 ( e==9 )
                    {
                        System.out.println(getA()+""+getB()+""+getC()+""+getD()+""+getE());
                        //Serie(a,b,c,d+1,1);
                        setD(getD()+1);setE(1);
                        Serie();
                    }
                }else // e!=9
                {
                    System.out.println(getA()+""+getB()+""+getC()+""+getD()+""+getE());
                    //Serie(a,b,c,d,e+1);
                    setE(getE()+1);
                    Serie();
                }
            }
        //});
        //char opcion;
        //opcion=JOptionPane.showInputDialog("Si desea detener la serie, presione cualquier caracter").charAt(0);
        //if (opcion!=' ') 
        //{
            //reloj.stop();
        //}
    //}
    
    private int Factorial(int i)
    {
        if (i==0) 
        {
            return 1;
        } else 
        {
            int fact = i*Factorial(i-1);
            return fact;
        }
    }
    private int Permutacion(int n, int r)
    {
        // Combinaciones => n! / (r!(n-r)!)
        return (Factorial(n) / Factorial(n-r));
    }
    
    public void Menu()
    {
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"     MENU\n\n"
                + "1- Ver serie\n"
                + "2- Ver cúantos grupos de 5 hay\n"
                + "3- Salir\n\n"
                + "Opcion:"));
        switch(opcion)
        {
            case 1:
                Serie();
                Menu(); break;
            case 2:
                JOptionPane.showMessageDialog(null,"Se hacen: "+Permutacion(9,5)+" grupos de 5 números cada uno");
                Menu();
        }
    }
}

