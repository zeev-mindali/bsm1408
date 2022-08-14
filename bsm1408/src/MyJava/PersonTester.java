package MyJava;

import beans.Gender;
import beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTester {
    public static void main(String[] args) {
        List<Person> pepole = List.of(
                new Person("Zeev", Gender.Male),
                new Person("Amital",Gender.Female),
                new Person("Hilda",Gender.Female),
                new Person("Sasson",Gender.Male),
                new Person("Michal",Gender.Female)
        );

        //Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person:pepole){
            if (Gender.Female.equals(person.getGender())){
                females.add(person);
            }
        }

//        for (Person female:females){
//            System.out.println(female);
//        }

        //Declarative Approach
        List<Person> females2 = pepole.stream()
                .filter(person->Gender.Female.equals(person.getGender()))
                .collect(Collectors.toList());


        females2.forEach(System.out::println);
    }
}
