/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppracticamatriz2;

import javax.swing.JOptionPane;

/**
 *
 * @author esteban
 */
public class clsEjercicio 
{
    private int [][] Matriz;
    private int n,m;
    
    private int promedioTotal;
    private int imparMayor;
    private int promedioPar;
    private int porcentajeImparFila;
    private String StrPorcentajeImparFila;
    private int mayorFila;
    private String StrMayorFila;
    private int [][] Columnas;
    private int menorColumna;

    public clsEjercicio() 
    {
        Inicializar();
    }
    
    private void Inicializar()
    {
        this.promedioTotal = 0;
        this.promedioPar = 0;
        this.imparMayor = 0;
        this.porcentajeImparFila = 0;
        this.StrPorcentajeImparFila = "";
        this.StrMayorFila = "";
        this.mayorFila = 0;
        this.menorColumna = 0;
        do
        {
            this.n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de columnas que quiere que tenga la matriz"));
        }while(this.n<2);
        do
        {
            this.m = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de filas que quiere que tenga la matriz")); 
        }while(this.m<2);
        this.Matriz = new int [this.n][this.m];
        this.Columnas = new int [this.m][this.n];
    }

    public int getPromedioTotal() {return promedioTotal;}
    public int getPromedioPar() {return promedioPar;}
    public int getImparMayor() {return imparMayor;}
    public String getStrPorcentajeImparFila() {return StrPorcentajeImparFila;}
    public void setStrPorcentajeImparFila(String StrPorcentajeFila) {this.StrPorcentajeImparFila = getStrPorcentajeImparFila() + StrPorcentajeImparFila;}
    public String getStrMayorFila() {return StrMayorFila;}
    public void setStrMayorFila(String StrMayorFila) {this.StrMayorFila = getStrMayorFila() + StrMayorFila;}
    private void setColumnas()
    {
        for (int y = 0; y < this.m; y++) 
        {
            for (int x = 0; x < this.n; x++) 
            {
                this.Columnas[x][y] = this.Matriz[y][x];
            }
        }
    }

    
    
