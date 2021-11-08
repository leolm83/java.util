package comparable_strings;

import java.util.ArrayList;

public class ComparableEmStrings {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();
        palavras.add("Belmont");
        palavras.add("Patricia");
        palavras.add("Alice");
        palavras.add("Carmilla");
        palavras.add("Hector");
        palavras.add("Dracula");
        palavras.add("Isaac");
        PalavraComparator comparator = new PalavraComparator();
        System.out.println(palavras);
        palavras.sort(comparator);//ordena a Collection conforme o parametro definido pelo comparator
        System.out.println(palavras);
    }
}
