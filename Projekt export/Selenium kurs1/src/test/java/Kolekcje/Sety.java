package Kolekcje;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    Set<String> nicks = new HashSet<>();

    public void dodajNickiUrzytkownikow(){
        nicks.add("ponury zniwiarz");
        nicks.add("wesoly kozak");
        nicks.add("czarna owca");
        nicks.add("peppa style");
    }
    @Test
    public void testNickow(){
        dodajNickiUrzytkownikow();
        nicks.add("kolejny user");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("ponury zniwiarz"));
        nicks.remove("ponury zniwiarz");
        System.out.println(nicks.size());
        nicks.add("kolejny user");
        System.out.println(nicks.size());
    }
}
