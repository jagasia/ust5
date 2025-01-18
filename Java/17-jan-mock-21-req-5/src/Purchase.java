import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase {
	private Integer id;
	private Double price;
	private String couponCode;
	private Date purchaseDate;
	private List<Order> orderList;
	
	public Purchase() {
		orderList=new ArrayList<>();
	}

	public Purchase(Integer id, Double price, String couponCode, Date purchaseDate, List<Order> orderList) {
		super();
		this.id = id;
		this.price = price;
		this.couponCode = couponCode;
		this.purchaseDate = purchaseDate;
		this.orderList = orderList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	public static void computePrice(List<Purchase> list)
	{
		for(Purchase purchase: list)
		{
			Double purchasePrice=0.0;
			for(Order order:purchase.getOrderList())
			{
				//find the order value	quantity * item.price
				Double orderValue=order.getQuantity()*order.getItem().getPrice();
				purchasePrice+=orderValue;
			}
			
//			FIRST	Rs.100 discount
//			BUYFIVE	Rs.500 discount
//			ORDER50	50% discount
//			ORDER75	75% discount
//			DEAL25	25% discount
//			CHICKEN70	70% discount

			switch(purchase.getCouponCode())
			{
			case "FIRST":		//100 rs discount
				purchasePrice-=100;
				break;
			case "BUYFIVE":		//500 rs discount
				purchasePrice-=500;
				break;
			case "ORDER50":		//50% discount
				purchasePrice-=purchasePrice*.5;
				break;
			case "ORDER75":		//75% discount
				purchasePrice-=purchasePrice*.75;
				break;
			case "DEAL25":		//25% discount
				purchasePrice-=purchasePrice*.25;
				break;
			case "CHICKEN70":	//70% discount
				purchasePrice-=purchasePrice*.70;
				break;
			}
			
			purchase.setPrice(purchasePrice);
		}
	}
}
