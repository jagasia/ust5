import java.util.ArrayList;
import java.util.List;

public class Item {
	private String name;
	private Double price;
	private String type;
	
	public Item() {}

	public Item(String name, Double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static List<Item> prefill(){
		List<Item> list = new ArrayList<>();
		list.add(new Item("Paneer Fried Rice",Double.parseDouble("150"),"Veg"));
		list.add(new Item("Chicken Fried Rice",Double.parseDouble("210"),"NonVeg"));
		list.add(new Item("Bucket Chicken",Double.parseDouble("479"),"Veg"));
		list.add(new Item("Ghee Roast",Double.parseDouble("75"),"Veg"));
		list.add(new Item("Masal Roast",Double.parseDouble("65"),"Veg"));
		list.add(new Item("Grill",Double.parseDouble("250"),"NonVeg"));
		list.add(new Item("Tomato Soup",Double.parseDouble("100"),"Veg"));
		list.add(new Item("Prawn Fry",Double.parseDouble("185"),"NonVeg"));
		list.add(new Item("Mushroom Briyani",Double.parseDouble("140"),"Veg"));
		list.add(new Item("Baby Corn Chilli",Double.parseDouble("80"),"Veg"));
		list.add(new Item("Barbeque Chicken",Double.parseDouble("400"),"NonVeg"));
		list.add(new Item("Veg Extravaganza",Double.parseDouble("99"),"Veg"));
		list.add(new Item("Margherita",Double.parseDouble("399"),"Veg"));
		list.add(new Item("Tandoori Chicken",Double.parseDouble("500"),"NonVeg"));
		list.add(new Item("Mutton Balls",Double.parseDouble("90"),"NonVeg"));
		return list;
		}

}
