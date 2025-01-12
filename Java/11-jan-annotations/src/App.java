import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		Annotation[] arr = Product.class.getAnnotations();
		
		for(Annotation a:arr)
			System.out.println(a);
		
		//now for method level
		Method[] methods = Product.class.getMethods();
		for(Method m:methods)
		{
			if(m.getName().equals("toString"))
			{
				Annotation[] ans = m.getAnnotations();
				for(Annotation a:ans)
					System.out.println(a);
			}
		}
	}

}
