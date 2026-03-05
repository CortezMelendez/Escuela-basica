
import java.nio.channels.SelectableChannel;
import java.util.Set;

public class Escuela extends Alumno {
    //Supercito para mostrar posteriormente
    public Alumno (String nombre, String matricula, double calificacion1, double calificacion2, double calificacion3){
        super(nombre, matricula, calificacion1, calificacion2, calificacion3);
    }
    //Constructorcito vacio :D

    @Override 
    public void mostrarAlumno(){
        System.out.println("--------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Matricula:" + getMatricula());
        System.out.println("Primera Calificación: " + getCalificacion1());
        System.out.println("Segunda Calificación:" + getCalificacion2());
        System.out.println("Tercera Calificación: " + getCalificacion3());
        System.out.println("Promedio total :D : ", calcularPromedio() );
        System.out.println("------------------");
    }
    
    
}