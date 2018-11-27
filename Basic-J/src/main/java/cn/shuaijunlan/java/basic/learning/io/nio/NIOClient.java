package cn.shuaijunlan.java.basic.learning.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:45 PM 11/27/18.
 *
 * TODO: https://blog.csdn.net/woorh/article/details/8541973
 */
public class NIOClient {
    private static int flag = 0;
    private static int block = 1024;
    private static ByteBuffer sendBuffer = ByteBuffer.allocate(block);
    private static ByteBuffer receiveBuffer = ByteBuffer.allocate(block);

    private static final InetSocketAddress SERVER_ADDRESS = new InetSocketAddress("localhost", 8000);

    public static void main(String[] args) throws IOException {
        //open socket channel
        SocketChannel socketChannel = SocketChannel.open();

        //setting non-blocking mode
        socketChannel.configureBlocking(false);
        //open selector
        Selector selector = Selector.open();

        //register connect to server side event
        socketChannel.register(selector, SelectionKey.OP_CONNECT);

        //connect
        socketChannel.connect(SERVER_ADDRESS);

        while (true){
            selector.select();

            Set<SelectionKey> selectionKey = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKey.iterator();
            while (iterator.hasNext()){
                SelectionKey k = iterator.next();

                if (k.isConnectable()){
                    System.out.println("client connect");
                    SocketChannel client = (SocketChannel) k.channel();
                    if (client.isConnectionPending()){
                        client.finishConnect();
                        sendBuffer.clear();

                        byte[] se = "Hello Shuai".getBytes();
                        sendBuffer.put(se);
                        sendBuffer.flip();

                        client.write(sendBuffer);
                    }

                }else if (k.isReadable()){
                    SocketChannel client = (SocketChannel) k. channel();

                    //clear buffer for next reading
                    receiveBuffer.clear();
                    int count;
                    if ((count = client.read(receiveBuffer)) > 0){
                        String re = new String(receiveBuffer.array(), 0, count);
                        System.out.println("Getting response: " + re);
                        client.register(selector, SelectionKey.OP_WRITE);
                    }
                }
            }
            selectionKey.clear();
        }

    }
}
