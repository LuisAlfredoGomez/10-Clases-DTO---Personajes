/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Luis Alfredo
 */

public class ZeldaDTO {
    private String nombre;
    private int edad;
    private String genero;
    private String habilidad;
    private int corazones;
    private boolean activo;

   
    // Constructor con atributos
    public ZeldaDTO(String nombre, int edad, String genero, String habilidad, int corazones, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.habilidad = habilidad;
        this.corazones = corazones;
        this.activo = activo;
    }

    ZeldaDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public int getCorazones() {
        return corazones;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setCorazones(int corazones) {
        this.corazones = corazones;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

