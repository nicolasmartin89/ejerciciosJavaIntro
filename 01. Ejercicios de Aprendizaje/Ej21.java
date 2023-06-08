// Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 
// y la matriz P de 3x3, se solicita escribir un programa en el cual se 
// compruebe si la matriz P está contenida dentro de la matriz M. 
// Para ello se debe verificar si entre todas las submatrices de 3x3 
// que se pueden formar en la matriz M, desplazándose por filas o columnas, 
// existe al menos una que coincida con la matriz P. En ese caso, el programa 
// debe indicar la fila y la columna de la matriz M en la cual empieza 
// el primer elemento de la submatriz P.


public class Ej21 {
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];

        rellenarMatriz(M);
        rellenarMatriz(P);
        imprimirMatriz(M);
        System.out.println("");
        imprimirMatriz(P);
        System.out.println("");
        isSubmatrixContained(M, P);
    }

    
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
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
    public static boolean isSubmatrixContained(int[][] M, int[][] P) {
        int filasM = M.length;
        int columnasM = M[0].length;
        int filasP = P.length;
        int columnasP = P[0].length;

        // Comprobar si las dimensiones de las matrices son válidas
        if (filasM < filasP || columnasM < columnasP) {
            return false;
        }

        // Recorrer todas las submatrices de M de tamaño P
        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                // Comprobar si la submatriz actual coincide con P
                if (isSubmatrixMatch(M, P, i, j)) {
                    System.out.println("La matriz P está contenida en la matriz M.");
                    System.out.println("La submatriz P comienza en la fila " + i + ", columna " + j);
                    return true;
                }
            }
        }

        // Si no se encontró ninguna coincidencia
        System.out.println("La matriz P no está contenida en la matriz M.");
        return false;
    }

    // Función para comprobar si una submatriz de M coincide con P
    private static boolean isSubmatrixMatch(int[][] M, int[][] P, int filaIniciaCon, int columnaIniciaCon) {
        int filasP = P.length;
        int columnasP = P[0].length;

        // Comparar los elementos de la submatriz con P
        for (int i = 0; i < filasP; i++) {
            for (int j = 0; j < columnasP; j++) {
                if (M[filaIniciaCon + i][columnaIniciaCon + j] != P[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
