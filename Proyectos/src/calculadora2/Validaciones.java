package calculadora2;


public class Validaciones {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public boolean validarEntrada(String a, String b) {
        //Se utiliza la conversión a entero por medio de la clase Integer y el método parseInt
        try {
            this.a = Integer.parseInt(a);
            this.b = Integer.parseInt(b);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validarEntrada2(String a) {
        //Se utiliza la conversión a entero por medio de la clase Integer y el método parseInt
        try {
            this.a = Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}