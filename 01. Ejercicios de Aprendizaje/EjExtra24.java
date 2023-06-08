import java.util.Scanner;

public class EjExtra24 {
    public static void main(String[] args) {
        int N = getNumberOfElements();
        long[] fibonacciNumbers = generateFibonacciSequence(N);
        System.out.println("Los " + N + " primeros números de la sucesión de Fibonacci son:");
        printArray(fibonacciNumbers);
    }

    private static int getNumberOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci que desea generar: ");
        int N = scanner.nextInt();
        scanner.close();
        return N;
    }

    private static long[] generateFibonacciSequence(int N) {
        long[] fibonacciNumbers = new long[N];
        fibonacciNumbers[0] = 0; // Primer número de Fibonacci
        fibonacciNumbers[1] = 1; // Segundo número de Fibonacci

        for (int i = 2; i < N; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers;
    }

    private static void printArray(long[] array) {
        for (long number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
