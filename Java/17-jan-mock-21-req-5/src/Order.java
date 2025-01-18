
public class Order {
	private Integer quantity;
	private Item item;
	
	public Order() {}

	public Order(Integer quantity, Item item) {
		super();
		this.quantity = quantity;
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
