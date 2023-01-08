package matriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String f1,c1;
        boolean v;
        int f = 0;
        int c = 0;
        Scanner leer = new Scanner(System.in);
        Validaciones val = new Validaciones();


        System.out.println("Ingrese tamaño de las filas");
        f1 = leer.next();
        System.out.println("Ingrese tamaña de las columnas");
        c1 = leer.next();
        v = val.validarEntrada(f1,c1);

        if (v){
            f = Integer.parseInt(f1);
            c = Integer.parseInt(c1);
        } else {
            System.err.println("Error!, por favor ingrese solamente valores numéricos.");
            System.exit(1);
        }
        Operaciones op = new Operaciones(f,c);
        op.imprimirMatriz();
        op.imprimirMatrizFormato();
        op.asignarMatriz();
        op.imprimirMatriz();
        op.imprimirMatrizFormato();

    }
}