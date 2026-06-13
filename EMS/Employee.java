import java.time.LocalDate;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;

    public Employee(int id, String name, String department,
                    double salary, LocalDate joiningDate) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Salary: " + salary +
                ", Joining Date: " + joiningDate;
    }
}