package MyJava;

import beans.MockData;
import beans.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyStream {
    public static void main(String[] args) throws IOException {
        List<Person> persons = MockData.getPepole();
        List<Person> youngPersons = new ArrayList<>();

        System.out.println(persons);
    }
}
