/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author suicc
 */

public class DonkeyKongDTO {
    private String nombre;
    private int fuerza;
    private String habilidad;
    private int bananas;
    private boolean activo;
    private String ubicacion;


    // Constructor con parámetros
    public DonkeyKongDTO(String nombre, int fuerza, String habilidad, int bananas, boolean activo, String ubicacion) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.habilidad = habilidad;
        this.bananas = bananas;
        this.activo = activo;
        this.ubicacion = ubicacion;
    }

    DonkeyKongDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public int getBananas() {
        return bananas;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setBananas(int bananas) {
        this.bananas = bananas;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
