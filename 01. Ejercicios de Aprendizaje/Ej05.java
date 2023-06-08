import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ej05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int num = sc.nextInt();
        
        double doble = num*2;
        double triple = num*3;
        double raiz = Math.sqrt(num);

        System.out.println("El numero es: " + num);
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("La raiz es: " + raiz);
        sc.close();
    }
}
