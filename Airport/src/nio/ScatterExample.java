package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;

public class ScatterExample {
    public static final String FILENAME = "c:/zeev/test.txt";

    public static void main(String[] args) {
        ByteBuffer bLen1 = ByteBuffer.allocate(1024);
        ByteBuffer bLen2 = ByteBuffer.allocate(1024);
        FileInputStream in;
        try{
            in = new FileInputStream(FILENAME);
            ScatteringByteChannel scatter = in.getChannel();
            scatter.read(new ByteBuffer[]{bLen1,bLen2});
            bLen1.position(0);
            bLen2.position(0);
            int len1 = bLen1.asIntBuffer().get();
            int len2 = bLen2.asIntBuffer().get();
            System.out.println("Scattering : len1 = "+len1);
            System.out.println("Scattering : len2 = "+len2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
