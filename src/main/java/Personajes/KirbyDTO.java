/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Luis Alfredo
 */

public class KirbyDTO {
    private String nombre;
    private int vida;
    private String habilidad;
    private boolean volador;
    private int estrellas;
    private boolean activo;


    // Constructor con parámetros
    public KirbyDTO(String nombre, int vida, String habilidad, boolean volador, int estrellas, boolean activo) {
        this.nombre = nombre;
        this.vida = vida;
        this.habilidad = habilidad;
        this.volador = volador;
        this.estrellas = estrellas;
        this.activo = activo;
    }

    KirbyDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public boolean isVolador() {
        return volador;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

