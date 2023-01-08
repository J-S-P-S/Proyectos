package reglade3;

import java.util.Scanner;

public class Operaciones {

    private int a = 0, b = 0, c = 0, opc = 0;
    private String at = "", bt = "", ct = "";
    private boolean vt1 , vt2 , vt3;

    public boolean vT1(String at) {
        boolean a = true;
        for (int i = 0; i < at.length(); i++) {
            if (!Character.isDigit(at.charAt(i))) {
                a = false;
            }
        }
        return a;
    }

    public boolean vT2(String bt) {
        boolean b = true;
        for (int i = 0; i < bt.length(); i++) {
            if (!Character.isDigit(bt.charAt(i))) {
                b = false;
            }
        }
        return b;
    }

    public boolean vT3(String ct) {
        boolean c = true;
        for (int i = 0; i < ct.length(); i++) {
            if (!Character.isDigit(ct.charAt(i))) {
                c = false;
            }
        }
        return c;
    }
    void iniciar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        this.a = leer.nextInt();
        System.out.println("Tipo 1");
        this.at = leer.next();
        System.out.println("Ingrese segundo valor");
        this.b = leer.nextInt();
        System.out.println("Tipo 2");
        this.bt = leer.next();
        System.out.println("Ingrese tercer valor");
        this.c = leer.nextInt();
        System.out.println("Tipo 3");
        this.ct = leer.next();
        this.vt1 = vT1(this.at);
        this.vt2 = vT2(this.bt);
        this.vt3 = vT3(this.ct);
        if((a <= 0) || (b <= 0) || (c <= 0)){
            System.err.println("Error!, los argumentos no pueden ser menores o iguales a 0");
            System.exit(1);
        } else if (vt1 || vt2 || vt3){
            System.err.println("Error!, los tipos no pueden numéricos");
            System.exit(1);
        }
    }
    void SimpleDirecta() {
        int x = 0;
        System.out.println("A = " + this.a + this.at + "\t--> \tB = " + this.b + this.bt);
        System.out.println("C = " + this.c + this.ct + "\t--> \tX = ?");
        x = (this.c * this.b) / this.a;
        System.out.println("X = (C x B)/A");
        System.out.println("X = " + x + this.bt);
    }

    void SimpleInversa() {
        int x = 0;
        System.out.println("A = " + this.a + this.at + "\t--> \tB = " + this.b + this.bt);
        System.out.println("C = " + this.c + this.ct + "\t--> \tX = ?");
        x = (this.a * this.b) / this.c;
        System.out.println("X = (A x B)/C");
        System.out.println("X = " + x + this.bt);
    }

}