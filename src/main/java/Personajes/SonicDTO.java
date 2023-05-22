/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Luis Alfredo
 */

public class SonicDTO {
    private String nombre;
    private int edad;
    private String genero;
    private String habilidad;
    private int anillos;
    private boolean activo;

  

    // Constructor con parámetros
    public SonicDTO(String nombre, int edad, String genero, String habilidad, int anillos, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.habilidad = habilidad;
        this.anillos = anillos;
        this.activo = activo;
    }

    SonicDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getter
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

    public int getAnillos() {
        return anillos;
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
