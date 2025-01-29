
public class App {

	public static void main(String[] args) {
		Mathematics m=null;
		m=new Addition();
		System.out.println(m.calculate(12, 3));
		m=new Subtraction();
		System.out.println(m.calculate(12, 3));
		m=new Multiplication();
		System.out.println(m.calculate(12, 3));
		
		m=(x,y)->x/y;	//no error
		System.out.println(m.calculate(12, 3));
	}

}
