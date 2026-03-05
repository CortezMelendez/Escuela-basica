public class Alumno {
    /*
    Atributos: nombre, matricula, calificacion1, calificacion2, calificacion3.
• Métodos: constructor, calcularPromedio(), mostrarAlumno().
• Conceptos: encapsulamiento, métodos, atributos.
*/

private String nombre;
private String matricula;
private double calificacion1;
private double calificacion2;
private double calificacion3;

public void Alumno(){
}

public void Alumno2(String nombre, String matricula, double calificacion1, double calificacion2, double calificacion3){
this.nombre=nombre;
this.matricula=matricula;
this.calificacion1=calificacion1;
this.calificacion2=calificacion2;
this.calificacion3=calificacion3;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public void setMatricula(String matricula){
    this.matricula=matricula;
}

public void setCalificacion1(double calificacion1){
    this.calificacion1=calificacion1;
}

public void setCalificacion2(double calificacion2){
    this.calificacion2=calificacion2;
}

public void setCalificacion3(double calificacion3){
    this.calificacion3=calificacion3;
}


public String getNombre(){
return this.nombre;
}

public String getMatricula(){
    return this.matricula;
}

public double getCalificacion1(){
    return this.calificacion1;
}

public double getCalificacion2(){
    return this.calificacion2;
}

public double getCalificacion3(){
    return this.calificacion3;
}



}
