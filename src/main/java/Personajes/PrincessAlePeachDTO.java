/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Luis Alfredo
 */

public class PrincessAlePeachDTO {
    private String nombre;
    private int vida;
    private String habilidad;
    private String vestido;
    private boolean rescatada;
    private boolean activa;


    // Constructor con parámetros
    public PrincessAlePeachDTO(String nombre, int vida, String habilidad, String vestido, boolean rescatada, boolean activa) {
        this.nombre = nombre;
        this.vida = vida;
        this.habilidad = habilidad;
        this.vestido = vestido;
        this.rescatada = rescatada;
        this.activa = activa;
    }

    PrincessAlePeachDTO() {
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

    public String getVestido() {
        return vestido;
    }

    public boolean isRescatada() {
        return rescatada;
    }

    public boolean isActiva() {
        return activa;
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

    public void setVestido(String vestido) {
        this.vestido = vestido;
    }

    public void setRescatada(boolean rescatada) {
        this.rescatada = rescatada;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
