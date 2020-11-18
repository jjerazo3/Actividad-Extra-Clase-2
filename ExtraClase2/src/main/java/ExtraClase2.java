
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JONATHAN ERAZO
 */
public class ExtraClase2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
         //Declaracion de variables
         int an, mn, dn, aa, ma, da, ea, em, ed;
         
         // Inicializacion de variables
         an = 0; mn = 0; dn = 0; aa = 0; ma = 0; da = 0; ea = 0; em = 0; ed = 0;
         
         // Entrada de datos
        System.out.println("Ingrese el año de nacimiento: ");
        an = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        mn = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento: ");
        dn = leer.nextInt();
        System.out.println("Ingrese el año actual: ");
        aa = leer.nextInt();
        System.out.println("Ingrese el mes actual: ");
        ma = leer.nextInt();
        System.out.println("Ingrese el dia actual: ");
        da = leer.nextInt();
        
        // Proceso
        ea = aa - an;
        em = ma - mn;
        ed = da - dn;
        
        // Condicionales
        if (em < 0){
            ea = ea -1;
        }
        else {
            if ((em == 0)&&(ed > 0)) {
                ea = ea -1;
            }
        }
        if(em < 0){
            em = ma + 12 - mn;
        }
        if (ed < 0){
            ed = da + 30 - dn;
        }
        
        System.out.println("su edad actual es: " +ea +" años, " +em + " meses y " +ed + "dias");
    }     
}
