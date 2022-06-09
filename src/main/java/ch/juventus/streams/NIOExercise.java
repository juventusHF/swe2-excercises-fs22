package ch.juventus.streams;

import java.io.IOException;
import java.nio.file.*;

public class NIOExercise {

    public static void main(String[] args) throws IOException {
        createDir();
        createFile();
        writeToFile();
        renameFile();
        checkIfRenamedFileExists();
        readFromFile();
        listDirContent();
        deleteDir();
    }

    private static void createDir() throws IOException {
        Path newDir = Paths.get("src/main/resources/tmp");
        Files.createDirectories(newDir);
    }

    private static void createFile() throws IOException {
        Path newFile = Paths.get("src/main/resources/tmp/myFile.txt");
        if (Files.notExists(newFile)) {
            Files.createFile(newFile);
        }
    }

    private static void writeToFile() throws IOException {
        Path file = Paths.get("src/main/resources/tmp/myFile.txt");
        Files.writeString(file, "My Text :)");
    }

    private static void renameFile() throws IOException {
        Path file = Paths.get("src/main/resources/tmp/myFile.txt");
        Path fileWithNewName = Paths.get("src/main/resources/tmp/myRenamedFile.txt");
        Files.move(file, fileWithNewName, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void checkIfRenamedFileExists() {
        Path fileWithNewName = Paths.get("src/main/resources/tmp/myRenamedFile.txt");
        boolean exists = Files.exists(fileWithNewName);
        if (!exists) {
            throw new IllegalStateException("File does not exist! " + fileWithNewName);
        }
    }

    private static void readFromFile() throws IOException {
        Path file = Paths.get("src/main/resources/tmp/myRenamedFile.txt");
        String text = Files.readString(file);
        System.out.println(text);
    }

    private static void listDirContent() throws IOException {
        Path directory = Paths.get("src/main/resources/tmp");
        DirectoryStream<Path> content = Files.newDirectoryStream(directory);
        for (Path path : content) {
            System.out.println(path);
        }
    }

    private static void deleteDir() throws IOException {
        Path directory = Paths.get("src/main/resources/tmp");
        deleteDirRecursive(directory);
    }

    private static void deleteDirRecursive(Path dir) throws IOException {
        try (DirectoryStream<Path> content = Files.newDirectoryStream(dir)) {
            for (Path path : content) {
                if (Files.isDirectory(path)) {
                    deleteDirRecursive(path);
                } else {
                    Files.delete(path);
                }
            }
            Files.delete(dir);
        }
    }

}
