import java.sql.SQLOutput;

public class Studenci {

    public String imie;
    public String nazwisko;
    public String grupa;

    public void przedstawSie()
    {
        System.out.println("Cześć! Nazywam się " + imie + " " + nazwisko + ". Jestem w grupie " + grupa + ".");

    }
    public Studenci()
    {
        System.out.println("Witaj w konstruktorze");
    }
    public Studenci (String noweImie, String noweNazwisko, String nowaGrupa)
    {
        imie = noweImie;
        nazwisko = noweNazwisko;
        grupa = nowaGrupa;
    }
}
