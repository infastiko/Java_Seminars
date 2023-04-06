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

    public static void namesake (HashSet<Person> pers) {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> teskaNames = new ArrayList<>();
        for (Person item: pers) {
            if (!(firstNames.contains(item.firstName))) {
                firstNames.add( item.firstName );
            } else {
                teskaNames.add( item.firstName );
            }
        }

        System.out.println("\nТёски");
        for (Person item: pers) {
            for (int i = 0; i < teskaNames.size(); i++) {
                if (teskaNames.get( i ) == item.firstName) {
                    System.out.printf( "fn:%s id:%d\n", item.firstName, item.id );
                }
            }
        }
    }

    public static void moreTwentyYears (HashSet<Person> pers) {
        System.out.println("\nPerson кто старше 20 лет");
        for (Person item: pers) {
            if (item.age > 20) {
                System.out.println(item);
            }
        }
    }
}