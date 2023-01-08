package calculadora2;

public class FuncionesTrigo {

    private double r; //almacenar resultado

    public double seno(double a){
        r = Math.toRadians(a);
        r = Math.sin(r);
        return r;
    }

    public double coseno(double a){
        r = Math.toRadians(a);
        r = Math.cos(r);
        return r;
    }

    public double tangente(double a){
        r = Math.toRadians(a);
        r = Math.tan(r);
        return r;
    }

    public double cotangente(double a){
        r = Math.toRadians(a);
        r = (1) / (Math.tan(r));
        return r;
    }

    public double secante(double a){
        r = Math.toRadians(a);
        r = (1) / (Math.cos(r));
        return r;
    }

    public double cosecante(double a){
        r = Math.toRadians(a);
        r = (1) / (Math.sin(r));
        return r;
    }

}