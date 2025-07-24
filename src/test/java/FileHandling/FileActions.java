package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileActions {

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

    public static void main(String[] args) {

        createFile("C:\\myfiles\\myfile.txt");

    }

}
