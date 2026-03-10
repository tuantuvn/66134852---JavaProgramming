
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	public int salary;
	public Employee(int id, String firstName, String lastName,int salery) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
		
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
        return firstName;
    }
	public String getName() {
        return firstName + " " + lastName;
    }
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int raiseSalary(int percent) {
		salary = salary + salary * percent / 100;
        return salary;
	}
	public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
