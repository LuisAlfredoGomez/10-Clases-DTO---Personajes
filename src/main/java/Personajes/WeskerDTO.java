/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author suicc
 */

public class WeskerDTO {
    private String nombre;
    private int edad;
    private String habilidad;
    private String arma;
    private boolean inmortal;
    private boolean activo;


    // Constructor con parámetros
    public WeskerDTO(String nombre, int edad, String habilidad, String arma, boolean inmortal, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidad = habilidad;
        this.arma = arma;
        this.inmortal = inmortal;
        this.activo = activo;
    }

    WeskerDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getArma() {
        return arma;
    }

    public boolean isInmortal() {
        return inmortal;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setInmortal(boolean inmortal) {
        this.inmortal = inmortal;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

