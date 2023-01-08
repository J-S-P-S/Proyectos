package calculadora2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opc;    // Variable se usa para recibir datos por consola y validar según corresponda el menú de opciones.
        int total;      // Variable utilizada para almacenar el valor de retorno de algunos métodos.
        String a, b, c;    // Se utilizan para validar los datos recibidos por consola.
        double r;       // Variable utilizada para almacenar el valor de retorno de algunos métodos.
        boolean v;      // Nos indica si los valores ingresados por consola son correctos, permiten continuar o salir del programa.

        Validaciones val = new Validaciones();      //Se crea un objeto de la clase Validaciones para utilizar sus métodos y/o atributos.
        Operaciones op = new Operaciones();         //Se crea un objeto de la clase Métodos para utilizar sus métodos y/o atributos.
        FuncionesTrigo f = new FuncionesTrigo();    //Se crea un objeto de la clase FuncionesTrigo para utilizar sus métodos y/o atributos.

        //Mostrar por consola, las opciones del programa.
        c = JOptionPane.showInputDialog(null,
                """
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
                        15. Salir
                        Ingrese un número""", "MENÚ DEL PROGRAMA", JOptionPane.QUESTION_MESSAGE);
        //Validar datos recibidos por consola.
        v = val.validarEntrada2(c);
        if (!(v)) {
            JOptionPane.showMessageDialog(null,
                "Por favor ingrese un valor numérico.",
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        opc = val.getA();

        //Ingresar a la opción según corresponda
        switch (opc) {
            case 1 -> { //Bloque de código para efectuar una suma
                a = JOptionPane.showInputDialog(null, "Numero 1", "VALOR 1", JOptionPane.QUESTION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "Numero 2", "VALOR 2", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada(a, b); //Método para validar datos ingresados por consola.
                if (v) {
                    total = op.suma(val.getA(), val.getB()); //Método suma.
                    JOptionPane.showMessageDialog(null, "Resultado de la suma = " + total, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El/los valor/es ingresado/os es/son incorrecto/os", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 2 -> { //Bloque de código para efectuar una resta
                a = JOptionPane.showInputDialog(null, "Numero 1", "VALOR 1", JOptionPane.QUESTION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "Numero 2", "VALOR 2", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                if (v) {
                    total = op.resta(val.getA(), val.getB()); //Método resta
                    JOptionPane.showMessageDialog(null, "Resultado de la resta = " + total, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El/los valor/es ingresado/os es/son incorrecto/os", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 3 -> { //Bloque de código para efectuar una multiplicación
                a = JOptionPane.showInputDialog(null, "Numero 1", "VALOR 1", JOptionPane.QUESTION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "Numero 2", "VALOR 2", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                if (v) {
                    total = op.multi(val.getA(), val.getB());   //Método multiplicación.
                    JOptionPane.showMessageDialog(null, "Resultado de la multiplicación = " + total, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El/los valor/es ingresado/os es/son incorrecto/os", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 4 -> { //Bloque de código para efectuar una división
                a = JOptionPane.showInputDialog(null, "Numero 1", "VALOR 1", JOptionPane.QUESTION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "Numero 2", "VALOR 2", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                if (v) {
                    total = op.div(val.getA(), val.getB()); //Método división.
                    if (total == -1) {
                        JOptionPane.showMessageDialog(null, "Error!, no es posible dividir por cero", "ERROR", JOptionPane.ERROR_MESSAGE);
                        System.exit(-1);
                    }
                    JOptionPane.showMessageDialog(null, "Resultado de la división = " + total, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El/los valor/es ingresado/os es/son incorrecto/os", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 5 -> { //Bloque de código para efectuar la operación modulo
                a = JOptionPane.showInputDialog(null, "Numero 1", "VALOR 1", JOptionPane.QUESTION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "Numero 2", "VALOR 2", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                if (v) {
                    total = op.mod(val.getA(), val.getB()); //Método modulo.
                    if (total == -1) {
                        JOptionPane.showMessageDialog(null, "Error!, el segundo número debe ser diferente a cero.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        System.exit(-1);
                    }
                    JOptionPane.showMessageDialog(null, "El residuo es = " + total, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El/los valor/es ingresado/os es/son incorrecto/os", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 6 -> { //Bloque de código para la función trigonométrica seno
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR EN GRADOS", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = f.seno(val.getA()); //Método función seno.
                    JOptionPane.showMessageDialog(null, "Seno: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 7 -> { //Bloque de código para la función trigonométrica coseno
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR EN GRADOS", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = f.coseno(val.getA());   //Método función coseno.
                    JOptionPane.showMessageDialog(null, "Coseno: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 8 -> { //Bloque de código para la función trigonométrica tangente
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR EN GRADOS", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = f.tangente(val.getA()); //Método función tangente.
                    JOptionPane.showMessageDialog(null, "Tangente: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 9 -> { //Bloque de código para la función trigonométrica cotangente
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR EN GRADOS", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = f.cotangente(val.getA());   //Método función cotangente.
                    JOptionPane.showMessageDialog(null, "Cotangente: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 10 -> {    //Bloque de código para la función trigonométrica secante
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR EN GRADOS", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = f.secante(val.getA());  //Método función secante.
                    JOptionPane.showMessageDialog(null, "Secante: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 11 -> {    //Bloque de código para la función trigonométrica cosecante
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR EN GRADOS", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = f.cosecante(val.getA());    //Método función cosecante.
                    JOptionPane.showMessageDialog(null, "Cosecante: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 12 -> {    //Bloque de código para efectuar una raíz cuadrada
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR ENTERO", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = op.square(val.getA());  //Método raíz cuadrada.
                    JOptionPane.showMessageDialog(null, "Raíz cuadrada: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 13 -> {    //Bloque de código factorial
                a = JOptionPane.showInputDialog(null, "Ingrese un numero", "VALOR ENTERO", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada2(a); //Método para validar datos ingresados por consola.
                if (v) {
                    r = op.factorial(val.getA());   //Método factorial de un número.
                    JOptionPane.showMessageDialog(null, "Factorial: " + r, "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error!, por favor ingrese un número", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 14 -> {    //Bloque de código potencia
                a = JOptionPane.showInputDialog(null, "Base", "VALOR 1", JOptionPane.QUESTION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "Exponente", "VALOR 2", JOptionPane.QUESTION_MESSAGE);
                v = val.validarEntrada(a, b);   //Método para validar datos ingresados por consola.
                if (v) {
                    total = op.potencia(val.getA(), val.getB());    //Método potencia.
                    JOptionPane.showMessageDialog(null, "Base: " + val.getA()
                                    + ", exponente: " + val.getB() + ", resultado = " + total,
                            "RESPUESTA", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El/los valor/es ingresado/os es/son incorrecto/os", "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.exit(-1);
                }
            }
            case 15 -> {    //Bloque de código para salir del programa
                JOptionPane.showMessageDialog(null, "Programa finalizado.", "SALIR", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            default -> {    //Bloque de código opción por defecto
                JOptionPane.showMessageDialog(null, "Error!, opción incorrecta. Programa finalizado.", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
    }
}