package capicua;

public class Operaciones {

    public void darFormato(String n) {
        int t;
        char[] c;
        n = n.replaceAll("[^0-9]+", "");  // Utilizando una expresión regular para eliminar cualquier cosa
        // Que no sea un valor numérico, https://www.aluracursos.com/blog/intercambiando-caracteres-de-una-stringen-java
        System.out.println("Número final después del formato: " + n);
        t = n.length();
        c = n.toCharArray();
        comparar(t, c); //Ejecución de métodos concatenados o ejecución en cascada.
    }

    private void comparar(int t, char[] c) {
        boolean v = true;
        for (int i = 0; i < t; i++) {
            if (c[i] == c[t - 1]) {
                t--;
            } else {
                v = false;
                break;
            }
        }
        imprimir(v); //Ejecución de métodos concatenados o ejecución en cascada.
    }

    private void imprimir(boolean v) {
        if (v) {
            System.out.println("El número es una Capicúa.");
        } else {
            System.out.println("El número no es una Capicúa.");
        }
    }

}