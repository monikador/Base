import com.google.common.io.Files;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;

public class CzytaniePliku {

    @Test
    public void czytaniePliku(){

        File plik = new File("src/main/resources/tekst.txt");

        try {
            BufferedReader reader = Files.newReader(plik, Charset.defaultCharset());

            String line = null;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
