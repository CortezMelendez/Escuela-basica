public class Main {
    public static void main (String[] args){
         PedirDatos pd =new PedirDatos();

       

        do{
        
        int opc =pd.pedirEntero("1) ingresar un alumno\n2)Salir");


        if(opc == 1){
            
        String nombre.PedirDatos("Ingrese el nombre del alumno ");
        String matricula.PedirDatos("Ingrese la matricula del alumno");
        double calificacion1.PedirDecimal("Ingrese la calificacion 1");
        double calificacion2.PedirDecimal("Ingrese la calificacion 2");
        double calificacion3.PedirDecimal("Ingrese la calificacion 3");


        Alumno alumno=new Alumno ();
        

        pd.mostrarAlumnos();
        pd.calcularPromedio();
            
        } 
         System.out.print("Saliendo del programa");
    }while(opc !=2);
       

    




}
        

    }
