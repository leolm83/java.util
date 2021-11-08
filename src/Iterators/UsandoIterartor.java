package Iterators;

import java.util.*;

public class UsandoIterartor {
    public static void main(String[] args) {
        //aqui ele manteve a ordem de insercao
        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //aqui ele nao manteve a ordem
        Set<String> nomes2 = new HashSet<>();
        nomes2.add("Super Mario");
        nomes2.add("Yoshi");
        nomes2.add("Donkey Kong");

        Iterator<String> it2 = nomes2.iterator();

        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
