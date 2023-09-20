package com.buider.domain;

public class Colegio {
    private String nombre;
    private Direccion direccion;

    public Colegio() {
    }

    public Colegio(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "direccion=" + direccion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
