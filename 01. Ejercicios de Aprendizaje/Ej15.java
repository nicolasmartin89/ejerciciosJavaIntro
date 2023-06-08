// Realizar un algoritmo que rellene un vector con 
// los 100 primeros números enteros y los muestre
// por pantalla en orden descendente.

public class Ej15 {
    public static void main(String[] args) {
        int [] vector = new int [101];
        rellenarVector(vector);
    }
    public static void rellenarVector(int [] vector) {
        for (int i = 1; i <= 100; i++) {
            vector[i]=i;
        }
        for (int i = 100; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
