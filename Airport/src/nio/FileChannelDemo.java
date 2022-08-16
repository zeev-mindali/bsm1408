package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        //append the content to existing file
        writeFileChannel(ByteBuffer.wrap("John Bryce 16/08/2022\n".getBytes()));
        readFileChannel();
    }

    private static void writeFileChannel(ByteBuffer byteBuffer) throws IOException {
        Set<StandardOpenOption> options = new HashSet<>();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.APPEND);
        Path path = Paths.get("c:/zeev/test.txt");
        FileChannel fileChannel = FileChannel.open(path,options);
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }

    private static void readFileChannel() throws IOException {
        RandomAccessFile file = new RandomAccessFile("c:/zeev/test.txt","r");
        FileChannel fileChannel = file.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        while (fileChannel.read(byteBuffer)>0){
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()){
                System.out.print((char)byteBuffer.get());
            }
        }
    }
}
