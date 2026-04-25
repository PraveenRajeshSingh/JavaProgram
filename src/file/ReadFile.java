package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main (String[] args) {
        try ( FileReader fr = new FileReader("test.txt") ) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch ( IOException e ) {
            System.out.println("Error :" + e.getMessage());
        }

        try ( BufferedReader br = new BufferedReader(new FileReader("test.txt")) ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch ( IOException e ) {
            System.out.println("ERROR :" + e.getMessage());
        }
        try {
            List< String > lines = Files.readAllLines(Paths.get("test.txt"));

            for ( String str : lines ) {
                System.out.print(str);
            }
        } catch ( IOException e ) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
