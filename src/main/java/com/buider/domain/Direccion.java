package com.buider.domain;

public class Direccion {

    private String pais;
    private String departamento;
    private String ciudad;
    private String barrio;
    private String direccion;
    private int comuna;


    public Direccion() {
    }

    public Direccion(String pais, String departamento, String ciudad, String barrio, String direccion, int comuna) {
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccion = direccion;
        this.comuna = comuna;

    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }


    @Override
    public String toString() {
        return "Direccion{" +
                "barrio='" + barrio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", comuna=" + comuna +
                ", departamento='" + departamento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
