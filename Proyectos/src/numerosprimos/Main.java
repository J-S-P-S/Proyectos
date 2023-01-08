package numerosprimos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = 0;
        try {
             n = leer.nextInt();
             if( n <=1){
                 System.err.println("Ingrese un valor mayor a 1.");
                 System.exit(1);
             }
        }catch (Exception e){
            System.err.println("El valor ingresado es incorrecto!");
            System.exit(1);
        };

        Vector v = new Vector(n);
        v.iniciarVector();
        v.imprimirVector();
        v.contarDivisores();
        v.iniciarVector2();
        v.imprimirVector2();
        v.validar(n);
        v.comprobarValores(n);

    }
}