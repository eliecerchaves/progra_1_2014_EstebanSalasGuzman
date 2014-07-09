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
public class AppPracticaMatriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        clsEjercicio A = new clsEjercicio();
        A.Ingresar();
        JOptionPane.showMessageDialog(null,"Matriz\n\n"
                + A.Mostrar(0, 0) + "\n\n"
                + "Promedio Total: " + A.getPromedioTotal() + "\n"
                + "Impar Mayor: " + A.getImparMayor()+ "\n"
                + "Promedio de los Pares: " + A.getPromedioPar() + "\n"
                + "Porcentaje de Impares por Fila\n" + A.getStrPorcentajeImparFila() + "\n");
        A.OrdenarFilas(0);
        JOptionPane.showMessageDialog(null,"Matriz con las filas ordenadas\n\n"
                + A.Mostrar(0,0) + "\n\n"
                + "Mayor de cada Fila\n" + A.getStrMayorFila() + "\n"
                + "Menor de cada Columna\n" + A.MostrarMenorColumna(0) + "\n"
                + "Menor Impar de cada Columna\n" + A.MostrarMenorImparColumna(0) + "\n"
                + "Números cuya suma de dígitos es 7\n" + A.MostrarSuma7() + "\n"
                + "Filas con mayor cantidad de pares\n" + A.MostrarFilasMasPares() + "\n"
                + "Suma de dígitos de todos los números\n" + A.MostrarSumaDigitos(0, 0) + "\n"
                + "Números Primos\n" + A.MostrarPrimos(0, 0) + "\n"
                + "Números cuyo mayor dígito ES 5\n" + A.MostrarDigitoMayor5(0, 0));
    }
    
}
