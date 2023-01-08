package sistemasnumericos3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String opc;
        int resultado, n;
        String r, sn;
        boolean retorno;

        JOptionPane.showMessageDialog(null,"Programa conversion de sistemas numéricos."
                ,"BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);

        opc = JOptionPane.showInputDialog(null,"""
                \s
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
                12. Convertir hexadecimal a octal""", "OPCIONES",JOptionPane.QUESTION_MESSAGE);


        Validaciones v = new Validaciones();
        Conversiones c = new Conversiones();

        if(opc == null) {
            JOptionPane.showMessageDialog(null,"Programa cancelado."
                    ,"FINALIZAR!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }

        switch (opc) {
            case "1" -> { //Convertir decimal a binario
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"DECIMAL A BINARIO",JOptionPane.QUESTION_MESSAGE);
                retorno = v.validarDecimal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    r = c.decToBin(n);
                    JOptionPane.showMessageDialog(null,"Decimal " + sn + ", binario: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"El valor ingresado en incorrecto."
                            ,"ERROR!",JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            }
            case "2" -> { //Convertir decimal a octal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        , "DECIMAL A OCTAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarOctal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    r = c.decToctal(n);
                    JOptionPane.showMessageDialog(null,"Decimal " + sn + ", octal: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "3" -> { //Convertir decimal a hexadecimal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"DECIMAL A HEXADECIMAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarHexadecimal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    r = c.decToHex(n);
                    JOptionPane.showMessageDialog(null,"Decimal " + sn + ", hexadecimal: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "4" -> { //Convertir Binario a decimal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"BINARIO A DECIMAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarBinario(sn);
                if (retorno){
                    n = Integer.parseInt(sn);
                    resultado = c.binToDec(n);
                    JOptionPane.showMessageDialog(null,"Binario " + sn + ", decimal: " + resultado
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "5" -> { //Convertir Binario a octal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"BINARIO A OCTAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarBinario(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    resultado = c.binToDec(n);
                    r = c.decToctal(resultado);
                    JOptionPane.showMessageDialog(null,"Binario " + sn + ", octal: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "6" -> { //Convertir Binario a hexadecimal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"BINARIO A HEXADECIMAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarBinario(sn);
                if (retorno){
                    n = Integer.parseInt(sn);
                    resultado = c.binToDec(n);
                    r = c.decToHex(resultado);
                    JOptionPane.showMessageDialog(null,"Binario " + sn + ", hexadecimal: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "7" -> { //Convertir Octal a decimal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"OCTAL A DECIMAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarOctal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    resultado = c.octToDec(n);
                    JOptionPane.showMessageDialog(null,"Octal " + sn + ", decimal: " + resultado
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "8" -> { //Convertir Octal a binario
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"OCTAL A BINARIO",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarOctal(sn);
                if (retorno) {
                    n = Integer.parseInt(sn);
                    resultado = c.octToDec(n);
                    r = c.decToBin(resultado);
                    JOptionPane.showMessageDialog(null,"Octal " + sn + ", binario: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "9" -> { //Convertir Octal a hexadecimal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"OCTAL A HEXADECIMAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarOctal(sn);
                if (retorno){
                    n = Integer.parseInt(sn);
                    resultado = c.octToDec(n);
                    r = c.decToHex(resultado);
                    JOptionPane.showMessageDialog(null,"Octal " + sn + ", hexadecimal: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "10" -> { //Convertir Hexadecimal a decimal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"HEXADECIMAL A DECIMAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarHexadecimal(sn);
                if (retorno) {
                    resultado = c.hexToDec(sn);
                    JOptionPane.showMessageDialog(null,"Hexadecimal " + sn + ", decimal: " + resultado
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "11" -> { //Convertir Hexadecimal a binario
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"HEXADECIMAL A BINARIO",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarHexadecimal(sn);
                if (retorno){
                    resultado = c.hexToDec(sn);
                    r = c.decToBin(resultado);
                    JOptionPane.showMessageDialog(null,"Hexadecimal " + sn + ", binario: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            case "12" -> { //Convertir Hexadecimal a octal
                sn = JOptionPane.showInputDialog(null,"Ingrese un número"
                        ,"HEXADECIMAL A OCTAL",JOptionPane.QUESTION_MESSAGE);
                sn = sn.replaceAll(" ","");
                retorno = v.validarHexadecimal(sn);
                if (retorno) {
                    resultado = c.hexToDec(sn);
                    r = c.decToctal(resultado);
                    JOptionPane.showMessageDialog(null,"Hexadecimal " + sn + ", octal: " + r
                            ,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.exit(1);
                }
            }
            default -> { //En caso de ingresar otra opción, salir.
                JOptionPane.showMessageDialog(null,"Opción invalida."
                        ,"ERROR!",JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
    }
}