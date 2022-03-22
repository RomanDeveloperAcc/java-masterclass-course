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

            byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
            buffer.put(outputBytes);

            buffer.flip();
            int numBytes = binChannel.write(buffer);
            System.out.println(numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(234);
            intBuffer.flip();

            numBytes = binChannel.write(intBuffer);
            System.out.println(numBytes);

            intBuffer.flip();
            intBuffer.putInt(-9876);
            intBuffer.flip();

            numBytes = binChannel.write(intBuffer);
            System.out.println(numBytes);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();
            outputBytes[0]= 'a';
            buffer.flip();
            long numBytesRead = channel.read(buffer);
            if (buffer.hasArray()) {
//                System.out.println(new String(buffer.array()));
                System.out.println(new String(outputBytes));
            }

            intBuffer.flip();
            //absolute read
            numBytesRead = channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt(0));
            System.out.println(intBuffer.getInt());

            // relative read
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            System.out.println(new String(outputBytes));
            channel.close();
            ra.close();
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String(b));
//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);

//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel fileChannel = file.getChannel();
//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            Files.write(dataPath, "\nLine 4".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//
//            for (String line : lines) {
//                System.out.println(line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
