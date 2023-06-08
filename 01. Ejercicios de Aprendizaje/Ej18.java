// Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
// y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
// se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

public class Ej18 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        imprimirMatrizTranspuesta(matriz);
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void imprimirMatrizTranspuesta(int[][] matriz) {
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }

}
