public class Calculadora {

    public String sumar(String a, String b){
        String res = "";
        res = (double)(Integer.parseInt(a) + Integer.parseInt(b)) + "";
        return res;

}
    public String resta(String a, String b){
        String res = "";
        res = (Integer.parseInt(a) - Integer.parseInt(b)) + "";
        return res;

    }

    public String multiplicar(String a, String b){
        String res = "";
        res = (Integer.parseInt(a) * Integer.parseInt(b)) + "";
        return res;

    }

    public String dividir(String a, String b){
        String res = "";
        res = (Integer.parseInt(a) / Integer.parseInt(b)) + "";
        return res;

    }
