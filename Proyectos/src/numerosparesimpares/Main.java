package numerosparesimpares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones op = new Operaciones();
        System.out.println("Ingrese un número");
        int n = 0;
        try {
            n = leer.nextInt();
        }catch (Exception e) {
            System.err.println("El valor ingresado es incorrecto!");
            System.exit(1);
        }
        op.validar(n);
    }
}