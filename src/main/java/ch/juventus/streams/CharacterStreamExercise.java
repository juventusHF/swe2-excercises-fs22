package ch.juventus.streams;

import java.io.IOException;

public class CharacterStreamExercise {

    public static void main(String[] args) throws IOException {
        MyWriter myWriter = new MyWriter();
        myWriter.write();

        MyReader myReader = new MyReader();
        myReader.read();
    }

}
