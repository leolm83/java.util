package lambda_expressions;

import java.util.*;
import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
        jogadores.add(new Jogador("Jonas",15,"Atlético"));
        jogadores.add(new Jogador("Lucian",2,"Santos"));
        jogadores.add(new Jogador("Nemos",21,"Bahia"));
        jogadores.add(new Jogador("Tibbers",17,"Cruzeiro"));
        jogadores.add(new Jogador("Jinx",55,"Flamengo"));
        FuncaoNormal porNumero = new FuncaoNormal();
        jogadores.sort(porNumero);
        System.out.println("\nPor Numero ------------------------\n"+jogadores);

        //Exemplo 1 de Lambda Expressions
        //os parametros dependem do tipo da lista!!!
        jogadores.sort((parametro1,parametro2)-> parametro1.getNome().compareTo(parametro2.getNome()));
        System.out.println("\nPor Nome --------------------------\n"+jogadores);


        //Exemplo 2 de Lambda Expressions
         Comparator<Jogador> porTime = (Jogador j1, Jogador j2) ->{
         return j1.getTime().compareTo(j2.getTime());
         };
         jogadores.sort(porTime);
        System.out.println("\nPor Time --------------------------\n"+jogadores);

        //Exemplo 3 sem labda
        jogadores.forEach(new Consumer<Jogador>() {
            @Override
            public void accept(Jogador jogador) {
                System.out.println("Time : "+jogador.getTime()+", Nome : "+jogador.getNome());
            }
        });
        //exemplo 4 Com Lambda
        jogadores.forEach((Jogador jogador)->{
            System.out.println("Jogador : "+jogador.getNome());
        });

        //Exemplo 4 mais enxuto
         jogadores.forEach((jogador)->System.out.println("Nome Jogador :"+jogador.getNome())
         );


         //Exemplo 5
        ArrayList<Integer> nomeColecao = new ArrayList<>();
        nomeColecao.add(3);
        nomeColecao.add(5);
        nomeColecao.add(1);
        nomeColecao.add(9);
        System.out.println(nomeColecao);
        Collections.sort(nomeColecao,(parametro1,parametro2)->Integer.compare(parametro1,parametro2));
        System.out.println(nomeColecao);

        System.out.println("Imprime todos os elementos da lista!");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.println(n));

    }
}
