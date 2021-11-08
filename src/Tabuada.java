
public class Tabuada {
    public static void main(String[] args) {

        for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {

            for (int contador = 1; contador <= 10; contador++) {
                System.out.printf("| %d X %d = %d |\t",contador,multiplicador,multiplicador*contador);
            }
            System.out.println("");
        }
    }
}
