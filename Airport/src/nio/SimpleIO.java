package nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SimpleIO {
    public static void main(String[] args) throws IOException {
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
