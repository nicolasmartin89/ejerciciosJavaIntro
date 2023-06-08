// Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
// Por ejemplo, si el cuadrado tiene 4 elementos por 
// lado se deberá dibujar lo siguiente:
// * * * *
// *     *
// *     *
// * * * *


import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos:");
        int elementos = sc.nextInt();
        sc.close();

        for (int i = 0; i < elementos; i++) {
            for (int j = 0; j < elementos; j++) {
            if (i==0 || i==elementos-1 || j==0 || j==elementos-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            
            }System.out.println("");
        }
    }
}

