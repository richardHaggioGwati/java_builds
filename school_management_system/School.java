import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private double totalMoneyEarned;
    private double totalMoneySpent;

    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher) ;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(double moneyEarned) {
        this.totalMoneyEarned += moneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(double moneySpent) {
        this.totalMoneySpent -= moneySpent;
    }
}
