import java.lang.String;
import java.lang.System;
public class Alumno {
    private String nombre;
    private int[] calificaciones;

    // Constructor
    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio >= 91) {
            return 'A';
        } else if (promedio >= 81) {
            return 'B';
        } else if (promedio >= 71) {
            return 'C';
        } else if (promedio >= 61) {
            return 'D';
        } else if (promedio >= 51) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Ejemplo de uso
        int[] calificacionesAlumno = {90, 75, 93, 100, 91};

        Alumno alumno = new Alumno("Jose Luis Villanueva", calificacionesAlumno);
        alumno.imprimirResultados();
    }
}