package comparable_em_objetos;

import java.util.ArrayList;

public class ComparableEmIntegers {
    public static void main(String[] args) {

        ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
        jogadores.add(new Jogador("Jonas",15,"Paris Saint Germain"));
        jogadores.add(new Jogador("Lucian",2,"Paris Saint Germain"));
        jogadores.add(new Jogador("Nemos",21,"Paris Saint Germain"));
        jogadores.add(new Jogador("Tibbers",17,"Paris Saint Germain"));
        jogadores.add(new Jogador("Jinx",55,"Paris Saint Germain"));

        System.out.println("\nNa ordem de Insercao --------------\n"+jogadores);

        NumeroComparator porNumero = new NumeroComparator();
        jogadores.sort(porNumero);
        System.out.println("\nPor Numero ------------------------\n"+jogadores);

        NomeComparator porNome = new NomeComparator();
        jogadores.sort(porNome);
        System.out.println("\nPor Nome --------------------------\n"+jogadores);
    }
}
