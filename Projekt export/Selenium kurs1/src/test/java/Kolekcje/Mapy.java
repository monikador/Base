package Kolekcje;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    Map<Integer,String> dziennik = new HashMap<Integer, String>();

    public void dodajUczniow(){
        dziennik.put(1,"Kowalska");
        dziennik.put(2,"Nowak");
        dziennik.put(3,"Kok");
        dziennik.put(4,"Janik");
        dziennik.put(5,"Opyd");
    }
    @Test
    public void testMapy(){
        dodajUczniow();
        System.out.println(dziennik.size());
        dziennik.remove(1);
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(2));
        dziennik.put(2,"Nowa wartosc");
        System.out.println(dziennik.containsKey(3));
        System.out.println(dziennik.get(2));

    }
}
