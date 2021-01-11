package FirstTests;

import org.junit.Test;

import java.sql.SQLOutput;

public class ParametryMetod {

    public int suma(int pierwszaLiczba, int drugaLiczba)
    {
        return pierwszaLiczba + drugaLiczba;
    }
    public void przywitajSie (String imie)
    {
        System.out.println("Witaj " + imie);
    }
    @Test
    public void testParametrow ()
    {
        int sumaLiczb = suma (1,2);
        System.out.println(sumaLiczb);
        System.out.println(suma (4,6));
        przywitajSie("Bartek");
        przywitajSie("Kasia");
    }
}
