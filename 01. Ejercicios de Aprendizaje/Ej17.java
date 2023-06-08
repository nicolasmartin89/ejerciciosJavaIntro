// Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
// cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

import java.util.Random;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int tamanioVector = sc.nextInt();
        int[] vector = new int[tamanioVector];

        sc.close();
        rellenarVectorConAleatorios(vector);
        imprimirVector(vector);
        buscarVector(vector);
    }

    public static void rellenarVectorConAleatorios(int[] vector) {
        Random rnd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(100000) ;
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }

    public static void buscarVector(int[] vector) {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        for (int i = 0; i < vector.length; i++) {
            String numCadena = String.valueOf(vector[i]);
            switch (numCadena.length()) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Cantidad de numeros de 1 cifra: "+ contador1);
        System.out.println("Cantidad de numeros de 2 cifras: "+ contador2);
        System.out.println("Cantidad de numeros de 3 cifras: "+ contador3);
        System.out.println("Cantidad de numeros de 4 cifras: "+ contador4);
        System.out.println("Cantidad de numeros de 5 cifras: "+ contador5);

    }

}
