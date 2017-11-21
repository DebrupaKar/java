import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App 
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("Nag", LocalDate.of(1983, 10, 02), 10000, Gender.M);
		Employee e2 = new Employee("Anmol", LocalDate.of(1984, 11, 03), 20000, Gender.F);
		Employee e3 = new Employee("Arushi", LocalDate.of(1985, 01, 04), 30000, Gender.M);
		Employee e4 = new Employee("Rishi", LocalDate.of(1986, 02, 05), 40000, Gender.F);
		
		List<Employee> el = Arrays.asList(e1,e2,e3,e4);
		
		ItemLib lib = new ItemLib();
		
		//lib.forEach(el, System.out::println);
		//lib.forEach(el,item -> System.out.println(item.getName()));
		
		//List<String> mapList = lib.map(el, item -> item.getName());
		//lib.forEach(mapList,System.out::println);
		
		
		//List<Integer> mapList = lib.map(el, item -> item.getSalary());
		//lib.forEach(mapList,System.out::println);
		
		List<Integer> mapList = lib.map(el, item -> item.getSalary());
		lib.forEach(mapList,System.out::println);
		
		
		
		//List<Employee> filterList = lib.filter(el, item -> item.getSalary()>20000);
		//lib.forEach(filterList,System.out::println);
		//lib.forEach(filterList,item -> System.out.println(item.getName()));
		
	
	}	
}
