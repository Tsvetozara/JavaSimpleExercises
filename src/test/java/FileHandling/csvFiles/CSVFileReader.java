package FileHandling.csvFiles;

import java.io.*;
import java.util.Scanner;

public class CSVFileReader {

    public static void main(String[] args) throws IOException {

        //Approach 1: Using Scanner class

        File file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\FileHandling\\csvFiles\\example.csv");

        Scanner sc = new Scanner(file);

        sc.useDelimiter(",");

        while (sc.hasNextLine()) {
            System.out.println(sc.next() + "\t");
        }

        sc.close();

        //Approach 2: Using Java split() method

        String csvFileName = System.getProperty("user.dir") + "\\src\\test\\java\\FileHandling\\csvFiles\\example.csv";
        FileReader reader = new FileReader(csvFileName);

        BufferedReader bfrreader = new BufferedReader(reader);

        String line;

        while ((line = bfrreader.readLine()) != null) {
            String[] data = line.split(",");
            for (String value : data) {
                System.out.println(value + "\t");
            }
        }

    }

}
