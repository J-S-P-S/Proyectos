package numerosperfectos;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        int n = 0;

        try {
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese un valor numérico","ERROR",0);
            System.exit(1);
        }
        NPerfectos num = new NPerfectos();
        num.validar2(n);
    }
}