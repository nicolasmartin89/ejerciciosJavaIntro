import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe
 * mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ej04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en °C");
        Double gradosC = sc.nextDouble();

        Double gradosF = (32 + (9 * gradosC / 5));

        System.out.println(gradosC + "° Centigrados equivalen a " + gradosF + "° Farenheit");
        sc.close();
    }
}
