package rbd.project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
            byte[] outputBytes = "Hello World!".getBytes();
            byte[] outputBytes2 = "Nice to meet ya!".getBytes();
            buffer.put(outputBytes).putInt(234).putInt(-987).put(outputBytes2).putInt(1000);
//            buffer.put(outputBytes);
//            buffer.putInt(234);
//            buffer.putInt(-9877);
//            byte[] outputBytes2 = "Nice to meet ya!".getBytes();
//            buffer.put(outputBytes2);
//            buffer.putInt(1000);
            buffer.flip();
            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
            readBuffer.flip();
            byte[] inputString = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println(new String(inputString));
            System.out.println(readBuffer.getInt());
            System.out.println(readBuffer.getInt());
            byte[] inputString2 = new byte[outputBytes2.length];
            readBuffer.get(inputString2);
            System.out.println(new String(inputString2));
            System.out.println(readBuffer.getInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
