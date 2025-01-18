import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Purchase");
		int n=sc.nextInt();
		List<Purchase> purchaseList=new ArrayList<>();
		List<Item> itemList = Item.prefill();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter purchase detail "+i);
			String purchaseDetail=sc.nextLine();
			if(purchaseDetail.equals(""))
				purchaseDetail=sc.nextLine();
			String[] arr = purchaseDetail.split(",");
//			1,FIRST,12-02-2018
			Purchase purchase=new Purchase();
			purchase.setId(Integer.valueOf(arr[0]));
			purchase.setCouponCode(arr[1]);
			
			purchase.setPurchaseDate(sdf.parse(arr[2]));
			System.out.println("Enter the number of Orders");
			int noOfOrders=sc.nextInt();
			for(int j=0;j<noOfOrders;j++)
			{
				String orderDetail=sc.nextLine();
				if(orderDetail.equals(""))
					orderDetail=sc.nextLine();
				arr=orderDetail.split(",");
//				2,Grill
				Order order=new Order();
				order.setQuantity(Integer.valueOf(arr[0]));
				//arr[1] is the name of item. Using that name, find the item object from itemList
				for(Item item:itemList)
				{
					if(item.getName().equals(arr[1]))
					{
						order.setItem(item);
						break;
					}
				}
				purchase.getOrderList().add(order);
			}
			
			purchaseList.add(purchase);
		}
		Purchase.computePrice(purchaseList);
		
		System.out.format("%-5s %-10s %-12s %s\n","Id","Price","Coupon Code","Purchase Date");
		for(Purchase p:purchaseList)
			System.out.format("%-5s %-10s %-12s %s\n",p.getId(),p.getPrice(),p.getCouponCode(),sdf.format(p.getPurchaseDate()));
	}

}
