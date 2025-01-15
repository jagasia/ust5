
public class App {

	public static void main(String[] args) {
		Element<Integer> e1=new Element<>();
		e1.setValue(100);
//		e1.setValue("Raja");	Error
		//so, generics provide type safety
		
		System.out.println(e1.getValue());
		
		Element<String> e2=new Element<>();
		e2.setValue("Australia");
		
		System.out.println(e2.getValue());
		System.out.println(e1.add(2, 3));
		System.out.println(e2.add("Raja", "Sivakumar"));
	}

}
