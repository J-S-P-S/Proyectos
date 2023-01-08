package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opc = 0;    // Variable se usa para recibir datos por consola y validar según corresponda el menú de opciones.
        int total;      // Variable utilizada para almacenar el valor de retorno de algunos métodos.
        String a, b;    // Se utilizan para validar los datos recibidos por consola.
        double r;       // Variable utilizada para almacenar el valor de retorno de algunos métodos.
        boolean v;      // Nos indica si los valores ingresados por consola son correctos, permiten continuar o salir del programa.

        Scanner leer = new Scanner(System.in);      //Se crea un objeto de la clase Scanner para poder recibir datos por consola.
        Validaciones val = new Validaciones();      //Se crea un objeto de la clase Validaciones para utilizar sus métodos y/o atributos.
        Operaciones op = new Operaciones();         //Se crea un objeto de la clase Métodos para utilizar sus métodos y/o atributos.
        FuncionesTrigo f = new FuncionesTrigo();    //Se crea un objeto de la clase FuncionesTrigo para utilizar sus métodos y/o atributos.

        //Mostrar por consola, las opciones del programa.
        System.out.println("""
                Menu del programa.
                1. Sumar (a+b)
                2. Restar (a-b)
                3. Multiplicar (a*b)
                4. Dividir (a/b)
                5. Residuo (a%b)
                6. Función seno
                7. Función coseno
                8. Función tangente
                9. Función cotangente
                10. Función secante
                11. Función cosecante
                12. Raíz cuadrada
                13. Factorial
                14. Potencia
                15. Salir""");
        //Validar datos recibidos por consola.
        try {
            System.out.println("Ingrese un número");
            opc = leer.nextInt();
        } catch (Exception e) {
            System.err.println("Error!, por favor ingrese un número");
            System.exit(1);
        }
        //Ingresar a la opción según corresponda
        switch (opc) {
            case 1 -> { //Bloque de código para efectuar una suma
                System.out.println("Ingrese número 1");
                a = leer.next();
                System.out.println("Ingrese número 2");
                b = leer.next();
                v = val.validarEntrada(a, b); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    total = op.suma(val.getA(), val.getB()); //Método suma.
                    System.out.println("Resultado de la suma = " + total);
                } else {
                    System.exit(-1);
                }
            }
            case 2 -> { //Bloque de código para efectuar una resta
                System.out.println("Ingrese número 1");
                a = leer.next();
                System.out.println("Ingrese número 2");
                b = leer.next();
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    total = op.resta(val.getA(), val.getB()); //Método resta
                    System.out.println("Resultado de la resta = " + total);
                } else {
                    System.exit(-1);
                }
            }
            case 3 -> { //Bloque de código para efectuar una multiplicación
                System.out.println("Ingrese número 1");
                a = leer.next();
                System.out.println("Ingrese número 2");
                b = leer.next();
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    total = op.multi(val.getA(), val.getB());   //Método multiplicación.
                    System.out.println("Resultado de la multiplicación = " + total);
                } else {
                    System.exit(-1);
                }
            }
            case 4 -> { //Bloque de código para efectuar una división
                System.out.println("Ingrese número 1");
                a = leer.next();
                System.out.println("Ingrese número 2");
                b = leer.next();
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    total = op.div(val.getA(), val.getB()); //Método división.
                    if (total == -1) {
                        System.err.println("Error!, no es posible dividir por cero");
                        System.exit(-1);
                    }
                    System.out.println("Resultado de la división = " + total);
                } else {
                    System.exit(-1);
                }
            }
            case 5 -> { //Bloque de código para efectuar la operación modulo
                System.out.println("Ingrese número 1");
                a = leer.next();
                System.out.println("Ingrese número 2");
                b = leer.next();
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    total = op.mod(val.getA(), val.getB()); //Método modulo.
                    if (total == -1) {
                        System.err.println("Error!, el segundo número debe ser diferente a cero.");
                        System.exit(-1);
                    }
                    System.out.println("El residuo es = " + total);
                } else {
                    System.exit(-1);
                }
            }
            case 6 -> { //Bloque de código para la función trigonométrica seno
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = f.seno(val.getA()); //Método función seno.
                    System.out.println("Seno: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 7 -> { //Bloque de código para la función trigonométrica coseno
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = f.coseno(val.getA());   //Método función coseno.
                    System.out.printf("Coseno: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 8 -> { //Bloque de código para la función trigonométrica tangente
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = f.tangente(val.getA()); //Método función tangente.
                    System.out.println("Tangente: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 9 -> { //Bloque de código para la función trigonométrica cotangente
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = f.cotangente(val.getA());   //Método función cotangente.
                    System.out.println("Cotangente: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 10 -> {    //Bloque de código para la función trigonométrica secante
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = f.secante(val.getA());  //Método función secante.
                    System.out.println("Secante: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 11 -> {    //Bloque de código para la función trigonométrica cosecante
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = f.cosecante(val.getA());    //Método función cosecante.
                    System.out.println("Cosecante: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 12 -> {    //Bloque de código para efectuar una raíz cuadrada
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = op.square(val.getA());  //Método raíz cuadrada.
                    System.out.printf("Raíz cuadrada: " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 13 -> {    //Bloque de código factorial
                System.out.println("Ingrese número 1");
                a = leer.next();
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    r = op.factorial(val.getA());   //Método factorial de un número.
                    System.out.println("Factorial de " + val.getA() + " = " + r);
                } else {
                    System.exit(-1);
                }
            }
            case 14 -> {    //Bloque de código potencia
                System.out.println("Ingrese número para la base");
                a = leer.next();
                System.out.println("Ingrese número para el exponente");
                b = leer.next();
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                leer.close();
                if (v) {
                    total = op.potencia(val.getA(), val.getB());    //Método potencia.
                    System.out.println("Base: " + val.getA() + ", exponente: " + val.getB()
                            + ", resultado = " + total);
                } else {
                    System.exit(-1);
                }
            }
            case 15 -> {    //Bloque de código para salir del programa
                leer.close();
                System.out.println("Programa finalizado.");
                System.exit(0);
            }
            default -> {    //Bloque de código opción por defecto
                leer.close();
                System.err.println("Error!, opción incorrecta. Programa finalizado.");
                System.exit(1);
            }
        }

    }
}