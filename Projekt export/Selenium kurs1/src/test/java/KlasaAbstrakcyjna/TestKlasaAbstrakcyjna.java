package KlasaAbstrakcyjna;

import org.junit.Test;

public class TestKlasaAbstrakcyjna {

    @Test
    public void testKlasyAbstrakcyjnej(){
       Pies reksio = new Pies();
       reksio.poruszajSie();
       reksio.napijSieWody();
       reksio.wypiszPrzsmak();
        System.out.println(reksio.nazwa);

       Ptaszek tweety = new Ptaszek();
       tweety.nazwa = "Ptak";
       tweety.napijSieWody();
       tweety.poruszajSie();
       tweety.wypiszPrzsmak();
        System.out.println(reksio.nazwa);


            }
}
