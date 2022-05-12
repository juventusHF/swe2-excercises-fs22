package ch.juventus.streams;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {

    public void read() throws IOException {
        Reader reader = new FileReader("src/main/resources/input.txt");

        int data = reader.read();
        while(data != -1){
            char dataChar = (char) data;
            System.out.print(dataChar);
            data = reader.read();
        }
        reader.close();
    }

}
