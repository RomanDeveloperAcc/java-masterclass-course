package rbd.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        Path path = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        Path path = Paths.get(".", "files", "SubdirectoryFile.txt");
	    printFile(path);

	    path = Paths.get(".");
        System.out.println(path.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
    }

    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
