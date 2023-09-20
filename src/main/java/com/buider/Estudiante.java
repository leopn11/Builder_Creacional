package com.buider;

import com.buider.domain.Acudiente;
import com.buider.domain.Colegio;
import com.buider.domain.Direccion;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private int edad;
    private int curso;
    private String genero;
    private Direccion direccion;
    private List<Acudiente> acudientes;
    private Colegio colegio;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int curso, String genero, Direccion direccion, List<Acudiente> acudientes, Colegio colegio) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.genero = genero;
        this.direccion = direccion;
        this.acudientes = acudientes;
        this.colegio = colegio;
    }

    public static class EstudianteBuilder implements IBuilder{

        private String nombre;
        private int edad;
        private int curso;
        private String genero;
        private Direccion direccion;
        private List<Acudiente> acudientes = new ArrayList<>();
        private Colegio colegio;

        public EstudianteBuilder() {
        }

        public EstudianteBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EstudianteBuilder setCurso(int curso) {
            this.curso = curso;
            return this;
        }

        public EstudianteBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public EstudianteBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }

        // Enviamos directamente el objeto ya construido
        public EstudianteBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }

        // Enviamos el objeto por parametros
        public EstudianteBuilder setDireccion(String pais, String departamento, String ciudad, String barrio, String direccion, int comuna) {
            this.direccion = new Direccion(pais,departamento,ciudad,barrio,direccion,comuna);
            return this;
        }

        public EstudianteBuilder setAcudiente (Acudiente acudiente) {
            this.acudientes.add(acudiente);
            return this;
        }

        public EstudianteBuilder setAcudiente (String nombres, String parentesco, int telefono, int edad, String ocupacion, String correo) {
            this.acudientes.add(new Acudiente(nombres,parentesco,telefono,edad,ocupacion,correo));
            return this;
        }

        public EstudianteBuilder setColegio(Colegio colegio) {
            this.colegio = colegio;
            return this;
        }

        public EstudianteBuilder setColegio(String nombre, Direccion direccion) {
            this.colegio = new Colegio(nombre, direccion);
            return this;
        }

        @Override
        public Estudiante build() {
            return new Estudiante(nombre,edad,curso,genero,direccion,acudientes,colegio);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Acudiente> getAcudientes() {
        return acudientes;
    }

    public void setAcudientes(List<Acudiente> acudientes) {
        this.acudientes = acudientes;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "\n acudientes=" + acudientes +
                "\n, colegio=" + colegio +
                "\n, curso=" + curso +
                "\n, direccion=" + direccion +
                "\n, edad=" + edad +
                "\n, genero='" + genero + '\'' +
                "\n, nombre='" + nombre + '\'' +
                '}';
    }
}