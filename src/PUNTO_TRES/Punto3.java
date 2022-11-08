/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_TRES;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Punto3 {

    public static void main(String[] args) {
        String textoDeConversion = JOptionPane.showInputDialog("    CONVERSOR DMR\n"
                + "\nPrograma que te permite realizar conversiones digitando la informacion"
                + "\nNOTA: Se deben escribir las unidades de medidas como se muestran a continuacion"
                + "\n 1. kilos a libras"
                + "\n 2. libras a kilos"
                + "\n 3. kilos a gramos"
                + "\n 4. gramos a libras"
                + "\n 5. centimetros a metros"
                + "\n 6. metros a centimetros"
                + "\nEjemplo (Convertir 2500 gramos a kilos)"
                + "\nPor favor digite la conversion requerida"
        );

        //Creacion del tokenizer que permite dividi la cadena de texto con espacio
        StringTokenizer tokens = new StringTokenizer(textoDeConversion, " ");

        //Declaracion de variables
        String palabra1 = tokens.nextToken();
        String palabra2 = tokens.nextToken(); //La palabra 2 corresponde al valor a convertir
        double valorAConvertirEntero = Integer.parseInt(palabra2);
        String palabra3 = tokens.nextToken();
        String palabra4 = tokens.nextToken();
        String palabra5 = tokens.nextToken();

        //System.out.println("Número de palabras: " + tokens.countTokens());
        double valorConvertido = 0;
        String unidadMedida = "xx";

        if ("kilos".equals(palabra3) && "libras".equals(palabra5)) {
            valorConvertido = valorAConvertirEntero * 2;
            unidadMedida = "libras";
        } else if ("libras".equals(palabra3) && "kilos".equals(palabra5)) {
            valorConvertido = valorAConvertirEntero / 2;
            unidadMedida = "kilos";
        } else if ("kilos".equals(palabra3) && "gramos".equals(palabra5)) {
            valorConvertido = valorAConvertirEntero * 1000;
            unidadMedida = "gramos";
        } else if ("gramos".equals(palabra3) && "kilos".equals(palabra5)) {
            valorConvertido = valorAConvertirEntero / 1000;
            unidadMedida = "kilos";
        } else if ("centimetros".equals(palabra3) && "metros".equals(palabra5)) {
            valorConvertido = valorAConvertirEntero / 100;
            unidadMedida = "metros";
        } else if ("metros".equals(palabra3) && "centimetros".equals(palabra5)) {
            valorConvertido = valorAConvertirEntero * 100;
            unidadMedida = "centimetros";
        }

        if (!palabra1.equals("convertir") || !palabra4.equals("a")) {
            JOptionPane.showMessageDialog(null, "Error de escritura");
        } else {
            JOptionPane.showMessageDialog(null, "El valor es " + valorConvertido + " " + unidadMedida);
        }
    }
}
