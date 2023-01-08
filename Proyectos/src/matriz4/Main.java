package matriz4;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String f1, f2, c1, c2, t;
        boolean v;
        int f3 = 0;
        int c3 = 0;
        int f4 = 0;
        int c4 = 0;
        Validaciones val = new Validaciones();

        f1 = JOptionPane.showInputDialog(null, "Filas matriz 1",
                "TAMAÑO FILAS MATRIZ 1", JOptionPane.INFORMATION_MESSAGE);
        c1 = JOptionPane.showInputDialog(null, "Columnas matriz 1",
                "TAMAÑO COLUMNAS MATRIZ 1", JOptionPane.INFORMATION_MESSAGE);

        f2 = JOptionPane.showInputDialog(null, "Filas matriz 2",
                "TAMAÑO FILAS MATRIZ 2", JOptionPane.INFORMATION_MESSAGE);
        c2 = JOptionPane.showInputDialog(null, "Columnas matriz 2",
                "TAMAÑO COLUMNAS MATRIZ 2", JOptionPane.INFORMATION_MESSAGE);

        v = val.validarEntrada(f1, c1, f2, c2);

        if (v) {
            f3 = Integer.parseInt(f1);
            c3 = Integer.parseInt(c1);
            f4 = Integer.parseInt(f2);
            c4 = Integer.parseInt(c2);
            if (!(f3 >= 2 && f4 >= 2 && c3 >= 2 && c4 >= 2)) {
                JOptionPane.showMessageDialog(null, "Las 2 matrices deben ser cuadradas, mínimo de orden 2",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese solamente valores numéricos.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        Metodos ms = new Metodos(f3, c3, f4, c4);
        JOptionPane.showMessageDialog(null, "Matriz A = [" + f3 + "][" + c3 + "]\n"
                        + "Matriz B = [" + f4 + "][" + c4 + "]",
                "DIMENSIONES MATRIZ", JOptionPane.INFORMATION_MESSAGE);

        t = ms.imprimirMatrizFormato();
        JOptionPane.showMessageDialog(null, t,
                "INICIALIZAR MATRICES", JOptionPane.INFORMATION_MESSAGE);

        ms.asignarMatriz();
        t = ms.imprimirMatrizFormato();
        JOptionPane.showMessageDialog(null, t,
                "VALORES ASIGNADOS", JOptionPane.INFORMATION_MESSAGE);

        //Falta implementar método validar matriz cuadrada para hacer operaciones
        v = val.validarMatrizCuadrada(f3, c3, f4, c4);
        if (v) {
            //sumar y restar elementos de la matriz
            ms.sumarMatriz();
            t = ms.imprimirMatrizResultado();
            JOptionPane.showMessageDialog(null, t,
                    "MATRIZ SUMA", JOptionPane.INFORMATION_MESSAGE);

            ms.restarMatriz();
            t = ms.imprimirMatrizResultado();
            JOptionPane.showMessageDialog(null, t,
                    "MATRIZ RESTA", JOptionPane.INFORMATION_MESSAGE);

            ms.multiplicarMatriz();
            t = ms.imprimirMatrizResultado();
            JOptionPane.showMessageDialog(null, t,
                    "MATRIZ MULTIPLICAR", JOptionPane.INFORMATION_MESSAGE);

            //MATRIZ TRASPUESTA
            t = ms.imprimirMatrizFormato();
            f1 = JOptionPane.showInputDialog(null, t + "\n1.Transpuesta de matriz A\n"
                            + "2.Transpuesta de matriz B",
                    "SELECCIONAR OPCIÓN", JOptionPane.INFORMATION_MESSAGE);
            v = val.validarCaso(f1);
            if (v) {
                f3 = Integer.parseInt(f1);
                if (f3 == 1 || f3 == 2) {
                    ms.transpuesta(f3);
                    t = ms.imprimirMatrizTraspuesta(f3);
                    JOptionPane.showMessageDialog(null, t,
                            "MATRIZ TRASPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Opción incorrecta",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese solamente valores numéricos.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Las 2 matrices deben ser cuadradas",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

    }
}