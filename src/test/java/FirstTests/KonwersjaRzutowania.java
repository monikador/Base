package FirstTests;

import org.junit.Test;

public class KonwersjaRzutowania
{
    @Test
    public void testKonwersja()
    {
        int a = 1;
        double b = 2.22;
        double c = a + b;

        int d = (int) (a+b);

        System.out.println(c);
        System.out.println(d);
    }
}
