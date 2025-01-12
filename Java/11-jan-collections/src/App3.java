
public class App3 {

	public static void main(String[] args) {
		Employee e=new Employee();
//		Person p=()->{};		//here only we provide impl code
		Person p=e::work;		//we make use of existing method
		
		p.speak();
	}

}
