package matriz5;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String f1, f2, c1, c2, t, op;
        boolean v;
        int f3 = 0;
        int c3 = 0;
        int f4 = 0;
        int c4 = 0;
        int opc;
        Validaciones val = new Validaciones();

        op = JOptionPane.showInputDialog(null
                , """
                        1. SUMAR MATRICES
                        2. RESTAR MATRICES
                        3. MULTIPLICAR MATRICES.
                        4. MATRIZ TRASPUESTA
                        5. SALIR
                        """, "MENU DE OPCIONES", JOptionPane.INFORMATION_MESSAGE);

        v = val.validarCaso(op);
        if (!(v)) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese solamente valores numéricos.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        opc = Integer.parseInt(op);
        if(opc == 5){
            JOptionPane.showMessageDialog(null, "Saliendo del programa",
                    "SALIR", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

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
        //Validar si la matriz es cuadrada
        v = val.validarMatrizCuadrada(f3, c3, f4, c4);
        if (!(v)) {
            JOptionPane.showMessageDialog(null, "Las 2 matrices deben ser cuadradas",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        Metodos ms = new Metodos(f3, c3, f4, c4);
        switch (opc) {
            case 1 -> { //Sumar
                //Mostrar por pantalla dimensiones de las 2 matrices
                JOptionPane.showMessageDialog(null, "Matriz A = [" + f3 + "][" + c3 + "]\n"
                                + "Matriz B = [" + f4 + "][" + c4 + "]",
                        "DIMENSIONES MATRIZ", JOptionPane.INFORMATION_MESSAGE);
                //Asignar y mostrar los elementos de las 2 matrices
                ms.asignarMatriz();
                t = ms.imprimirMatrizFormato();
                JOptionPane.showMessageDialog(null, t,
                        "VALORES ASIGNADOS", JOptionPane.INFORMATION_MESSAGE);
                //Método para sumar 2 matrices
                ms.sumarMatriz();
                t = ms.imprimirMatrizResultado();
                JOptionPane.showMessageDialog(null, t,
                        "MATRIZ SUMA", JOptionPane.INFORMATION_MESSAGE);
            }
            case 2 -> { //Restar
                //Mostrar por pantalla dimensiones de las 2 matrices
                JOptionPane.showMessageDialog(null, "Matriz A = [" + f3 + "][" + c3 + "]\n"
                                + "Matriz B = [" + f4 + "][" + c4 + "]",
                        "DIMENSIONES MATRIZ", JOptionPane.INFORMATION_MESSAGE);
                //Asignar y mostrar los elementos de las 2 matrices
                ms.asignarMatriz();
                t = ms.imprimirMatrizFormato();
                JOptionPane.showMessageDialog(null, t,
                        "VALORES ASIGNADOS", JOptionPane.INFORMATION_MESSAGE);
                //Método para restar 2 matrices
                ms.restarMatriz();
                t = ms.imprimirMatrizResultado();
                JOptionPane.showMessageDialog(null, t,
                        "MATRIZ RESTA", JOptionPane.INFORMATION_MESSAGE);
            }
            case 3 -> { //Multiplicar
                //Mostrar por pantalla dimensiones de las 2 matrices
                JOptionPane.showMessageDialog(null, "Matriz A = [" + f3 + "][" + c3 + "]\n"
                                + "Matriz B = [" + f4 + "][" + c4 + "]",
                        "DIMENSIONES MATRIZ", JOptionPane.INFORMATION_MESSAGE);
                //Asignar y mostrar los elementos de las 2 matrices
                ms.asignarMatriz();
                t = ms.imprimirMatrizFormato();
                JOptionPane.showMessageDialog(null, t,
                        "VALORES ASIGNADOS", JOptionPane.INFORMATION_MESSAGE);
                //Método para multiplicar 2 matrices
                ms.multiplicarMatriz();
                t = ms.imprimirMatrizResultado();
                JOptionPane.showMessageDialog(null, t,
                        "MATRIZ MULTIPLICAR", JOptionPane.INFORMATION_MESSAGE);
            }
            case 4 -> { //Traspuesta
                //Mostrar por pantalla dimensiones de las 2 matrices
                JOptionPane.showMessageDialog(null, "Matriz A = [" + f3 + "][" + c3 + "]\n"
                                + "Matriz B = [" + f4 + "][" + c4 + "]",
                        "DIMENSIONES MATRIZ", JOptionPane.INFORMATION_MESSAGE);
                //Asignar y mostrar los elementos de las 2 matrices
                ms.asignarMatriz();
                t = ms.imprimirMatrizFormato();
                JOptionPane.showMessageDialog(null, t,
                        "VALORES ASIGNADOS", JOptionPane.INFORMATION_MESSAGE);
                //Seleccionar 1 de las 2 matrices para realizar la traspuesta
                t = ms.imprimirMatrizFormato();
                f1 = JOptionPane.showInputDialog(null, t + "\n1.Transpuesta de matriz A\n"
                                + "2.Transpuesta de matriz B",
                        "SELECCIONAR OPCIÓN", JOptionPane.INFORMATION_MESSAGE);
                v = val.validarCaso(f1);
                if (v) { //Método matriz traspuesta
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
            }
            default -> { //En caso de otra opción salir.
                JOptionPane.showMessageDialog(null, "Opción incorrecta",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
    }
}