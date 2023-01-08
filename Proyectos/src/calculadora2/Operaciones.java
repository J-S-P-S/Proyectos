package calculadora2;

public class Operaciones {

    public int suma(int a, int b) {
        a += b;
        return a;
    }

    public int resta(int a, int b) {
        a -= b;
        return a;
    }

    public int multi(int a, int b) {
        a *= b;
        return a;
    }

    public int div(int a, int b) {
        if (b == 0) {
            return -1;
        }

        a /= b;

        return a;
    }

    public int mod(int a, int b) {
        int r, c;
        if (b == 0) {
            return -1;
        } if (a >=0 && b>0 || a <= 0 && b<0){ //(a >=0 && b>0 || a <= 0 && b<0)
            c = a/b;
            r = a - (b*c);
            return r;
        } else if (a<0 && b>0 || a>=0 && b<0){ //(a<0 && b>0 || a>=0 && b<0)
            c = (a/b) - 1;
            r = a - (b*c);
            return r;
        }else {
            c = a/b;
            r = a - (b*c);
            return r;
        }
    }

    public double square(int a){ //raíz cuadrada
        double r;
        r = Math.sqrt(a);
        return r;
    }

    public double factorial(int a){
        double r = 1;
        for (int i = a; i > 0 ; i--) {
            r *= i;
        }
        return r;
    }

    public int potencia(int a, int b){
        int r = 1;
        for (int i = 0; i < b; i++) {
            r *= a;
        }
        return r;
    }


}