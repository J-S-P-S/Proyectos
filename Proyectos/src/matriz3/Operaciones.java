package matriz3;

public class Operaciones {

    private int[][] m; //Declarar una Matriz
    private int filas; //Atributo tipo final int para almacenar el tamaño filas que tendrá la matriz.
    private int columnas; //Atributo tipo final int para almacenar el tamaño columnas que tendrá la matriz.

    private String t = "";

    //Método iniciarMatriz, se utiliza para iniciar los elementos de la matriz
    public void iniciarMatriz(int f, int c) {
        m = new int[f][c];
        filas = m.length;
        columnas = m[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                m[i][j] = 0;
            }
        }
    }

    //Asignar elementos de la Matriz
    public void asignarMatriz() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = 1 + j;
            }
        }
    }


    //Imprimir elementos de la Matriz
    public String imprimirMatriz() {
        t = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                t += m[i][j] + "\t";
            }
            t += "\n";
        }
        return t;
    }

    public String imprimirMatrizFormato() {
        t = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == 0) {
                    t += "{" + m[i][j] + ", ";
                } else if (j == columnas - 1) {
                    t += m[i][j] + "}";
                } else {
                    t += m[i][j] + ", ";
                }
            }
            t += "\n";
        }
        return t;
    }

}