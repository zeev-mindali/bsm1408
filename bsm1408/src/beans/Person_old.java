package beans;

public class Person_old {
    private final String name;
    private final  Gender gender;

    public Person_old(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
    public Gender getGender() {
        return gender;
    }
}
