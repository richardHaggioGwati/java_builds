import java.util.List;
import java.util.UUID;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final String personId;
    private final int age;


    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.personId = UUID.randomUUID().toString();;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return this.personId;
    }

    public int getAge() {
        return age;
    }

    public List<String> getInfo() {
        return null;
    }
}
