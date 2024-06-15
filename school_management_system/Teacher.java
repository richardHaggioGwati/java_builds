import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private final String subject;
    private double salary;

    public Teacher(String firstName, String lastName, String gender, int age, String subject) {
        super(firstName, lastName, gender, age);
        this.subject = subject;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public List<String> getInfo() {
        List<String> info = new ArrayList<>();
        info.add("Teacher Name: " + getFirstName() + " " + getLastName());
        return info;
    }
}
