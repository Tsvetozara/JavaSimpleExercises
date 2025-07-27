package FileHandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadingDataFromJSONUsingJacksonLibrary {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File(".\\src\\test\\java\\FileHandling\\json\\employee.json");

        //Read JSON data from the file amd map the Person class

        Person person = objectMapper.readValue(file, Person.class);

        //Access the data
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());

        System.out.println("Addresses.......");

        for (Address address : person.getAddress()) {
            System.out.println("Street: " + address.getStreet());
            System.out.println("City: " + address.getCity());
            System.out.println("State: " + address.getState());
        }
    }
}
