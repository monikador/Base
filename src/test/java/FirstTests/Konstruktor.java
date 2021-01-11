package FirstTests;

import org.junit.Test;

public class Konstruktor
{
    @Test
    public void testKonstruktor ()
    {
        Studenci student = new Studenci();
        Studenci drugiStudent = new Studenci("Jan","Nowak","I");
        drugiStudent.przedstawSie();

    }
}
