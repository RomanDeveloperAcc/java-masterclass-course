package rbd.project;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
//            public boolean accept(Path path) throws IOException {
//                return (Files.isRegularFile(path));
//            }
//        };
//
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
        Path directory = FileSystems.getDefault().getPath("FileTree" + FileSystems.getDefault().getSeparator() + "Dir2");
//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");

        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("temp file path = " + tempFile.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println("Volume name/drive letter " + store);
            System.out.println("file store " + store.name());
        }


        System.out.println("==============================");

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }
    }
}