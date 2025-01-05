import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Furniture f=null;
		//do you want chair or bookshelf? lets ask user
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Chair\r\n"
				+ "2: Bookshelf\r\n"
				+ "3: Exit");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			f=new Chair();	
			f.roll();		//not visible. why?
			break;
		case 2:
			f=new BookShelf();
			break;
		case 3:
			return;
		}
		f.acceptDetails();		
		f.displayDetails();
	}

}
