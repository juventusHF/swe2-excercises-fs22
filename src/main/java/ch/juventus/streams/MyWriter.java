package ch.juventus.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {

    public void write() throws IOException {
        Writer writer = new FileWriter("src/main/resources/output.txt");

        String outputText = "Hello World!\nI am writing to an output file";
        writer.write(outputText);
        writer.close();
    }

}
