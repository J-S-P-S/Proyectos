package numerosparesimpares;

public class Operaciones {
    public void validar (int n){
        if (n % 2 == 0){
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar.");
        }
    }

}