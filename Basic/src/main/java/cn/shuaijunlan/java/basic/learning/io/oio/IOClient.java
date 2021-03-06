package cn.shuaijunlan.java.basic.learning.io.oio;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:51 AM 11/26/18.
 */
public class IOClient {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8008);
                int i = 0;
                while (i < 1000){
                    try {
                        socket.getOutputStream().write((new Date() + " :hello world!").getBytes());
                        Thread.sleep(0);
                        // byte[] reads = new byte[1024];
                        // int re = socket.getInputStream().read(reads);
                        // if (re > 0){
                        //     System.out.println("Received: " + new String(reads, 0, re, StandardCharsets.UTF_8));
                        // }
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        i++;
                    }
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
