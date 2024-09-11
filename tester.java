import java.io.File;
import java.io.IOException;

public class tester {
    public static void main(String[] args) {
        // /Users/jonahbenadon/Desktop/HonorsTopicsProjects/FileWriterActivity
        String repositoryPath = "/Users/jonahbenadon/Desktop/HonorsTopicsProjects/FileWriterActivity";
        String fileName = "secret.txt";
        String text = "This is a secret message";

        MyFileWriter fileWriter = new MyFileWriter();

        try {
            fileWriter.createHiddenPasswordFile("shush.txt", "this is a secret password: **********");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Error creating hidden password file");
        }
        try {
            fileWriter.createSecretFile(repositoryPath);
        } catch (IOException e) {
            System.out.println("Error creating secret file");
            e.printStackTrace();
        }

        File file = new File(repositoryPath + "/" + fileName);

    }

}
