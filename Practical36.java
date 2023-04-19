/*
Write a program to list all the files in the given directory, and list 
all the file attributes
 */
import java.io.File;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Practical36 {
    public static void main(String[] args) {
        String directoryPath = "E:\\SEM-4\\Java-Practical\\MyPack"; // Replace with the path to your directory
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getAbsolutePath());
                    System.out.println("File size: " + file.length() + " bytes");

                    try {
                        Path filePath = Paths.get(file.getAbsolutePath());
                        BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
                        System.out.println("Creation time: " + attributes.creationTime());
                        System.out.println("Last modified time: " + attributes.lastModifiedTime());
                        System.out.println("Last accessed time: " + attributes.lastAccessTime());
                        System.out.println("Is directory: " + attributes.isDirectory());
                        System.out.println("Is regular file: " + attributes.isRegularFile());
                        System.out.println("Is symbolic link: " + attributes.isSymbolicLink());
                        System.out.println();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("The directory does not exist or is not a directory.");
        }
    }
}
/*
OUTPUT:
File name: packDemo.java
File path: E:\SEM-4\Java-Practical\MyPack\packDemo.java
File size: 417 bytes
Creation time: 2023-04-19T13:01:39.303443Z
Last modified time: 2023-04-19T15:26:33.868967Z
Last accessed time: 2023-04-19T15:26:42.1123995Z
Is directory: false
Is regular file: true
Is symbolic link: false
 */