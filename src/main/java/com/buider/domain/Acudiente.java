package com.buider.domain;

public class Acudiente {

    private String nombres;
    private String parentesco;
    private int telefono;
    private int edad;
    private String ocupacion;
    private String correo;



    public Acudiente() {
    }


    public Acudiente(String nombres, String parentesco, int telefono, int edad, String ocupacion, String correo) {
        this.nombres = nombres;
        this.parentesco = parentesco;
        this.telefono = telefono;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Acudiente{" +
                "correo='" + correo + '\'' +
                ", edad=" + edad +
                ", nombres='" + nombres + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
