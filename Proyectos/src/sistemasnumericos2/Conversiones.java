package sistemasnumericos2;

public class Conversiones {
    private int residuo, decimal, potencia, temp;
    private char c;
    private StringBuilder valor;

    public String decToBin(int n) {
        valor = new StringBuilder();
        if (n == 0 || n == 1) {
            valor.insert(0, n);
            return valor.toString();
        }

        while (n > 0) {
            //valor2 = n % 2 + valor2;
            valor.insert(0, n % 2);
            n /= 2;
        }
        return valor.toString();
    }

    public String decToctal(int n) {
        valor = new StringBuilder();
        char[] cOctal = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (n > 0) {
            residuo = n % 8;
            c = cOctal[residuo];
            valor.insert(0, c);
            n /= 8;
        }
        return valor.toString();
    }

    public String decToHex(int n) {
        valor = new StringBuilder();
        char[] cHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (n > 0) {
            residuo = n % 16;
            c = cHex[residuo];
            valor.insert(0, c);
            n /= 16;
        }
        return valor.toString();
    }

    public int binToDec(int n) {
        while (true) {
            if (n == 0) {
                break;
            } else {
                temp = n % 10;
                decimal += (temp * powBin(potencia));
                n /= 10;
                potencia++;
            }
        }
        return decimal;
    }

    public int octToDec(int octal) {
        while (true) {
            if (octal == 0) {
                break;
            } else {
                temp = octal % 10;
                decimal += (temp * powOctal(potencia));
                octal /= 10;
                potencia++;
            }
        }
        return decimal;
    }

    public int hexToDec(String n) {
        String vHex = "0123456789ABCDEF";
        n = n.toUpperCase();
        int pos;
        for (int i = 0; i < n.length(); i++) {
            c = n.charAt(i);
            pos = vHex.indexOf(c);
            decimal = (16 * decimal) + pos;
        }
        return decimal;
    }

    public int powBin(int e) { //exponente
        int r = 1;
        for (int i = 0; i < e; i++) {
            r *= 2; // base 2
        }
        return r;
    }

    public int powOctal(int e) { //exponente
        int r = 1;
        for (int i = 0; i < e; i++) {
            r *= 8; // base 8
        }
        return r;
    }
}