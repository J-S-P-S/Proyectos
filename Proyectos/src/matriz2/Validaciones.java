package matriz2;

public class Validaciones {

    public boolean validarEntrada(String f, String c){

        try{
            Integer.parseInt(f);
            Integer.parseInt(c);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}