
@Purpose
public class Product {

//	@Purpose		not allowed here based on target type
	
	
	
	public void display()
	{
		System.out.println("Product display");
	}

	@Override
	@Deprecated
	public String toString() {
		return "Product [toString()=" + super.toString() + "]";
	}
}
