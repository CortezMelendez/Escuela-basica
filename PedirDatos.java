import java.util.Scanner;
public class PedirDatos {

    private final Scanner sc;

    public PedirDatos(){
        this.sc = new Scanner(System.in);
    }

    public PedirDatos(Scanner sc){
        this.sc = sc;
    }
//Método para textos a cadenas
    public String pedirCadena(String mensaje){
        while(true){
            System.out.println(mensaje + ": ");
            String cadenaTemporal = sc.nextLine().trim();
            if(!cadenaTemporal.isEmpty()){
                return cadenaTemporal;
            }
            System.out.println("Error: El campo no puede estar vacio");
        }
    }
//Método para números enteros
public int pedirEntero(String mensaje){
    return pedirEntero(mensaje, 1, Integer.MAX_VALUE);
}

public int pedirEntero(String mensaje, int min, int max){
    while(true){
        System.out.println(mensaje + ": ");
        try {
            int numeroTemporal = Integer.parseInt(sc.nextLine().trim());
            if (numeroTemporal >= min && numeroTemporal <= max){
                return numeroTemporal;
            }
            System.out.println("Error: el numero debe estar entre " + min + " y " + max);
        } catch (NumberFormatException e){
            System.out.println("Entrada invalida, por favor ingresa un numero entero");
        }
    }
}
//Metodo para numeros decimales
public double pedirDecimal(String mensaje){
    return pedirDecimal(mensaje, 0.01, Double.MAX_VALUE);
}
public double pedirDecimal(String mensaje, double min, double max){
    while (true){
        System.out.println(mensaje + ": ");
        try{
            double numeroTemporal = Double.parseDouble(sc.nextLine().trim().replace(": ", ": "));
            if (numeroTemporal >= min && numeroTemporal <= max){
                return numeroTemporal;
            }
            System.out.println("Error: el numero debe estar entre "+ min + " y " + max);
        } catch (NumberFormatException e){
            System.out.println("Entrada invalida, por favor ingresa un numero entero");
        }
    }
}

public boolean pedirDato(String mensaje){
    while (true){
        System.out.println(mensaje);
        String leer = sc.nextLine().trim().toLowerCase();

        if (leer.equals("verdadero")||leer.equals("si")||leer.equals("SI")||leer.equals("S")||leer.equals("")||leer.equals("yes")){
            return true;
        }
        else if (leer.equals("false") || leer.equals("no") || leer.equals("n")|| leer.equals("NO")){
            return false;
        }
        else {
            System.out.println("Entrada inválida. Escribe si/no o verdadero/falso.");
        }
    }
}
}