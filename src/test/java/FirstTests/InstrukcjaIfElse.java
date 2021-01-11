package FirstTests;

import org.junit.Test;

public class InstrukcjaIfElse
{
    //instrukcja warunkowa

    @Test
    public void testInstrukcji()
    {
        sprawdzWiek(17);
        sprawdzWiek(20);
    }

    public void sprawdzWiek ( int wiek)
        {
            if (wiek > 18)
            {
                System.out.println("Jesteś pełnoletni możesz kupic alkochol.");
            }
            else
                {
                System.out.println("Jesteś niepełnoletni, nie możesz kupic alkocholu.");
                }
        }

}
