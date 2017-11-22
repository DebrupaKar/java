import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeTotal 
{
	public static void main(String[] args) 
	{	
		Map<String,Integer> map = new HashMap<>();
		
		String[] arr = {"A,IT,2000","B,HR,3000","C,IT,4000","D,SALES,5000","E,SALES,6000"};
		
		for(int i=0; i<arr.length; i++)
		{
			String[] s = arr[i].split(",");
			String dep = s[1];
			int salary = Integer.parseInt(s[2]);
			
			if(map.containsKey(dep)) 
			{
				int total = map.get(dep);
				map.put(dep, total+salary);
			}
			
			else
			{
				map.put(dep, salary);
			}
		}	
	}
}
