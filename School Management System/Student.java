public class Student {
    private final int id;
    private final String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal=30000;

        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFessPaid(int fees) {
        feesPaid += fees;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }
}
