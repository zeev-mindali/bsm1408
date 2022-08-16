package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class SocketChannelClient {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocket = null;
        SocketChannel client = null;

        serverSocket = ServerSocketChannel.open();
        serverSocket.socket().bind(new InetSocketAddress(9000));
        client = serverSocket.accept();
        System.out.println("Connection set: "+client.getRemoteAddress());
        Path path = Paths.get("c:/zeev/kartzya.txt");
        FileChannel fileChannel = FileChannel.open(path,
                EnumSet.of(StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING,
                        StandardOpenOption.WRITE));
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (client.read(buffer)>0){
            buffer.flip();
            fileChannel.write(buffer);
            buffer.clear();
        }
        fileChannel.close();
        System.out.println("file received");
        client.close();
    }
}
