package annotation;

@URLMapping
public class Component 
{
	@URLMapping
	public void doSomething()
	{
		System.out.println("/");
	}
	
	@URLMapping(url = "/register", method = HttpMethod.POST)
	public void register()
	{
		System.out.println("/register");
	}
	
	@URLMapping(url = "/login", method = HttpMethod.GET)
	public void showLoginForm()
	{
		System.out.println("/login");
	}
	
	@URLMapping(url = "/login", method = HttpMethod.POST)
	public void login()
	{
		System.out.println("/login");
	}
}
