// Dado un tiempo en minutos, calcular su equivalente en días y horas. 
// Por ejemplo, si el usuario ingresa 1600 minutos, el sistema 
// debe calcular su equivalente: 1 día, 2 horas.

import java.util.Scanner;

public class EjExtra01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el tiempo en minutos");
    int minutos = sc.nextInt();
    sc.close();
    int dias=(int)(minutos/1440);
    int horas=(int)((minutos%1440)/60);
    int minutosRestantes=minutos-(dias*1440)-(horas*60);
    System.out.println("Ingresaste estos minutos: " + minutos);

    System.out.println("Transformado da lo siguiente:");

    System.out.println(dias + " dias " + horas + " horas " + minutosRestantes + " minutos restantes ");
    }
}
