package csi405.Homework1.Part1;

public class Employee {
	private String firstName, lastName; // employee's first and last names
	private double salary; // employee's salary

	// constructor, no arguments
	public Employee() {
		firstName = lastName = "";
		salary = 0.0;
	}

	// constructor, arguments are employee's first name as String, last name as String, and salary as double
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// this function sets the employee's first name to the String argument
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// this function sets the employee's last name to the String argument
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// this function sets the employee's salary to the double argument
	public void setSalary(double salary) {
		if (salary > 0) { // if the input is positive, accept the argument
			this.salary = salary;
		}
		else { // if the input is not positive, set salary to zero
			this.salary = 0.0;
		}
	}

	// this function returns the employee's first name as String
	public String getFirstName() {
		return firstName;
	}

	// this function returns the employee's last name as String
	public String getLastName() {
		return lastName;
	}

	// this function returns the employee's salary as double
	public double getSalary() {
		return salary;
	}
}
