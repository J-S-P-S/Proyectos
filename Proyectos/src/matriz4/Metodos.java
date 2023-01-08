package matriz4;

import java.util.Random;

public class Metodos {

    private int[][] a; //Declarar Matriz A
    private int[][] b; //Declarar Matriz B

    private int[][] resultado;
    private StringBuilder sb;

    private StringBuilder sb2;

    private StringBuilder sb3;

    public Metodos() {

    }

    public Metodos(int f1, int c1, int f2, int c2) { //Ajustar las otras carpetas matriz si es con constructor borrar las variables
        a = new int[f1][c1];
        b = new int[f2][c2];
        resultado = new int[f1][c1];
        sb = new StringBuilder();
        sb2 = new StringBuilder();
        sb3 = new StringBuilder();
    }

    //Asignar elementos de la Matriz
    public void asignarMatriz() {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rd.nextInt(10);
                b[i][j] = rd.nextInt(10);
            }
        }
    }


    //Imprimir elementos de la Matriz
    public String imprimirMatrizFormato() {
        sb.setLength(0);    // limpiar el StringBuilder
        sb2.setLength(0);   // limpiar el StringBuilder
        sb.append("MATRIZ A\n");
        sb2.append("MATRIZ B\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (j == 0) {
                    sb.append("{").append(a[i][j]).append(", ");
                    sb2.append("{").append(b[i][j]).append(", ");
                } else if (j == a[0].length - 1) {
                    sb.append(a[i][j]).append("}");
                    sb2.append(b[i][j]).append("}");
                } else {
                    sb.append(a[i][j]).append(", ");
                    sb2.append(b[i][j]).append(", ");
                }
            }
            sb.append("\n");
            sb2.append("\n");
        }
        sb.append("\n").append(sb2.toString());
        return sb.toString();
    }

    public String imprimirMatrizResultado() {
        sb.setLength(0);
        sb2.setLength(0);
        sb3.setLength(0);
        sb.append("MATRIZ A\n");
        sb2.append("MATRIZ B\n");
        sb3.append("MATRIZ RESULTADO\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0) {
                    sb.append("{").append(a[i][j]).append(", ");
                    sb2.append("{").append(b[i][j]).append(", ");
                    sb3.append("{").append(resultado[i][j]).append(", ");
                } else if (j == a[0].length - 1) {
                    sb.append(a[i][j]).append("}");
                    sb2.append(b[i][j]).append("}");
                    sb3.append(resultado[i][j]).append("}");
                } else {
                    sb.append(a[i][j]).append(", ");
                    sb2.append(b[i][j]).append(", ");
                    sb3.append(resultado[i][j]).append(", ");
                }
            }
            sb.append("\n");
            sb2.append("\n");
            sb3.append("\n");
        }
        sb.append("\n").append(sb2.toString()).append("\n").append(sb3.toString());
        return sb.toString();
    }

    public String imprimirMatrizTraspuesta(int n) {
        sb.setLength(0);    // limpiar el StringBuilder

        if (n == 1) {
            sb.append("MATRIZ A \n");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j == 0) {
                        sb.append("{").append(a[i][j]).append(", ");
                    } else if (j == a[0].length - 1) {
                        sb.append(a[i][j]).append("}");
                    } else {
                        sb.append(a[i][j]).append(", ");
                    }
                }
                sb.append("\n");
            }

        } else {
            sb.append("MATRIZ B \n");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    if (j == 0) {
                        sb.append("{").append(b[i][j]).append(", ");
                    } else if (j == b[0].length - 1) {
                        sb.append(b[i][j]).append("}");
                    } else {
                        sb.append(b[i][j]).append(", ");
                    }
                }
                sb.append("\n");
            }

        }
        sb.append("\nMATRIZ TRASPUESTA\n");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                if (j == 0) {
                    sb.append("{").append(resultado[i][j]).append(", ");
                } else if (j == resultado[0].length - 1) {
                    sb.append(resultado[i][j]).append("}");
                } else {
                    sb.append(resultado[i][j]).append(", ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sumarMatriz() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];

            }
        }
    }

    public void restarMatriz() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    public void multiplicarMatriz() {
        int suma;
        for (int x = 0; x < b[0].length; x++) {
            for (int i = 0; i < a.length; i++) {
                suma = 0;
                for (int j = 0; j < a[0].length; j++) {
                    suma += a[i][j] * b[j][x];
                }
                resultado[i][x] = suma;
            }
        }
    }


    public void inversaMatriz() { // PENDIENTE PARA LOS CIFRADOS DE CESAR Y DE HILL
    }

    public void transpuesta(int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (n == 1) {
                    resultado[i][j] = a[j][i];
                } else {
                    resultado[i][j] = b[j][i];
                }
            }
        }
    }

}