    public void Ingresar()
    {
        for (int y = 0; y < this.m; y++) 
        {
            for (int x = 0; x < this.n; x++) 
            {
                this.Matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"
                        + "\n\nColumna "+(x+1)+"   Fila: "+(y+1)));
                Guardar(this.Matriz[x][y]);
            }
            setStrPorcentajeImparFila("Fila "+(y+1)+": "+(int)((this.porcentajeImparFila*100)/this.n)+"% ");
            this.porcentajeImparFila = 0;
            setStrMayorFila("Fila "+(y+1)+": "+this.mayorFila;
            this.mayorFila = 0;
        }
        this.promedioTotal = this.promedioTotal / (this.m * this.n);
    }
    
    private void Guardar(int num)
    {
        this.promedioTotal = this.promedioTotal + num;
        if (Par(num)==1 && num>this.imparMayor) {this.imparMayor=num;}
        if (Par(num)==2) {this.promedioPar=this.promedioPar+num;}
        if (Par(num)==1) {this.porcentajeImparFila++;}
        if (num>this.mayorFila {this.mayorFila=num;}
    }
    
    public String Mostrar(int x, int y)
    {
        if (y<this.m) 
        {
            if (x<this.n) 
            {
                String muestra = this.Matriz[x][y]+" "+Mostrar(x+1, y);
                return muestra;
            } else 
            {
                String muestra = "\n"+Mostrar(0, y+1);
                return muestra;
            }
        } else 
        {
            return "";
        }
    }
    
    private int Par(int num)
    {
        if ((num%2)==0) {return 2;}
        else {return 1;}
    }
    
    private boolean Primo(int num)
    {
        if (num < 0) {num = num * -1;}
        if (Par(num) == true || SumaDigitos(num) == 3) {return false;}
        if (num < 4) {return true;}
        else 
        {
            for (int i = 2; i < (num/2); i++) 
            {
                if ((num%i) == 0) 
                {
                    return false;
                    break;
                }
            }
            return true;
        }
    }
    
    public void OrdenarFilas(int fila)
    {
        if (fila < this.m) 
        {
            for (int x = 0; x < (this.n-1); x++) 
            {
                for (int i = (x+1); i < this.n; i++) 
                {
                    if (this.Matriz[x][fila] > this.Matriz[i][fila]) 
                    {
                        int aux = this.Matriz[x][fila];
                        this.Matriz[x][fila] = this.Matriz[i][fila];
                        this.Matriz[i][fila] = aux;
                    }
                }
            }
            OrdenarFilas(fila+1);
        }
    }
    
    private int MenorColumna(int columna)
    {
        int men = this.Matriz[columna][0];
        for (int y = 0; y < this.m; y++) 
            {
                if (this.Matriz[columna][y] < men) 
                {
                    men = this.Matriz[columna][y];
                }
            }
        return men;
    }
    
    public String MostrarMenorColumna(int x)
    {
        if (x < this.n) 
        {
            String muestra = "Columna " + (x+1) + " - Menor: " + MenorColumna(x) + "  " + MostrarMenorColumna(x+1);
            return muestra;
        }
        return "";
    }
    
    private int MenorImparColumna(int columna)
    {
        int men = this.Matriz[columna][0];
        for (int y = 0; y < this.m; y++) 
            {
                if (Impar(this.Matriz[columna][y]) == true) 
                {
                    if ( this.Matriz[columna][y] < men)
                    {
                        men = this.Matriz[columna][y];
                    }
                }
            }
        if (men == this.Matriz[columna][0]) {return 0;}
        else {return men;}
    }
    
    public String MostrarMenorImparColumna(int x)
    {
        if (x < this.n) 
        {
            String muestra = "Columna: " + (x+1) + MenorImparColumna(x) + "  " + MostrarMenorImparColumna(x+1);
            return muestra;
        }
        return "";
    }
    
    private int SumaDigitos(int numero)
    {
        int suma;
        int num = numero;
        do
        {
            suma = 0;
            if (num < 0) 
            {
                num = num * -1 ;
            }
            while (num > 0) 
            {
                suma = suma + (num % 10);
                num = num / 10;
            }
            if (suma > 9)  {num = suma;}
        }while(suma > 9);
        
        return suma;
    }

    public String MostrarSuma7()
    {
        String muestra = "";
        int suma = 0;
        int x = 0; int y = 0;
        while (y < this.m) 
        { 
            while (x < this.n) 
            {
                suma = SumaDigitos(this.Matriz[x][y]);
                if (suma == 7) {muestra = muestra + this.Matriz[x][y] + " ";}
                x++;
            }
            y++; x=0;
        }
        return muestra;
    }
    
    private int CantParesFila(int fila, int x)
    {
        if (x < this.n) 
        {
            if (Par(this.Matriz[x][fila]) == true) 
            {
                int cant = 1 + CantParesFila(fila, x+1);
                return cant;
            }else
            {
                int cant = 0 + CantParesFila(fila, x+1);
                return cant;
            }
        }
        return 0;
    }
    
    public String MostrarFilasMasPares()
    {
        String muestra = "";
        int may = 0;
        int aux;
        for (int y = 0; y < this.m; y++) 
            {
                aux = CantParesFila(y, 0);
                if (aux > 0)
                {
                    if ( aux > may) 
                    {
                        muestra = "";
                        for (int x = 0; x < this.n; x++) 
                        {
                            muestra = muestra + this.Matriz[x][y] + " ";
                        }
                        muestra = muestra + "\n";
                        may = aux;
                    }else
                    {
                        if (aux == may) 
                        {
                            for (int x = 0; x < this.n; x++) 
                            {
                                muestra = muestra + this.Matriz[x][y] + " ";
                            }
                            muestra = muestra + "\n";
                        }
                    }
                }
                
            }
        if(may == 0) {return "Ninguna fila tiene pares!!!";}
        else {return muestra;}
    }
    
    public String MostrarSumaDigitos(int x, int y)
    {
        if (y < this.m) 
        {
            if (x < this.n) 
            {
                String muestra = SumaDigitos(this.Matriz[x][y]) + " (" + this.Matriz[x][y] + ") " + MostrarSumaDigitos(x+1, y);
                return muestra;
            }else
            {
                String muestra = "\n" + MostrarSumaDigitos(0, y+1);
                return muestra;
            }
        }
        return "";
    }
    
    public String MostrarPrimos(int x, int y)
    {
        if (y < this.m) 
        {
            if (x < this.n) 
            {
                if (Primo(this.Matriz[x][y]) == true) 
                {
                    String muestra = this.Matriz[x][y] + " " + MostrarPrimos(x+1, y);
                    return muestra;
                }
            }else {MostrarSumaDigitos(0, y+1);}
        }
        return "";
    }
    
    private int DigitoMayor(int numero)
    {
        String num = numero + "";
        int may = 0;
        for (int i = 0; i < num.length(); i++) 
        {
            int aux = (int)num.charAt(i);
            if (aux > may) {may = aux;}
        }
        return may;
    }
    
    public String MostrarDigitoMayor5(int x, int y)
    {
        if (y < this.m) 
        {
            if (x < this.n) 
            {
                if (DigitoMayor(this.Matriz[x][y]) == 5) 
                {
                    String muestra = this.Matriz[x][y] + " " + MostrarPrimos(x+1, y);
                    return muestra;
                }
            }else {MostrarSumaDigitos(0, y+1);}
        }
        return "";
    }
}