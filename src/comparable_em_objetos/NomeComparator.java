package comparable_em_objetos;

import java.util.Comparator;

public class NomeComparator implements Comparator<Jogador> {
        @Override
        public int compare(Jogador j1,Jogador j2) {
            return j1.getNome().compareTo(j2.getNome());
        }
    }
