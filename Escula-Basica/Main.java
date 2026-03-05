public class Main {
    public static void main (String[] args){
    

        Alumnos alumno1=new Alumno();
        alumno1.nombre="Angel";
        alumno1.matricula="ueuety1u2";
        alumno1.calificacion1=10;
        alumno1.calificacion2=8;
        alumno1.calificacion3=6;

        alumno1.calcularPromedio();
        alumno1.mostrarAlumno();

        System.out.print("+++++++++++++++++++++++++++++++++++++++");


        Escuela escuela1=new Escuela();
        escuela1.alumno="Carlos";


        escuela1.mostrarAlumno();






        

    }
}