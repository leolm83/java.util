package comparable_em_objetos;

import java.util.Comparator;
/**
 * Responsavel por comparar o numero de cada comparable_em_objetos.Jogador.
 *
 * @Author Leonardo Mateus
 * @Returns int
 */

public class NumeroComparator implements Comparator<Jogador> {
    @Override
    public int compare(Jogador j1, Jogador j2){
        return Integer.compare(j1.getNumero(), j2.getNumero());
    /*É possivel comparar de outras maneiras como por exemplo:
    * -------------------------------------------------------
    * if(j1.getNumero()<j2.getNumero()){
    * return -1;
    * }
    * else if(j1.getNumero()>j2.getNumero()){
    * return 1;
    * }
    *
    * return 0;//ele retorna 0 caso os numeros forem iguais
    *---------------------------------------------------------
    * outra alternativa é :
    * return j1.getNumero-j2.getNumero();
    *
    * */

    }
}
