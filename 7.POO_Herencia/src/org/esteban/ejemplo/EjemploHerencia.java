package org.esteban.ejemplo;

import org.esteban.pooherencia.*;


public class EjemploHerencia {
    public static void main(String[] args) {


        System.out.println("====================Creando la instancia de alumno===================");
        Persona alumno = new Alumno();
        alumno.setNombre("Esteban");
        alumno.setApellido("Munoz");
        ((Alumno)alumno).setInstitucion("Colegio Empresarial");
        ((Alumno) alumno).setNotaCastellano(5.5);
        ((Alumno) alumno).setNotaHistoria(6.3);
        ((Alumno) alumno).setNotaMatematicas(4.9);

        System.out.println("====================Creando la instancia de alumno internacional===================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("peter");
        alumnoInt.setApellido("gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Colegio Empresarial");
        alumnoInt.setNotaCastellano(6.8);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        System.out.println("====================Creando la instancia de profesor===================");
        Profesor profesor = new Profesor();
        profesor.setNombre("luci");
        profesor.setApellido("perez");
        profesor.setAsignatura("Maatematicas");

        System.out.println("===========-==============");


        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + ((Alumno) alumno).getInstitucion() );
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + ((Alumno) alumnoInt).getInstitucion() + " " + alumnoInt.getPais() );
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
        String hija = clase.getName();
        String padre = clase.getSuperclass().getName();
        System.out.println(hija + "es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
