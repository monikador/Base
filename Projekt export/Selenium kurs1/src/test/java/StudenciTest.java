import org.junit.Test;

import java.sql.SQLOutput;

public class StudenciTest {

    @Test
    public void testStudent()
    {
        Studenci naszPierwszyStudent = new Studenci();
        naszPierwszyStudent.imie = "Adam";
        naszPierwszyStudent.nazwisko = "Goral";
        naszPierwszyStudent.grupa = "I";

        Studenci naszDrugiStudent = new Studenci();
        naszDrugiStudent.imie = "Agnieszka";
        naszDrugiStudent.nazwisko = "Adamczyk";
        naszDrugiStudent.grupa = "III";

        naszPierwszyStudent.przedstawSie();
        naszDrugiStudent.przedstawSie();


    }


}

