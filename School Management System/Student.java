import java.util.ArrayList;
import java.util.List;

public class Student  extends Person {
    private int grade;
    private int feesPaid;
    private final int feesTotal;

    public Student(String firstName, String lastName, String gender, int age, int grade) {
        super(firstName, lastName, gender, age);
        this.feesPaid = 0;
        this.feesTotal=30000;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public void updateFessPaid(int fees) {
        feesPaid += fees;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    @Override
    public List<String> getInfo() {
        List<String> info = new ArrayList<>();
        info.add("Student Name: " + getFirstName() + " " + getLastName());
        return info;
    }
}
