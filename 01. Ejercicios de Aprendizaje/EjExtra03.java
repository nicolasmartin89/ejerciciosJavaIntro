// Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
// Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

import java.util.Scanner;

public class EjExtra03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una letra ");
        String letra = sc.nextLine();
        sc.close();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("NO es una vocal");
        }

    }
}
