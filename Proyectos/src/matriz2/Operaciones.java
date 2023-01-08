package matriz2;

public class Operaciones {

    private int[][] m; //Declarar una Matriz
    private int filas; //Atributo tipo final int para almacenar el tamaño filas que tendrá la matriz.
    private int columnas; //Atributo tipo final int para almacenar el tamaño columnas que tendrá la matriz.


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
    public void imprimirMatriz() {
        System.out.println("Matriz [" + filas + "][" + columnas + "]");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void imprimirMatrizFormato() {
        System.out.println("Matriz [" + filas + "][" + columnas + "]");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == 0) {
                    System.out.print("{" + m[i][j] + ", ");
                } else if (j == columnas - 1) {
                    System.out.print(m[i][j] + "}");
                } else {
                    System.out.print(m[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }

}