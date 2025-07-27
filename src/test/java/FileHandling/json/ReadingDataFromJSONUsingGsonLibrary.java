package FileHandling.json;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingDataFromJSONUsingGsonLibrary {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader(".\\src\\test\\java\\FileHandling\\json\\employee.json");

        Gson gson = new Gson();
        Person person = gson.fromJson(reader, Person.class);

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
