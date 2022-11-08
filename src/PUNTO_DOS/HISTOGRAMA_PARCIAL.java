/*
[10 Ptos.] Escriba un programa que imprima un histograma de acuerdo a cuántas veces aparece cada número
del 0 al 9 dentro de un arreglo. Este histograma será simple y por consola, imprimiendo asteriscos. 

Un ejemplo de arreglo de entrada sería: {0, 1, 2, 5, 0, 1, 0, 9} 

Y la salida por consola sería: 

0: *** 
1: ** 
2: * 
3:  
4: 
5: * 
6:  
7:  
8:  
9: *

Nota: el cero tiene 3 asteriscos porque está 3 veces en el arreglo de entrada,
así mismo con los otros números, cuando no está, simplemente se deja sin asteriscos. 
Por último, este programa no tiene interacción con el usuario, el arreglo de entrada se 
escribe dentro de una línea de código y de quererse modificar, se hará dentro del mismo código.

 */
package PUNTO_DOS;

import java.util.Vector;

public class HISTOGRAMA_PARCIAL {

    static double posInf = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {

        double arreglo[] = new double[]{0, 1, 0, 5, 55, 1542, 200, 9, 1542};
        int n = arreglo.length;

        boolean repetir[] = new boolean[n];

        double candidato=0;
        
        
        for (int i = 0; i < n; i++) {
            if(candidato<arreglo[i]){
                candidato = (double) arreglo[i];
            }
            
        }            
            
        // Recorro de 1 a infinito para ver cuántas veces se repite cada valor
        for (int i = 0; i <= posInf; i++) {
            
            
            // Cantidad de veces que se repite i
            int contador = 0;

            // Recorro el arreglo
            for (int j = 0; j < n; j++) {
                if (repetir[j] == true) {
                    continue;
                }

                // Si el valor en esa posición es el analizado (i) incremento
                if (arreglo[j] == i) {
                    repetir[j] = true;
                    contador++;
                }
            }
        
            int h = (int) i;
            if (contador > 0) {
                System.out.print(h + ": ");

                // La i tiene el valor y contador las veces que se repite
                // System.out.print(i + ": " );
                for (int k = 0; k < contador; k++) {

                    
                    System.out.print('*');

                }
                System.out.println("");
                if(candidato==i){
                    break;
                }
            }
        }

    }
}
