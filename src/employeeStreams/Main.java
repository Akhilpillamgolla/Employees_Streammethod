package employeeStreams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "mani", 22, "Pat", "Cts", "Mtm", 25000),
				new Employee(2, "Akhil", 23, "Associate", "IBM", "Hyd", 27000),
				new Employee(3, "indu", 24, "Pat", "TCS", "Vij", 30000),
				new Employee(4, "manu", 25, "Pat", "IBM", "Vij", 17000),
				new Employee(5, "sravani", 26, "Pat", "Cts", "Mtm", 19000),
				new Employee(6, "Ram", 23, "Pat", "IBM", "Hyd", 29000),
				new Employee(7, "Jack", 27, "Pat", "Cts", "Hyd", 15000),
				new Employee(8, "Gopi", 30, "Pat", "Cts", "Hyd", 15000),
				new Employee(9, "Rajesh", 35, "Pat", "Cts", "Hyd", 32000),
				new Employee(10, "Raju", 33, "Pat", "IBM", "Ban", 18000));

		// for (Employee employee : employees) {
		// System.out.println(employee);
		// }

		Map<String, List<Employee>> groupByCity = employees.stream().filter(e -> e.getCity().equalsIgnoreCase("Hyd"))
				.collect(Collectors.groupingBy(Employee::getCity));

		groupByCity.forEach((city, employeeList) -> {
			System.out.println("From " + city + ":"+"\n");
			employeeList.forEach(System.out::println);
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
		});

		Map<String, List<Employee>> groupByCompany = employees.stream()
				.filter(e -> e.getCompany().equalsIgnoreCase("IBM"))
				.collect(Collectors.groupingBy(Employee::getCompany));

		groupByCompany.forEach((CompanyName, employeeList) -> {
			System.out.println("From " + CompanyName + ":"+"\n");
			employeeList.forEach(System.out::println);
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
		});
		
		System.out.println("Employee  whose age is between 20 & 25 : "+"\n");
		for (Employee emp : employees) {
		    if (emp.getAge() >= 20 && emp.getAge() <= 25) {
		        System.out.println(emp);
		    }
		}
		
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");

		Map<String, List<Employee>> groupByName = employees.stream().filter(e -> e.getName().startsWith("R")) //
				.collect(Collectors.groupingBy(Employee::getName)); //

		groupByName.forEach((SearchName, employeeList) -> {
			System.out.println("Searching Name with R  ->  " + SearchName + ":"+"\n");
			employeeList.forEach(System.out::println);
			
			System.out.println(
					"*************************************************************************************************");
		}
		
		
				);
		
		                       // or 
		
//		Map<String, List<Employee>> groupByNameAscending = employees.stream()
//		        .filter(e -> e.getName().startsWith("R"))
//		        .sorted(Comparator.comparing(Employee::getName))
//		        .collect(Collectors.groupingBy(Employee::getName));
//
//		groupByNameAscending.forEach((searchName, employeeList) -> {
//		    System.out.println("Searching Name with R -> " + searchName + ":");
//		    employeeList.forEach(System.out::println);
//
//		    System.out.println("--------------------------------------------------------------------");
//		});

		System.out.println("Employee  whose salary is greater than 20k : "+"\n");
		 employees.stream().filter(emp->emp.getSalary() > 20000).forEach(System.out::println);

		 System.out.println(
					"----------------------------------------------------------------------------------------------------------");
	}
	

	

}
