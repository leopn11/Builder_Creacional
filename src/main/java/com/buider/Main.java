package com.buider;

import com.buider.domain.Acudiente;
import com.buider.domain.Colegio;
import com.buider.domain.Direccion;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante.EstudianteBuilder()
                .setNombre("Leonardo")
                .setEdad(13)
                .setCurso(7)
                .setColegio(new Colegio("Jose Prudencio Padilla",new Direccion("Colombia","Santander","Barrancabermeja", "galan", "Calle 55A No. 31-80", 6 )))
                .setAcudiente(new Acudiente("Alexandra Narvaez","madre", 3433442, 50,"Docente","ale@gmail.com"))
                .setAcudiente(new Acudiente("Dayana Narvaez", "hermana", 45664555, 29,"Docente","daya@gmail.com"))
                .setDireccion("Colombia", "Santander", "Barrancabermeja", "20 de enero", "Carrera 34 23-32",2)
                .build();

        System.out.println("estudiante = " + estudiante);
    }
}
