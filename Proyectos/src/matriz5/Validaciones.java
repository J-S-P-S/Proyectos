package matriz5;

public class Validaciones {

    public boolean validarEntrada(String f1, String c1, String f2, String c2){

        try{
            Integer.parseInt(f1);
            Integer.parseInt(c1);
            Integer.parseInt(f2);
            Integer.parseInt(c2);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean validarCaso(String f1){
        try{
            Integer.parseInt(f1);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean validarMatrizCuadrada(int f1, int c1, int f2, int c2){
        return f1 == c1 && f2 == c2;
    }

}