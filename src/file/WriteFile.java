package file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main (String[] args) {
        try(FileWriter fw=new FileWriter("test.txt")) {
            fw.write("Java is a programming language");
        }catch( IOException e ){
            System.out.println("Error occurs :"+e.getMessage());
        }
    }
}
