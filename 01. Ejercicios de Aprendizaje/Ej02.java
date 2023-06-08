import java.util.Scanner;

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
 * muestre por pantalla.
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Por si no lo sabias... tu nombre es: " + nombre);

        sc.close();
    }
}
