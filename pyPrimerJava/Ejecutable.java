import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
// definir variables
        int dato;
        int cuadrado;
        System.out.println("Ingrese un número entero: ");
        Scanner entrada = new Scanner(System.in);//almacena el valor que ingresa el usuario
        //entrada del numero entero
        
        dato = entrada.nextInt();

        cuadrado = dato * dato;
        System.out.println("El cuadrado del numero es: " + cuadrado);
    }

}
