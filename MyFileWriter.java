import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {

    public void createHiddenPasswordFile(String fileName, String text) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text);
        writer.close();
    }

    public static void createSecretFile(String repositoryPath) throws IOException {
        String hiddenFolderPath = repositoryPath + File.separator + ".HiddenFolder";
        File confidentialFile = new File(hiddenFolderPath + File.separator + "secret.txt");
        try (FileWriter fileWriter = new FileWriter(confidentialFile)) {
            fileWriter.write("My actuall password is _*_*_*_*_**");
            fileWriter.close();
        }

    }

    public static void printFileSize(String fileName) {
        // implement my print filesize
        File file = new File(fileName);
        long fileSize = file.length();
        System.out.println(fileSize);
    }

}
