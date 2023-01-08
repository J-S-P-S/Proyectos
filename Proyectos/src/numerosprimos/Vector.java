package numerosprimos;

public class Vector {

    private int[] div;
    private int[] res;
    private int c = 0;
    private int tam;

    public Vector(int tam) {
        this.tam = tam;
    }

    public void iniciarVector() {
        this.div = new int[this.tam];
        for (int i = 0; i < this.tam; i++) {
            this.div[i] = i + 1;
        }
    }

    public void imprimirVector() {
        System.out.print("Vector inicial: ");
        for (int i = 0; i < this.tam; i++) {
            if (i == 0) {
                System.out.print("{" + this.div[i] + ", ");
            } else if (i == 30) {
                System.out.println("... " + this.tam + "}");
                break;
            } else if (i == (this.div.length - 1)) {
                System.out.print(this.div[i] + "}");
            } else {
                System.out.print(this.div[i] + ", ");
            }
        }
        System.out.println();
    }

    public void contarDivisores() {
        for (int i = 0; i < this.tam; i++) {
            if (this.tam % div[i] == 0) {
                this.c++;
            }
        }
    }

    public void iniciarVector2() {
        this.res = new int[this.c];
        this.c = 0;
        for (int i = 0; i < this.tam; i++) {
            if (tam % div[i] == 0) {
                this.res[c++] = this.div[i];
            }
        }
    }

    public void imprimirVector2() {
        System.out.print("Divisores de " + this.tam + ": ");
        this.tam = this.res.length;
        for (int i = 0; i < this.tam; i++) {
            if (i == 0) {
                System.out.print("{" + this.res[i] + ", ");
            } else if (i == (this.res.length - 1)) {
                System.out.print(this.res[i] + "}");
            } else {
                System.out.print(this.res[i] + ", ");
            }
        }
        System.out.println();
    }

    public void validar(int n) {
        this.c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                this.c++;
            }
        }
        String m = (this.c == 2) ? n + " es primo, porque solo tiene 2 divisores 1 y " + n : n + " no es primo, porque tiene 3 o más divisores. Es un número compuesto por " + this.c + " divisores.";
        System.out.println("\n" + m);
    }

    public void comprobarValores(int n) {
        System.out.println("Comprobar vector resultado, multiplicando sus divisores.");
        if (this.tam % 2 == 0) {
            this.tam = this.tam / 2;
        } else {
            this.tam = (this.tam + 1) / 2;
        }

        this.c = (res.length - 1);
        for (int i = 0; i < tam; i++) {
            System.out.println(res[i] + " x " + res[c] + " = " + n);
            c--;
        }
    }


}