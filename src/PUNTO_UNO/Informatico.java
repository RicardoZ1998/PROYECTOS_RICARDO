/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_UNO;

/**
 *
 * @author Mateo
 */
public class Informatico extends Persona{
    
    public Informatico(String nombre,String fechaNacimiento,
                       String estadoCivil,String numeroTelefono,
                       int pagoMensual){
        super(nombre, fechaNacimiento, estadoCivil,
                numeroTelefono, pagoMensual);
    }
    
    public Informatico(){
        
    }
    
    @Override
    public void Trabajo(){
        bonoAcumuladoMensual += 2500;
    }
}
