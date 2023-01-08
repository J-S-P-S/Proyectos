package numerosperfectos;

import javax.swing.*;

public class NPerfectos {
    public void validar(int n) {
        int t = 0;
        String m;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                t += i;
            }
        }
        m = n == t ? "El número " + t + " es un número perfecto." : "El número " + n + " no es un número perfecto.";
        System.out.println(m);
    }

    public void validar2(int n) {
        int t = 0;
        String m;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                t += i;
            }
        }
        m = n == t ? "El número " + t + " es un número perfecto." : "El número " + n + " no es un número perfecto.";
        JOptionPane.showMessageDialog(null,m,"MENSAJE",1);
    }

}