
public class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    public void displayDetails() {
    	 System.out.printf("| %-5d | %-15s | %-10.2f |\n", id, name, salary);

	}
}
