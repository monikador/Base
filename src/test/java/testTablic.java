import org.junit.Test;

public class testTablic {

    @Test
    public void testTablic(){

        Tablice tablice = new Tablice();
        tablice.ustawWartosci();
        tablice.wtpiszElementyTablicy();

        tablice.dodajStudentow();
        tablice.przedstawStudentow();
    }

}
