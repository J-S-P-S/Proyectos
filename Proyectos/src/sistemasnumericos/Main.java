package sistemasnumericos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc = 0;
        int resultado, n;
        String r, sn;
        boolean retorno;

        System.out.println("Bienvenido al programa\nConversion de sistemas numéricos.");
        System.out.println("""
                Menu del programa.\s
                1. Convertir decimal a binario
                2. Convertir decimal a octal
                3. Convertir decimal a hexadecimal
                4. Convertir binario a decimal
                5. Convertir binario a octal
                6. Convertir binario a hexadecimal
                7. Convertir octal a decimal
                8. Convertir octal a binario
                9. Convertir octal a hexadecimal
                10. Convertir hexadecimal a decimal
                11. Convertir hexadecimal a binario
                12. Convertir hexadecimal a octal""");

        System.out.println("Por favor ingrese un número");
        Scanner leer = new Scanner(System.in);
        Validaciones v = new Validaciones();
        Conversiones c = new Conversiones();

        try {
            opc = leer.nextInt();
        } catch (Exception e) {
            System.err.println("Error!, el valor ingresado es incorrecto.");
            System.exit(1);
        }

        switch (opc) {
            case 1 -> { //Convertir decimal a binario
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarDecimal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    r = c.decToBin(n);
                    System.out.println("Decimal " + sn + ", binario: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 2 -> { //Convertir decimal a octal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarOctal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    r = c.decToctal(n);
                    System.out.println("Decimal " + sn + ", octal: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 3 -> { //Convertir decimal a hexadecimal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarHexadecimal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    r = c.decToHex(n);
                    System.out.println("Decimal " + sn + ", hexadecimal: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 4 -> { //Convertir Binario a decimal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarBinario(sn);
                if (retorno){
                    n = Integer.parseInt(sn);
                    resultado = c.binToDec(n);
                    System.out.println("Binario " + sn + ", decimal: " + resultado);
                } else {
                    System.exit(1);
                }
            }
            case 5 -> { //Convertir Binario a octal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarBinario(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    resultado = c.binToDec(n);
                    r = c.decToctal(resultado);
                    System.out.println("Binario " + sn + ", octal: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 6 -> { //Convertir Binario a hexadecimal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarBinario(sn);
                if (retorno){
                    n = Integer.parseInt(sn);
                    resultado = c.binToDec(n);
                    r = c.decToHex(resultado);
                    System.out.println("Binario " + sn + ", hexadecimal: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 7 -> { //Convertir Octal a decimal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarOctal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    resultado = c.octToDec(n);
                    System.out.println("Octal " + sn + ", decimal: " + resultado);
                } else {
                    System.exit(1);
                }
            }
            case 8 -> { //Convertir Octal a binario
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarOctal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    resultado = c.octToDec(n);
                    r = c.decToBin(resultado);
                    System.out.println("Octal " + sn + ", binario: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 9 -> { //Convertir Octal a hexadecimal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarOctal(sn);
                if (retorno){
                    n = Integer.parseInt(sn);
                    resultado = c.octToDec(n);
                    r = c.decToHex(resultado);
                    System.out.println("Octal " + sn + ", hexadecimal: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 10 -> { //Convertir Hexadecimal a decimal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarHexadecimal(sn);
                if (retorno) {
                    resultado = c.hexToDec(sn);
                    System.out.println("Hexadecimal " + sn + ", decimal: " + resultado);
                } else {
                    System.exit(1);
                }
            }
            case 11 -> { //Convertir Hexadecimal a binario
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarHexadecimal(sn);
                if (retorno){
                    resultado = c.hexToDec(sn);
                    r = c.decToBin(resultado);
                    System.out.println("Hexadecimal " + sn + ", binario: " + r);
                } else {
                    System.exit(1);
                }
            }
            case 12 -> { //Convertir Hexadecimal a octal
                System.out.println("Ingrese un número");
                sn = leer.next();
                retorno = v.validarHexadecimal(sn);
                if (retorno) {
                    resultado = c.hexToDec(sn);
                    r = c.decToctal(resultado);
                    System.out.println("Hexadecimal " + sn + ", octal: " + r);
                } else {
                    System.exit(1);
                }
            }
            default -> { //En caso de ingresar otra opción, salir.
                System.err.println("Error!, opción invalida.");
                System.exit(1);
            }
        }

    }
}