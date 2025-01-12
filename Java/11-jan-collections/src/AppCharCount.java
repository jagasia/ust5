import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AppCharCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(char c : input.toCharArray())
		{
			//check if this char is found in map
			//not found?	1st occurrence, so count=1
			//found?		existing count +1
			Integer value=0;
//			if(map.containsKey(c))
//			{
//				value=map.get(c)+1;
//			}else
//			{
//				value=1;
//			}
//			map.put(c, value);
			

			//the above can be simplified as :-
//			value=map.get(c);		//you get null if key not found
//			if(value==null)
//				value=0;
//			value++;
//			map.put(c, value);

			
			//the above can further be simplified as :-
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		//lets display the map
		//how to iterate a map?
		//map is not iterable like an array, list, set
		//so, we need to obtain the keys as a set and then iterate that set
		//or, we can obtain the entries as a set and then iterate that set
		// in both above cases, we can also use for each loop
		
//		for(Character key:map.keySet())
//		{
//			System.out.println(key+"\t"+map.get(key));
//		}
		
		for(Entry<Character, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
		
		
		
		
		
	}

}




//char[] carr = input.toCharArray();
//for(char c : carr)
//{}


//for(int i=0;i<input.length();i++)
//{
//	char c = input.charAt(i);
//	System.out.println(c);
//}
