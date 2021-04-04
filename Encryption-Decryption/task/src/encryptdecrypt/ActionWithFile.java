package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ActionWithFile {
    public String readDataFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public void writeDataToFile(String fileName, String data) throws IOException {
        // File file = new File(fileName);
        System.out.println(fileName);
        File file = new File(System.getProperty("user.dir")+"\\" +fileName);
        FileWriter writer = new FileWriter(file); // overwrites the file

        writer.write(data);

        writer.close();
    }
}
