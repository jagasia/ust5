import java.util.Scanner;

public class AppFactory {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape s=null;
		do
		{
			System.out.println("Which shape you want to draw? (Press 0 to exit)");
			String choic=sc.next();
			if(choic.equals("0"))
					return;
			Shape shape = ShapeFactory.getShape(choic);
			shape.draw();
		}while(true);
	}

}
