
import java.nio.channels.SelectableChannel;
import java.util.Set;

public class Escuela extends Alumno {

    public Escuela (){
        super();
    }
    //Constructorcito vacio :D
    public Escuela(String nombre, String matricula double calificacion1, double calificacion2, double calificacion3){
        setNombre(nombre);
        setMatricula(matricula);
        setCalificacion1(calificacion1);
        setCalificacion2(calificacion2);
        setCalificacion3(calificacion3);

    }
    public void mostrarAlumno(){
        System.out.println("--------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Matricula:" + getMatricula());
        System.out.println("Primera Calificación: " + getCalificacion1());
        System.out.println("Segunda Calificación:" + getCalificacion2());
        System.out.println("Tercera Calificación: " + getCalificacion3());
        System.out.println("Promedio total :D : ", calcularPromedio );
    }
    
}