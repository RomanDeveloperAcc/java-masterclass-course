package rbd.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "dir4");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "dir2/dir3/dir4/dir5/dir6");
//            Files.createDirectories(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples/dir2/dir3/dir4/dir5/dir6/dir7");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("Examples", "dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println(size);
            System.out.println(Files.getLastModifiedTime(filePath));

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println(attributes.size());
            System.out.println(attributes.lastModifiedTime());
            System.out.println(attributes.creationTime());
            System.out.println(attributes.isDirectory());
            System.out.println(attributes.isRegularFile());
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        Path path = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path path = Paths.get(".", "files", "SubdirectoryFile.txt");
//	    printFile(path);
//
//	    path = Paths.get(".");
//        System.out.println(path.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("doesnotexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("files", "doesnotexist.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        path = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(path)); // true
//
//        System.out.println("Exists = " + Files.exists(path4)); // false
//
//
    }

//    private static void printFile(Path path) {
//        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
