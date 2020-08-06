
/**
 *
 * @author Agus Bute Clases Intro Progtamacion
 */
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        int num;
        //Entrada de datos
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        num = in.nextInt();
//Condicion que verifica si el numero es par o impar
        if (num % 2 == 0) {
            System.out.println("El número es PAR ");
        } else {
            System.out.println("El número es IMPAR");
        }
    }

}
