package MyJava;

import beans.Gender;
import beans.Person_old;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTester {
    public static void main(String[] args) {
        List<Person_old> pepole = List.of(
                new Person_old("Zeev", Gender.Male),
                new Person_old("Amital",Gender.Female),
                new Person_old("Hilda",Gender.Female),
                new Person_old("Sasson",Gender.Male),
                new Person_old("Michal",Gender.Female)
        );

        //Imperative Approach
        List<Person_old> females = new ArrayList<>();
        for (Person_old person:pepole){
            if (Gender.Female.equals(person.getGender())){
                females.add(person);
            }
        }

//        for (Person female:females){
//            System.out.println(female);
//        }

        //Declarative Approach
        List<Person_old> females2 = pepole.stream()
                .filter(person->Gender.Female.equals(person.getGender()))
                .collect(Collectors.toList());


        females2.forEach(System.out::println);
    }
}
