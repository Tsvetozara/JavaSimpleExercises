package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

    //Creating a file
    public static void createFile(String filePath) {

        File myObj = new File(filePath);

        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Writing data into file
    public static void writeFile(String filePath) {
        try {
            FileWriter mywriter = new FileWriter(filePath);
            mywriter.write("Welcome to java file....");
            mywriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred....");
            e.printStackTrace();
        }
    }

    //Reading data from the file

    public static void readFile(String filePath) {
        try {
            File myObj = new File(filePath);

            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred while reading");
            e.printStackTrace();
        }
    }

    //Renaming a file
    public static void renameFile(String oldfilePath, String newFilePath)
    {
        File oldfile = new File(oldfilePath);
        File newfile = new File(newFilePath);

        if(oldfile.renameTo(newfile))
        {
            System.out.println("File is renamed.");
        }
        else
        {
            System.out.println("The file cannot be renamed.");
        }
    }

    //Deleting a file
    public static void deleteFile(String filePath)
    {
        File myObj = new File(filePath);

        if(myObj.delete())
        {
            System.out.println("Deleted the file " + myObj.getName());
        }
        else
        {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {

        String filePath = "C:\\myfiles\\myfile.txt";
        createFile(filePath);
        writeFile(filePath);
        readFile(filePath);

        String filePathNew = "C:\\myfiles\\myfile1.txt";
        renameFile(filePath, filePathNew);

        deleteFile(filePathNew);

    }

}
