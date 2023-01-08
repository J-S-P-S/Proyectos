package palindromo;

import java.text.Normalizer;

public class Operaciones {

    public void darFormato(String t) {
        String f;
        int tam;
        char[] c;
        f = Normalizer.normalize(t, Normalizer.Form.NFD); //https://loquemeinteresadelared.wordpress.com/2015/10/01/eliminar-acentos-y-diacriticos-de-un-string-en-java/
        f = f.replaceAll("\\p{InCombiningDiacriticalMarks}", ""); //Igual que la línea anterior validar ese link
        f = f.replaceAll("\\n\\r\\t", ""); // reemplazar todos los saltos de línea o retorno de carro por nada, eliminar saltos de línea, System.lineSeparator() tener en cuenta
        f = f.toLowerCase().replaceAll("[^a-zA-Z\u00f1\u00d1]", "");  // Utilizando una expresión regular para eliminar cualquier cosa
        // Que no sea letras de A-Z mayúsculas a-z minúsculas, \u00f1 y \u00d1 son el equivalente para "ñ" y "Ñ" https://www.aluracursos.com/blog/intercambiando-caracteres-de-una-stringen-java
        System.out.println("Nuevo formato: " + f);
        tam = f.length();
        c = f.toCharArray();
         comparar(c, tam);  //Ejecución de métodos concatenados o ejecución en cascada.
    }

    private void comparar(char[] c, int tam) {
        boolean v = true;
        for (int i = 0; i < tam; i++) {
            if (c[i] == c[tam - 1]) {
                tam--;
            } else {
                v = false;
                break;
            }
        }
        imprimir(v);    //Ejecución de métodos concatenados o ejecución en cascada.
    }

    private void imprimir(boolean v) {
        if (v) {
            System.out.println("Palabra o expresión, es palíndromo.");
        } else {
            System.out.println("Palabra o expresión. NO es palíndromo.");
        }
    }

}