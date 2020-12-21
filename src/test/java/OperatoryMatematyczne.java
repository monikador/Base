import org.junit.Test;

import java.sql.SQLOutput;

public class OperatoryMatematyczne
    {
        @Test
        public void testoperatory()
        {
           int pierwszaLiczba = 5;
           int drugaLiczba =2;

           //suma
           int suma = pierwszaLiczba + drugaLiczba;

           //roznica
            int roznica = pierwszaLiczba - drugaLiczba;

            //iloczyn
            int iloczyn = pierwszaLiczba * drugaLiczba;

            //iloraz
            int iloraz = pierwszaLiczba / drugaLiczba;

            //modulo
            int modulo =drugaLiczba % pierwszaLiczba;

            //Wyświetlanie
            System.out.println("Suma wynosi: " + suma);
            System.out.println("Roznica wynosi: " + roznica);
            System.out.println("Iloczyn wynosi: " + iloczyn);
            System.out.println("Iloraz wynosi: " + iloraz);
            System.out.println("Reszta wynosi: " + modulo);
        }
    }