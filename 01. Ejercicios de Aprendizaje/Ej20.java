// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
// donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
// Crear un programa que permita introducir un cuadrado por teclado y determine 
// si este cuadrado es mágico o no. El programa deberá comprobar que los números 
// introducidos son correctos, es decir, están entre el 1 y el 9.

import java.util.Scanner;

public class Ej20 {
    private static final int SIZE = 3;

    public static void main(String[] args) {
        int[][] cuadrado = new int[SIZE][SIZE];

        // Leer los números del cuadrado por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los números del cuadrado mágico (del 1 al 9):");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int numero;
                do {
                    numero = scanner.nextInt();
                    if (!esNumeroValido(numero)) {
                        System.out.println("Error: Los números deben estar entre 1 y 9. Inténtelo nuevamente:");
                    }
                } while (!esNumeroValido(numero));
                cuadrado[i][j] = numero;
            }
        }
        // Imprimir Matriz
        imprimirMatriz(cuadrado);

        // Verificar si es un cuadrado mágico
        if (esCuadradoMagico(cuadrado)) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
        scanner.close();
    }

    private static boolean esNumeroValido(int numero) {
        return numero >= 1 && numero <= 9;
    }

    private static boolean esCuadradoMagico(int[][] cuadrado) {
        int sumaObjetivo = calcularSumaObjetivo(cuadrado);

        // Verificar filas y columnas
        for (int i = 0; i < SIZE; i++) {
            if (sumarFila(cuadrado, i) != sumaObjetivo || sumarColumna(cuadrado, i) != sumaObjetivo) {
                return false;
            }
        }

        // Verificar diagonales
        return sumarDiagonalPrincipal(cuadrado) == sumaObjetivo && sumarDiagonalSecundaria(cuadrado) == sumaObjetivo;
    }

    private static int calcularSumaObjetivo(int[][] cuadrado) {
        // La suma objetivo es la suma de cualquier fila, columna o diagonal
        return sumarFila(cuadrado, 0);
    }

    private static int sumarFila(int[][] cuadrado, int fila) {
        int sumaFila = 0;
        for (int j = 0; j < SIZE; j++) {
            sumaFila += cuadrado[fila][j];
        }
        return sumaFila;
    }

    private static int sumarColumna(int[][] cuadrado, int columna) {
        int sumaColumna = 0;
        for (int i = 0; i < SIZE; i++) {
            sumaColumna += cuadrado[i][columna];
        }
        return sumaColumna;
    }

    private static int sumarDiagonalPrincipal(int[][] cuadrado) {
        int sumaDiagonal = 0;
        for (int i = 0; i < SIZE; i++) {
            sumaDiagonal += cuadrado[i][i];
        }
        return sumaDiagonal;
    }

    private static int sumarDiagonalSecundaria(int[][] cuadrado) {
        int sumaDiagonal = 0;
        for (int i = 0; i < SIZE; i++) {
            sumaDiagonal += cuadrado[i][SIZE - 1 - i];
        }
        return sumaDiagonal;
    }

    public static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print("[" + matriz[i][j] + "]");
        }
        System.out.println("");
    }
}
}