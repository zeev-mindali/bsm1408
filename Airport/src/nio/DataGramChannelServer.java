package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DataGramChannelServer {
    final static int SERVER_PORT = 8989;
    final static int BUFFER_SIZE = 1024;
    public static void main(String[] args) throws IOException {
        DatagramChannel server = DatagramChannel.open();
        InetSocketAddress iAdd = new InetSocketAddress("localhost", SERVER_PORT);
        server.bind(iAdd);
        System.out.println("Server started : "+iAdd);
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
        //receive buffer from client
        SocketAddress remoteAdd = server.receive(buffer);
        //change mode of buffer
        buffer.flip();
        int limits = buffer.limit();
        byte[] bytes= new byte[limits];
        buffer.get(bytes,0,limits);
        String msg = new String(bytes);
        System.out.println("Client at "+remoteAdd+" sent: "+msg);
        server.send(buffer,remoteAdd);
        server.close();
    }
}
