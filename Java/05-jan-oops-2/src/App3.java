
public class App3 {

	public void display(int num) {
		System.out.println(num);
	}
	
	public void display(int num, String name) {
		display(num);
		System.out.println(name);
	}
	
	public void display(int num, String name, int age) {
		display(num, name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		App3 app3=new App3();
		app3.display(1, "Raja", 22);
		
	}

}
