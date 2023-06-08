import java.util.Scanner;

/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y después toda en minúsculas. 
 Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ej03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una Frase");
        String frase = sc.nextLine();
       
        System.out.println("MAYúSCULAS -> " + frase.toUpperCase());
        System.out.println(" ");
        System.out.println("minúsculas -> " + frase.toLowerCase());

        sc.close();
    }
}
