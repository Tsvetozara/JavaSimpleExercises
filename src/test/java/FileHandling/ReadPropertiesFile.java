package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\FileHandling\\data";

        FileInputStream file = new FileInputStream(filePath);

        properties.load(file);

        file.close();

        //Read data from property file
        String age = properties.getProperty("age");
        String name = properties.getProperty("name");
        String email = properties.getProperty("email");

        System.out.println(age + "   " + name + "   " + email);

        //Capture all the properties //method 1
        Set<String> keys = properties.stringPropertyNames();
        System.out.println(keys);

        //Capture all the properties  // method2

        Set<Object> allkeys = properties.keySet();
        System.out.println(allkeys);

        //Capture all the values from the properties file
        Collection<Object> values = properties.values();
        System.out.println(values);

        //Read all the properties along with the values
        for(String key: properties.stringPropertyNames())
        {
            System.out.println(key + "   " + properties.getProperty(key));
        }
    }
}
