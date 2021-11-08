package comparable_ordem_natural;


import java.util.ArrayList;
import java.util.Collections;

public class OrdemNatural {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
        jogadores.add(new Jogador("Jonas",15,"Paris Saint Germain"));
        jogadores.add(new Jogador("Lucian",2,"Paris Saint Germain"));
        jogadores.add(new Jogador("Nemos",21,"Paris Saint Germain"));
        jogadores.add(new Jogador("Tibbers",17,"Paris Saint Germain"));
        jogadores.add(new Jogador("Jinx",55,"Paris Saint Germain"));
        System.out.println("\nAntes da Ordenacao Natural(Definida na Classe Jogador)"+jogadores);
        Collections.sort(jogadores);
        System.out.println("\nApós a ordenacao Natural(Por NUMERO)"+jogadores);
        Collections.reverse(jogadores);
        System.out.println("\nInvertendo a Collection"+jogadores);
        Collections.shuffle(jogadores);
        Collections.rotate(jogadores,2);


    }
}
