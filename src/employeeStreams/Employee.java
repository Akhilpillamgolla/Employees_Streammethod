package employeeStreams;

public class Employee {
	private int Sno;
	private String Name;
	private int Age;
	private String Job;
	private String Company;
	private String City;
	private int Salary;
	
	public Employee(int Sno, String Name, int Age, String Job, String Company, String City, int Salary) {
		this.Sno = Sno;
	    this.Name = Name;
		this.Age = Age;
		this.Job = Job;
		this.Company = Company;
		this.City = City;
		this.Salary = Salary;
}
	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Sno = " + Sno + ", Name = " + Name + ", Age = " + Age + ", Job = " + Job + ", Company = " + Company
				+ ", City = " + City + ", Salary = " + Salary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}
	
	