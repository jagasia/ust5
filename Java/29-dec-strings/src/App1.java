
public class App1 {

	public static void main(String[] args) {
		String str1="hello";
		//String is immutable means, we cannot change the value
		//do you know String is a class
		
		Employee e1=new Employee();
		Employee e2=e1;	//what is e1? is it value? no, it is object
		Employee e3=new Employee();
		e2=e3;		//we cant say we changed value, we changed reference
		
		//so "hello" is a String literal or object but not value
		str1="world";		//we have not changed value, but reference
		
		StringBuilder sb=new StringBuilder();
		//sb has nothing inside		""
		sb.append("This is a sentence");
		sb.replace(5, 7, "was");
		System.out.println(sb.toString());	//This was a sentence
		
		String str2="This is a sentence";
		str2="This was a sentence";
		//here, we have not changed the value, we changed the reference
	}
//		'h'	is a value	of char type
	//	char c='e';		//e is a value
}
