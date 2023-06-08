import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado
 * y calcule la suma de los dos. El programa deberá después mostrar
 * el resultado de la suma
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero:");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);

        sc.close();
    }
}
