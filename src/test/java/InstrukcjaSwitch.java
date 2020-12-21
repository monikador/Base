import org.junit.Test;

public class InstrukcjaSwitch
{
    @Test
    public void testSwitch()
    {
        wypiszDzienTygodnia(1);
        wypiszDzienTygodnia(2);
        wypiszDzienTygodnia(3);
        wypiszDzienTygodnia(4);
        wypiszDzienTygodnia(5);
        wypiszDzienTygodnia(6);
        wypiszDzienTygodnia(7);
    }
       public void wypiszDzienTygodnia(int dzienTygodnia) {
           switch (dzienTygodnia) {
               case 1:
                   System.out.println("Jest poniedzialek");
                   break;
               case 2:
                   System.out.println("Jest wtorek");
                   break;
               case 3:
                   System.out.println("Jest sroda");
                   break;
               case 4:
                   System.out.println("Jest czwartek");
                   break;
               case 5:
                   System.out.println("Jest piatek");
                   break;
               case 6:
               case 7:
                   System.out.println("Jest weekend");
                   break;
                   default:
                   System.out.println("Bledna wartosc");
           }
       }


}
