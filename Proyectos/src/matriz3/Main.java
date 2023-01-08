package matriz3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String f1,c1,t;
        boolean v;
        int f = 0;
        int c = 0;
        Validaciones val = new Validaciones();
        Operaciones op = new Operaciones();

        f1 = JOptionPane.showInputDialog(null,"Ingrese tamaño de las filas",
                "TAMAÑO FILAS",JOptionPane.INFORMATION_MESSAGE);
        c1 = JOptionPane.showInputDialog(null,"Ingrese tamaño de las columnas",
                "TAMAÑO COLUMNAS",JOptionPane.INFORMATION_MESSAGE);

        v = val.validarEntrada(f1,c1);

        if (v){
            f = Integer.parseInt(f1);
            c = Integer.parseInt(c1);
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese solamente valores numéricos.",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        op.iniciarMatriz(f,c);
        JOptionPane.showMessageDialog(null,"Matriz [" + f + "][" + c + "]",
                "DIMENSIONES MATRIZ",JOptionPane.INFORMATION_MESSAGE);

        t = op.imprimirMatriz();
        JOptionPane.showMessageDialog(null,t,
                "ELEMENTOS MATRIZ",JOptionPane.INFORMATION_MESSAGE);

        t = op.imprimirMatrizFormato();
        JOptionPane.showMessageDialog(null,t,
                "DIMENSIONES MATRIZ CON FORMATO",JOptionPane.INFORMATION_MESSAGE);

        op.asignarMatriz();
        t = op.imprimirMatriz();
        JOptionPane.showMessageDialog(null,t,
                "VALORES ASIGNADOS MATRIZ",JOptionPane.INFORMATION_MESSAGE);

        t = op.imprimirMatrizFormato();
        JOptionPane.showMessageDialog(null,t,
                "VALORES ASIGNADOS MATRIZ CON FORMATO",JOptionPane.INFORMATION_MESSAGE);
    }
}