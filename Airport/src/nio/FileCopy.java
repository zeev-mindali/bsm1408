package nio;

import java.io.IOException;
import java.nio.file.*;

public class FileCopy {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("c:/zeev/cars.json");
        Path targetFile = Paths.get("c:/zeev/cars_copy.json");

        try{
            Files.copy(sourceFile,targetFile, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.out.println("Error in copy...");
        }
    }
}
