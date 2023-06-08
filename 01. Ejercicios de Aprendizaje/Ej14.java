// Crea una aplicación que a través de una 
// función nos convierta una cantidad de euros
// introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
// La función tendrá como parámetros, la cantidad de euros y la moneda a converir
// que será una cadena, este no devolverá ningún valor
// y mostrará un mensaje indicando el cambio (void).
// El cambio de divisas es:
// * 0.86 libras es un 1 €
// * 1.28611 $ es un 1 €
// * 129.852 yenes es un 1 €

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de moneda a convertir (dolares, yenes, libras)");
        String moneda = sc.nextLine();
        System.out.println("Ingresa la cantidad de euros a convertir:");
        int euros = sc.nextInt();

        sc.close();

        conversorDeMoneda(euros, moneda);
    }

    public static void conversorDeMoneda(int euros, String moneda) {
        switch (moneda) {
            case "libras":
                System.out.println(euros + " convertido a libras es = " + euros * 0.86);
                break;
            case "dolares":
                System.out.println(euros + " convertido a libras es = " + euros * 1.28611);
                break;
            case "yenes":
                System.out.println(euros + " convertido a libras es = " + euros * 129.852);
                break;
            default:
                System.out.println("Ingresaste una moneda invalida");
                break;
        }
    }
}
