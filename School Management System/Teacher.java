public class Teacher {
    private final int id;
    private double salary;
    private final String name;

    public Teacher(int id, double salary, String name) {
            this.id = id;
            this.name = name;
            this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
