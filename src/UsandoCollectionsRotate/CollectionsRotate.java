package UsandoCollectionsRotate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsRotate {
    public static void main(String[] args) {
       ArrayList<String> brinquedos = new ArrayList<String>();
        brinquedos.add("Bola");
        brinquedos.add("Boneca");
        brinquedos.add("Video-Game");
        brinquedos.add("Bambolê");
        brinquedos.add("Dominó");
        brinquedos.add("Ioiô");
        System.out.println(brinquedos);
        Collections.rotate(brinquedos,2);
        System.out.println(brinquedos);
        Collections.rotate(brinquedos,-2);
        System.out.println(brinquedos);
    }

}
