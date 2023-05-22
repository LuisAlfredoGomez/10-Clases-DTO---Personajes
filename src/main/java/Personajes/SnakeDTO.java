/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author suicc
 */

public class SnakeDTO {
    private String nombre;
    private int longitud;
    private String color;
    private boolean venenosa;
    private int velocidad;
    private boolean activo;


    // Constructor con atributos
    public SnakeDTO(String nombre, int longitud, String color, boolean venenosa, int velocidad, boolean activo) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.color = color;
        this.venenosa = venenosa;
        this.velocidad = velocidad;
        this.activo = activo;
    }

    SnakeDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos ge
    public String getNombre() {
        return nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColor() {
        return color;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isActivo() {
        return activo;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
