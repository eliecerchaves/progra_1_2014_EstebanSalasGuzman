/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppractica3;

/**
 *
 * @author esteban
 */
public class AppPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODAS LAS PREGUNTAS DE LA PRACTICA SE MANEJAN EN UNA CLASE
        clsPreguntas A = new clsPreguntas();// < = = = = = = = = = ^
        A.Menu();// < = = = = = = = = = = = = = = = = = = = = = = ¬
        // ESTO ES DEBIDO A QUE, COMO EN ESA CLASE SE MANEJA UN MENU
        // Y REQUIERO QUE SE ESTÉ MOSTRANDO CONSTANTEMENTE
        // NO PUEDO LLAMAR AL "main" A SÍ MISMO.
    }
    
}
