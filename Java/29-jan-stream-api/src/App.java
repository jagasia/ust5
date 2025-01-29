import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<String> countries = Arrays.asList("Nepal","Bhutan","Germany","Pakistan","Sri lanka","India", "Australia");
//		List<String> result = countries.stream()
//		.map((c)->c.toUpperCase())
//		.collect(Collectors.toList());
//		
		
		
		countries.stream()
		.map((c)->c.toUpperCase())
		.forEach(System.out::println);
	}

}
