import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> countries=new HashSet<>();
		countries.add("China");
		countries.add("Japan");
		countries.add("India");
		countries.add("China");			//this entry is rejected
		countries.add("Australia");
		
		System.out.println(countries.size()); 	//what will be output?
		
	}

}
