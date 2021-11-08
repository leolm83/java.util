package comparable_strings;

import java.util.Comparator;

public class PalavraComparator implements Comparator<String> {

    @Override
    public int compare(String palavra1, String palavra2) {
        return palavra1.compareTo(palavra2);
    }
}