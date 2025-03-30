
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeManagement {
	public static void main(String[] args) {
    	ArrayList<Employee> employee = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);     
        for (int i = 0; i <3; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            employee.add(new Employee(id, name, salary));
        }
        System.out.printf("\n%s********** Employee Details **********%s\n", "\u001B[34m","\u001B[0m");
        System.out.println("+-------+-----------------+------------+");
        System.out.printf("| %-5s | %-15s | %-10s |\n", "ID", "Name", "Salary");
        System.out.println("+-------+-----------------+------------+");
        for (Employee e : employee) {
            e.displayDetails();
        }
        System.out.println("+-------+-----------------+------------+");
        scanner.close(); // Close scanner
    }	

}
