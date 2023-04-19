/*
Write a program to copy the content of one file to another file 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practical37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter source file location:");
        String sourceFilePath = sc.nextLine(); 
        System.out.print("Enter destination file location:");
        String destinationFilePath = sc.nextLine(); 
        sc.close();
        try {
            File sourceFile = new File(sourceFilePath);
            File destinationFile = new File(destinationFilePath);

            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
OUTPUT:
Enter source file location:E:\\SEM-4\\Java-Practical\\k1.txt
Enter destination file location:E:\\SEM-4\\Java-Practical\\k2.txt 
File copied successfully.
 */