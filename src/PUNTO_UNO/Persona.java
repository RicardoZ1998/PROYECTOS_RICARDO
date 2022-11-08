/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO_UNO;

public abstract class Persona {
    protected String nombre;
    protected String fechaNacimiento;
    protected String estadoCivil;
    protected String numeroTelefono;
    protected int bonoAcumuladoMensual=0;
    
    public Persona(String nombre,String fechaNacimiento,
                   String estadoCivil,String numeroTelefono,
                   int pagoMensual){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.numeroTelefono = numeroTelefono;
        this.bonoAcumuladoMensual = bonoAcumuladoMensual;
        
    }
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getPagoMensual() {
        return bonoAcumuladoMensual;
    }

    public void setPagoMensual(int bonoAcumuladoMensual) {
        this.bonoAcumuladoMensual = bonoAcumuladoMensual;
    }
    
    public abstract void Trabajo();
}
