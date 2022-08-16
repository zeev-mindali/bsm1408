package nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyToScreen {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("c:/zeev/cars_copy.json");
        Charset charset = Charset.forName("UTF-8");
        try{
            List<String> lines = Files.readAllLines(sourceFile,charset);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
