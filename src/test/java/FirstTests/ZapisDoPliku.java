package FirstTests;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.file.Files;

import static java.nio.file.Files.*;

public class ZapisDoPliku {

    @Test
    public void zapisDoPliku() throws IOException{

        File file = new File("src/main/resources/zapis.txt");

        BufferedWriter writer = com.google.common.io.Files.newWriter(file, Charset.defaultCharset());
        writer.write("To jest tekst do zapisania w pliku");
        writer.close();
    }
}
