/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Luis Alfredo
 */

public class MarioBrosDTO {
    private String nombre;
    private int edad;
    private String genero;
    private String habilidad;
    private int vidas;
    private boolean activo;

    // Constructor vacío
    public MarioBrosDTO() {
    }

    // Constructor con parámetros
    public MarioBrosDTO(String nombre, int edad, String genero, String habilidad, int vidas, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.habilidad = habilidad;
        this.vidas = vidas;
        this.activo = activo;
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

    public int getVidas() {
        return vidas;
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

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
