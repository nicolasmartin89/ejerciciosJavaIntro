import java.util.Scanner;

/**
Crear un programa que dado un numero determine si es par o impar.
*/

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("El numero: " + num + " es PAR");
        } else {
            System.out.println("El numero: " + num + " es IMPAR");
        }
        sc.close();
    }
}
