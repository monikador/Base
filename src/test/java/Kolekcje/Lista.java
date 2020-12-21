package Kolekcje;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Lista {

    List<String> imiona = new ArrayList<String>();
    List<Integer> numery = new LinkedList<>();

    public void dodajImiona(){
        imiona.add("Tomek");
        imiona.add("Maciek");
        imiona.add("Szymon");
        }

    public void ustawNumeryLotto(){
        numery.add(2);
        numery.add(22);
        numery.add(13);
        numery.add(11);
        numery.add(4);
        numery.add(18);
    }



    @Test
    public void testListy(){
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.size());
        imiona.remove("Tomek");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Maciek"));
        System.out.println(imiona.contains("Maciek"));
    }
    @Test
    public void testLinkedList(){
        ustawNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(2));
        System.out.println(numery.size());
        System.out.println(numery.remove(2));
        System.out.println(numery.size());
    }

}
