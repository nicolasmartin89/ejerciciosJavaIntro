// Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
// y se muestre su equivalente en romano.

import java.util.Scanner;

public class EjExtra04 {
    public static void main(String[] args) {
        int number = getNumberFromUser();
        String romanNumber = convertToRoman(number);
        System.out.println("El número " + number + " en números romanos es: " + romanNumber);
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);
        scanner.close();
        return number;
    }

    private static String convertToRoman(int number) {
        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romanNumerals[number - 1];
    }
}
