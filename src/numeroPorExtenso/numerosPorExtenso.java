package numeroPorExtenso;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class numerosPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero!");
        String numero = sc.nextLine();
        sc.close();
        paraEscrita(numero);
        /*System.out.println(numero / 1000.0);

        if ((numero / 10000.0) > 1) {

        }
        if ((numero / 1000.0) > 1) {
            char[] letras = Integer.toString(numero).toCharArray();
            for (char letra : letras) {
                System.out.println(letra);
            }
        }
        */
    }

    public static String paraEscrita(String numero) {

        char[] letras = numero.toCharArray();
        String textual = "";
        int indice = 0;
        while (letras.length > 0 && indice<letras.length) {
            System.out.println(indice);
            if (letras.length % 3 == 1) {
                if (letras[indice] == '1') {
                    textual += "um";
                } else if (letras[indice] == '2') {
                    textual += "dois";
                } else if (letras[indice] == '3') {
                    textual += "três";
                } else if (letras[indice] == '4') {
                    textual += "quatro";
                } else if (letras[indice] == '5') {
                    textual += "cinco";
                }
                indice += 1;
                letras = (char[]) Arrays.copyOfRange(letras, indice, letras.length);
                System.out.println(Arrays.toString(letras));
                System.out.println(letras.length);
                System.out.println(textual);
            } else if (letras.length % 3 == 2) {
                if (letras[indice] == '1' ) {
                    textual += "dez";
                } else if (letras[indice] == '2') {
                    textual += "vinte";
                } else if (letras[indice] == '3') {
                    textual += "trinta";
                } else if (letras[indice] == '4') {
                    textual += "quarenta";
                } else if (letras[indice] == '5') {
                    textual += "cinquenta";
                }
                indice += 1;
                letras = Arrays.copyOfRange(letras, indice, letras.length);
                System.out.println("ARRAY = "+Arrays.toString(letras));
                System.out.println("Tamanho = "+letras.length);
                System.out.println("Textual = "+textual);
            }else if(letras.length%3 ==0){
                indice += 1;
                letras = Arrays.copyOfRange(letras, indice, letras.length);
                System.out.println(Arrays.toString(letras));
                System.out.println(letras.length);
                System.out.println(textual);

            }
            else {
                break;
            }
        }
        return textual;

    }
}

