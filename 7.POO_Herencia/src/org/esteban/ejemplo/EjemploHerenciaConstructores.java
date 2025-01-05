package org.esteban.ejemplo;

import org.esteban.pooherencia.Alumno;
import org.esteban.pooherencia.AlumnoInternacional;
import org.esteban.pooherencia.Persona;
import org.esteban.pooherencia.Profesor;


public class EjemploHerenciaConstructores {
    public static void main(String[] args) {


        System.out.println("====================Creando la instancia de alumno===================");
        Persona alumno = new Alumno("Esteban","Munoz",22,"Colegio Empresarial");
        ((Alumno) alumno).setNotaCastellano(5.5);
        ((Alumno) alumno).setNotaHistoria(6.3);
        ((Alumno) alumno).setNotaMatematicas(4.9);

        System.out.println("====================Creando la instancia de alumno internacional===================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("peter","gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Colegio Empresarial");
        alumnoInt.setNotaCastellano(6.8);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        System.out.println("====================Creando la instancia de profesor===================");
        Profesor profesor = new Profesor("luci","perez","Maatematicas");
        profesor.setEdad(37);

        System.out.println("===========-==============");

        System.out.println(alumno.toString());

        }
    }

