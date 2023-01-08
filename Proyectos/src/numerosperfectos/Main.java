package numerosperfectos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        try {
            n = leer.nextInt();
        } catch (Exception e) {
            System.err.println("Ingrese un valor numérico");
            System.exit(1);
        }
        NPerfectos num = new NPerfectos();
        num.validar(n);
    }
}