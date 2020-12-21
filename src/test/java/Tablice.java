public class Tablice {

    int liczby[] = new int[5];

    public void ustawWartosci() {
        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;

    }

    public void wtpiszElementyTablicy() {
        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
    }

    Studenci studenci[] = new Studenci[2];

    public void dodajStudentow() {
        Studenci pierwszy = new Studenci("Tomasz", "Kot", "I");
        Studenci drugi = new Studenci("Jan", "Kowalski", "II");

        studenci[0] = pierwszy;
        studenci[1] = drugi;
    }

    public void przedstawStudentow() {
        try {
            studenci[0].przedstawSie();
            studenci[1].przedstawSie();
            studenci[2].przedstawSie();
            System.out.println("Tutaj robie cos innego.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wystapil wyjatek! Odwolujesz sie do elementu tablicy,ktorego nie ma.");
        } finally {
            System.out.println("Zamykam polaczenie do bazy danych.");
        }

    }
}