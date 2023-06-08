// Declarar cuatro variables de tipo entero A, B, C y D y 
// asignarle un valor diferente a cada una. A continuación, realizar las 
// instrucciones necesarias para que: B tome el valor de C, C tome el 
// valor de A, A tome el valor de D y D tome el valor de B. 
// Mostrar los valores iniciales y los valores finales de cada variable.
// Utilizar sólo una variable auxiliar.

public class EjExtra02 {
    public static void main(String[] args) {
        int A = 1; //D 4
        int B = 2; //C 3
        int C = 3; //A 1
        int D = 4; //B 2
        
        System.out.println("Variables originales");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);
        transformados(A, B, C, D);
    }
    
    public static void transformados(int A, int B, int C, int D) {
        int aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Variables modificadas");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);


    }  
}
