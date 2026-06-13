import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Salary");
            System.out.println("5. Display All Employees");
            System.out.println("6. Find Highest Paid Employee");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        System.out.print("Enter Joining Year: ");
                        int year = sc.nextInt();

                        System.out.print("Enter Joining Month: ");
                        int month = sc.nextInt();

                        System.out.print("Enter Joining Day: ");
                        int day = sc.nextInt();

                        Employee emp = new Employee(
                                id,
                                name,
                                department,
                                salary,
                                LocalDate.of(year, month, day)
                        );

                        EmployeeManagement.addEmployee(emp);
                        break;

                    case 2:

                        System.out.print("Enter Employee ID: ");
                        id = sc.nextInt();

                        EmployeeManagement.removeEmployee(id);
                        break;

                    case 3:

                        System.out.print("Enter Employee ID: ");
                        id = sc.nextInt();

                        EmployeeManagement.searchEmployee(id);
                        break;

                    case 4:

                        System.out.print("Enter Employee ID: ");
                        id = sc.nextInt();

                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();

                        EmployeeManagement.updateSalary(id, newSalary);
                        break;

                    case 5:

                        EmployeeManagement.displayEmployees();
                        break;

                    case 6:

                        EmployeeManagement.findHighestPaidEmployee();
                        break;

                    case 7:

                        System.out.println("Thank You!");
                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice!");
                }

            } catch (EmployeeNotFoundException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}