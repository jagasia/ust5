
public class ShapeFactory {
	public static Shape getShape(String type)
	{
		Shape obj=null;
		switch(type.toLowerCase())
		{
		case "triangle":
			obj=new Triangle();
			break;
		case "rectangle":
			obj=new Rectangle();
			break;
		case "circle":
			obj=new Ciricle();
			break;
		}
		return obj;
	}
}
