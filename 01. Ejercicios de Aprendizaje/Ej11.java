import java.util.Scanner;

/**
 * Realizar un programa que pida dos números
 * enteros positivos por teclado y muestre por pantalla el siguiente menú:
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 * 
 * El usuario deberá elegir una opción y el programa deberá mostrar
 * el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5,
 * en vez de salir del programa directamente, se debe mostrar el
 * siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa
 * (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa,
 * caso contrario se vuelve a mostrar el menú.
 * 
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();
        Boolean salir = false;
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija su opción:");
            System.out.println(" ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("SUMA = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("RESTA = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("DIVISION = " + (num1 / num2));
                    break;
                case 5:
                    System.out.print("¿Esta seguro que desea salir del programa (S/N)? ");
                    char confirmacion = sc.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, elija una opcion valida.");
                    break;
            }

        } while (!salir);

        sc.close();
    }
}
