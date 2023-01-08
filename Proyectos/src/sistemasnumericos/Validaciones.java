package sistemasnumericos;

public class Validaciones {

    private int t;
    private char c;

    public boolean validarDecimal(String num) {         //Validar si la entrada por consola es un número.
        try {
            Integer.parseInt(num);
            return true;
        } catch (Exception e) {
            System.err.println("Error!, el valor ingresado en incorrecto.");
            return false;
        }
    }

    public boolean validarBinario(String n) {           //Validar si la entrada por consola es un binario.
        t = n.length();
        for (int i = 0; i < t; i++) {
            c = n.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public boolean validarOctal(String n) {             //Validar si la entrada por consola es un octal.
        t = n.length();
        String vOctal = "01234567";
        for (int i = 0; i < t; i++) {
            c = n.charAt(i);
            if (vOctal.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean validarHexadecimal(String n) {       //Validar si la entrada por consola es un hexadecimal.
        t = n.length();
        String vHex = "0123456789ABCDEF";
        for (int i = 0; i < t; i++) {
            c = n.charAt(i);
            if (vHex.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}