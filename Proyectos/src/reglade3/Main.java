package reglade3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc;
        Scanner leer = new Scanner(System.in);
        Operaciones op = new Operaciones();
        try {
            System.out.println("Escriba un número \n1. Simple directa \n2. Simple inversa");
            opc = leer.nextInt();
            switch (opc) {
                case 1 -> {
                    op.iniciar();
                    op.SimpleDirecta();
                }
                case 2 -> {
                    op.iniciar();
                    op.SimpleInversa();
                }
                default -> {
                    System.err.println("Error, opción incorrecta.");
                    System.exit(1);
                }
            }
        }catch (Exception e){
            System.err.println("El valor ingresado es incorrecto!");
            System.exit(1);
        }

    }
}