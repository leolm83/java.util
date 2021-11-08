import java.util.ArrayList;

public class AprendendoArrayList {
    public static void main(String[] args) {
        ArrayList<String> estados = new ArrayList<String>(26);
        estados.add("SP");
        estados.add("RJ");
        estados.add("MG");
        System.out.println("quantidade de  arquivos adicionados no arraylist estados :"+estados.size());
    }
}
