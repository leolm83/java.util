package lambda_expressions;

import java.util.Comparator;

public class FuncaoNormal implements Comparator<Jogador> {
    @Override
    public int compare(Jogador j1, Jogador j2) {
        return Integer.compare(j1.getNumero(), j2.getNumero());
    }
}
