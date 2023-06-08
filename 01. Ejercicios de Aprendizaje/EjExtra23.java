// Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
// a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
// de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
// en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
// de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
// Finalmente imprima por pantalla la sopa de letras creada.
// Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
// funciones de Java substring(), Length() y Math.random().

import java.util.Scanner;

public class EjExtra23 {
    final static int N=20;
    final static int M=5;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String [] palabras = new String [M];
        String [][] sopa = new String [N][N];

        int i = 0;     
        do {
            System.out.println("Ingrese una palabra de entre 3 y 5 caracteres: ");
            String palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            
            if (palabra.length() >= 3 && palabra.length() <=5 ){
                palabras[i] = palabra;
            i++;
            } else {
            System.out.println("¡La palabra ingresada no corresponde con la longitud indicada! Por favor intente nuevamente.");
            }
        } while (i < M);
        leer.close();
        rellenarMatriz(sopa);
        
        for (i = 0; i < M; i++) {
            insertarPalabra(sopa, palabras[i]);
        }
        
        rellenarMatrizAleatorios(sopa);
        
        mostrarMatriz(sopa);
        
    }
    
    public static void rellenarMatriz(String[][] matriz) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = " ";
            }
        }
    }
    
    public static void insertarPalabra(String[][] matriz, String palabra) {
        int fila = numAleatorio(0, N - 1);
        
        for (int i = fila; i <= fila; i++) {
            for (int j = 0; j < palabra.length(); j++) {
                if (matriz[i][j].equals(" ")) {
                    matriz[i][j] = palabra.substring(j, j + 1);
                }
            }
        }
    }
    
    public static void rellenarMatrizAleatorios(String[][] matriz) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j].equals(" ")) {
                    matriz[i][j] = String.valueOf(numAleatorio(0, 9));
                }
            }
        }
    }
    
    public static int numAleatorio(int min, int max) {
        int aleatorio = (int) (Math.random() * (max - min + 1));
        return aleatorio;
    }
    
    public static void mostrarMatriz(String[][] matriz) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}