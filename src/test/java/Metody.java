import org.junit.Test;

import java.sql.SQLOutput;

public class Metody {

    public void nazwaMetody() {
        int a = 2;
        int b = 3;
        System.out.println(a + b);
    }

    public int suma() {
        int a = 4;
        int b = 5;
        return a+b;
    }

    int wynikDzialania = suma();

    public Studenci pobierzDaneStudenta()
    {
        Studenci student = new Studenci();
        student.imie = "Kamil";
        student.nazwisko = "Kostek";
        student.grupa = "III";
        return student;
    }

    @Test
    public void testMetody()
    {
    nazwaMetody();
        System.out.println(suma());
        System.out.println(wynikDzialania);
        Studenci student = pobierzDaneStudenta();
        System.out.println(student.imie);
        System.out.println(student.nazwisko);
        System.out.println(student.grupa);

    }
}
