/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author Luis Alfredo
 */

public class KratosDTO {
    private String nombre;
    private int edad;
    private String genero;
    private String habilidad;
    private int arma;
    private boolean activo;

   
    // Constructor con parámetros
    public KratosDTO (String nombre, int edad, String genero, String habilidad, int anillos, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.habilidad = habilidad;
        this.arma = anillos;
        this.activo = activo;
    }

    // Métodos getter y setter
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad = edad; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public String getHabilidad() { return habilidad; }

    public void setHabilidad(String habilidad) { this.habilidad = habilidad; }

    public int getArma() { return arma; }

    public void setArma(int arma) { this.arma = arma; }

    public boolean isActivo() { return activo; }

    public void setActivo(boolean activo) { this.activo = activo; }
}
