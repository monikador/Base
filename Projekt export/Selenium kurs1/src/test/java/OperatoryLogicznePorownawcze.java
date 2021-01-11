import org.junit.Test;

public class OperatoryLogicznePorownawcze
{
    @Test
    public void testOperatorow()
    {
        int liczba1 = 2;
        int liczba2 = 5;

        System.out.println(liczba1>liczba2); //false
        System.out.println(liczba1<liczba2); //true
        System.out.println(liczba1==liczba2); //false
        System.out.println(liczba1!=liczba2);  //true
        System.out.println(liczba1>=liczba2); //false
        System.out.println(liczba1<=liczba2); //true


        System.out.println(1>0 && 1>-1); //true
        System.out.println(1>2 || 0>2); //false
        System.out.println(2>3 && 1>0); //false
        System.out.println(1>0 || 3>5); //true

    }


}
