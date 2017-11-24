package annotation;

import java.lang.reflect.Method;

public class Container {

	public void process(String url, String httpMethod) throws Exception
	{
		Class<?> compClazz = Class.forName("annotation.Component");
		Object instance = compClazz.newInstance();
		
		Method[] methods = compClazz.getMethods();
		for(Method method : methods)
		{
			URLMapping urlMapping = method.getAnnotation(URLMapping.class);
			if(urlMapping != null)
			{
				String urlValue = urlMapping.url();
				if(url.equals(urlValue))
				{
					method.invoke(instance, new Object[] {});
				}
			}
		}
	}
}
