// Realice un programa que compruebe si una matriz dada es anti simétrica. 
// Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
// propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
// si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
// obtiene cambiando sus filas por columnas (o viceversa).

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        rellenarMatriz(matriz);
        
        
        esAntisimetrica(matriz);
    }

    public static void rellenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa el valor de la matriz en la posición: "+i + " " +j);
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void esAntisimetrica(int[][] matriz) {
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz Transpuesta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == (matriz[j][i]*-1)) {
                    System.out.println("La matriz es ANTISIMETRICA");
                }
            }
        }
    }
}
