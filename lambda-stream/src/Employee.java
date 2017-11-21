import java.time.LocalDate;

public class Employee {
	private String name;
	private LocalDate dob;
	private int salary;
	private Gender gender;

	public Employee(String name, LocalDate dob, int salary, Gender gender) 
	{
		super();
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.gender = gender;

	};
	
	public Employee()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
	
}

enum Gender
{
	M,F
}


