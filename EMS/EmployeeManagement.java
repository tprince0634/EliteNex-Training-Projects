import java.util.ArrayList;

public class EmployeeManagement {

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee Added Successfully!");
    }

    public static void removeEmployee(int id)
            throws EmployeeNotFoundException {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee Removed Successfully!");
                return;
            }
        }

        throw new EmployeeNotFoundException(
                "Employee with ID " + id + " not found."
        );
    }

    public static void searchEmployee(int id)
            throws EmployeeNotFoundException {

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                System.out.println(emp);
                return;
            }
        }

        throw new EmployeeNotFoundException(
                "Employee with ID " + id + " not found."
        );
    }

    public static void updateSalary(int id, double newSalary)
            throws EmployeeNotFoundException {

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                emp.setSalary(newSalary);
                System.out.println("Salary Updated Successfully!");
                return;
            }
        }

        throw new EmployeeNotFoundException(
                "Employee with ID " + id + " not found."
        );
    }

    public static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employees Found!");
            return;
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static void findHighestPaidEmployee() {

        if (employees.isEmpty()) {
            System.out.println("No Employees Found!");
            return;
        }

        Employee highest = employees.get(0);

        for (Employee emp : employees) {

            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }

        System.out.println("\nHighest Paid Employee:");
        System.out.println(highest);
    }
}