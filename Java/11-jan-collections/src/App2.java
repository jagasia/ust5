
public class App2 {

	public static void main(String[] args) {
//		Person raja=new Student();
//		raja.speak();

		
		Person suresh=new Person() {
			
			@Override
			public void speak() {
				System.out.println("Suresh speaks");
			}
		};
		
		suresh.speak();
		
		Person raja=()->{
			System.out.println("Raja speaks");
		};
		
		raja.speak();
	}

}
