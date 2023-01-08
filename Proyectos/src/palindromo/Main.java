package palindromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String n;
        Scanner leer = new Scanner(System.in);
        Operaciones op = new Operaciones();
        System.out.println("Ingrese un nombre o frase");
        n = leer.nextLine();
        op.darFormato(n);

    }
}