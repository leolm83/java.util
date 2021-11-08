package comparator_classes_anonimas;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassesAnonimas {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(2);
        lista.add(8);
        //VERSAO 1
        lista.sort(new Comparator<Integer>(){
            //isso é uma classe anonima que implementa o comparator!!!!
                @Override
                public int compare(Integer num1, Integer num2){
                    return Integer.compare(num1,num2);
                }
            }
        );

        //versao 2 da mesma classe Anonima
        Comparator<Integer> inteiroComparator= new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return Integer.compare(num1,num2);
            }
        };//nessa forma precisa do ; no final!!!!


        System.out.println(lista);
    }
}
