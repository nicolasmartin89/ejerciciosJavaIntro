import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de
los números introducidos supere el límite inicial.
*/

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor limíte positivo: ");
        int limite = sc.nextInt();
        System.out.println("Ingresa numeros: ");

        for (int i = 0; i < limite;) {
            int numero = sc.nextInt();
            i+=numero;
            System.out.println("La suma de los numeros es: " + i + " y el limite es " + limite);
        }
        sc.close();
    }
}
