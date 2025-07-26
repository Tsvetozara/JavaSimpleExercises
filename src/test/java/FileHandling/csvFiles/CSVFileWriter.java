package FileHandling.csvFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWriter {

    public static void main(String[] args) throws IOException {

        String csvFileName = System.getProperty("user.dir") + "\\src\\test\\java\\FileHandling\\csvFiles\\example.csv";

        FileWriter writer = new FileWriter(csvFileName);

        writer.append("Name,Age,Email \n"); //header
        writer.append("John,30,john@gmail.com \n");
        writer.append("Marry,37,marry@gmail.com \n");
        writer.append("Vasko,40,vasko@gmail.com \n");
        writer.append("Tsveti,41,tsveti@gmail.com \n");
        writer.append("Enga,42,enga@gmail.com \n");

        writer.close();

        System.out.println("CSV file created at: " + csvFileName);

    }
}
