/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appprimerexamenprogra1;

/**
 *
 * @author esteban
 */
public class clsEnunciado1 
{
    private char [][] abc = new char [5][5];
    private boolean Verificador;
    private String Traductor;

    public clsEnunciado1() 
    {
        this.Verificador = false;
        this.Traductor = "";
        this.abc[0][0] = 'A';   this.abc[1][0] = 'B';   this.abc[2][0] = 'C';   this.abc[3][0] = 'D';   this.abc[4][0] = 'E';
        this.abc[0][1] = 'F';   this.abc[1][1] = 'G';   this.abc[2][1] = 'H';   this.abc[3][1] = 'I';   this.abc[4][1] = 'J';
        this.abc[0][2] = 'L';   this.abc[1][2] = 'M';   this.abc[2][2] = 'N';   this.abc[3][2] = 'O';   this.abc[4][2] = 'P';
        this.abc[0][3] = 'Q';   this.abc[1][3] = 'R';   this.abc[2][3] = 'S';   this.abc[3][3] = 'T';   this.abc[4][3] = 'U';
        this.abc[0][4] = 'V';   this.abc[1][4] = 'W';   this.abc[2][4] = 'X';   this.abc[3][4] = 'Y';   this.abc[4][4] = 'Z';
        
        for (int y = 0; y < 5; y++) 
        {
            for (int x = 0; x < 5; x++) 
            {
                System.out.print(this.abc[x][y]);
            }
            System.out.println();
        }
        
    }
    
    public boolean getVerificador()
    {
        return this.Verificador;
    }
    private void setVerificador(boolean verif)
    {
        this.Verificador = verif;
    }
    public String getTraductor() 
    {
        return Traductor;
    }
    
    public void VerificarPalabra(String Palabra) //Verifica que los caracteres ingresados sean letras y estén en la matriz de letras
    {                                               //Paralelamente guarda la traduccion a TapCode
        for (int j = 0; j < Palabra.length(); j++) 
        {
            setVerificador(false);
            for (int y = 0; y < 5; y++) 
            {
                for (int x = 0; x < 5; x++) 
                {
                    if ( Palabra.charAt(j) == this.abc[x][y] ) 
                    {
                        setVerificador(true);
                        int c = 0;
                        while(c<=y)
                        {
                            this.Traductor = this.Traductor + ".";
                            c++;
                        }
                        c = 0;
                        this.Traductor = this.Traductor + " ";
                        while(c<=x)
                        {
                            this.Traductor = this.Traductor + ".";
                            c++;
                        }
                        this.Traductor = this.Traductor + " ";
                        break;
                    }
                }
                if(getVerificador() == true) break;
            }
        }
    }
}
