import java.util.ArrayList;
import java.util.HashSet;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int id;

    public Person(String firstName, String lastName, int age, String gender, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format( "fn:%s ln:%s age:%d gender:%s id:%d", firstName, lastName, age, gender, id );
    }

    @Override
    public boolean equals(Object o) {
        Person t = (Person) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}