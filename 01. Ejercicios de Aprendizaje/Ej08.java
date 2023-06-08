import java.util.Scanner;

/**
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase magica de 8: ");
        String frase = sc.nextLine();

        if (frase.length()==8) {
            System.out.println("CORRECTO");
        }

        while (frase.length()!=8) {
            System.out.println("INCORRECTO");
            System.out.println("Ingresa nuevamente una frase: ");
            frase = sc.nextLine();

            if (frase.length()==8) {
                System.out.println("POR FIN! CORRECTO");
                break;
            }
        }
        
        
        sc.close();
    }
}
