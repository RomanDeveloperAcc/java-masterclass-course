package rbd.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            // copy
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING); // replace existing prevents errors if file exists
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            // move
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "dir1", "file1copy.txt");
//
//            Files.move(fileToMove, destination);

            // rename
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file1.txt");
//
//            Files.move(fileToMove, destination);

            // delete
            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "dir1", "file1copy.txt");
            Files.deleteIfExists(fileToDelete);
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
