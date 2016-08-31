package csi405.Homework1.Part1;

public class EmployeeTest {
	public static void main(String [] args) {
		// declarations
		Employee employeeA = new Employee("Fred", "Smith", 30000.0); // create new employee, name Fred Smith, salary 30000
		Employee employeeB = new Employee("Joe", "Bob", 50000.0); // create new employee, name Joe Bob, salary 50000

		// body
		// print each employee's information
		System.out.printf("%s %s's salary is $%f.\n", employeeA.getFirstName(), employeeA.getLastName(), employeeA.getSalary());
		System.out.printf("%s %s's salary is $%f.\n", employeeB.getFirstName(), employeeB.getLastName(), employeeB.getSalary());

		// give each employee a raise
		employeeA.setSalary(employeeA.getSalary() * 1.1);
		employeeB.setSalary(employeeB.getSalary() * 1.1);
		System.out.printf("Both employees receive a raise!\n");

		// print each employee's new information
		System.out.printf("%s %s's salary is $%f.\n", employeeA.getFirstName(), employeeA.getLastName(), employeeA.getSalary());
		System.out.printf("%s %s's salary is $%f.\n", employeeB.getFirstName(), employeeB.getLastName(), employeeB.getSalary());
	}
}
