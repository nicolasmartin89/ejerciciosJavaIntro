// Realizar un algoritmo que rellene un vector de tamaño N
// con valores aleatorios y le pida al usuario un numero a buscar en el vector.
// El programa mostrará donde se encuentra el numero y si se encuentra repetido

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int tamanioVector = sc.nextInt();
        int [] vector = new int [tamanioVector];
        System.out.println("Ingresa el numero que deseas buscar");
        int buscado = sc.nextInt();
        sc.close();
        rellenarVector(vector);
        imprimirVector(vector);
        buscarVector(vector, buscado);
    }
    public static void rellenarVector(int [] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10);
        }
    }
    public static void imprimirVector(int [] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    public static void buscarVector(int [] vector, int buscado) {
        for (int i = 0; i < vector.length; i++) {
            if (buscado == vector[i]) {
                System.out.println("Encontraste el numero y estaba en la posición: " + i);
            }
        }
    }
}
